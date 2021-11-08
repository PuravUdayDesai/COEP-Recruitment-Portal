package org.coep.recruitment.portal.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.coep.recruitment.portal.SpringApplicationContext;
import org.coep.recruitment.portal.service.ApplicantService;
import org.coep.recruitment.portal.shared.dto.ApplicantDto;
import org.coep.recruitment.portal.ui.model.request.ApplicantSignInRequestModel;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter
{

	private final AuthenticationManager authenticationManager;

	public AuthenticationFilter(AuthenticationManager authenticationManager)
	{
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException
	{
		try
		{
			ApplicantSignInRequestModel creds = new ObjectMapper().readValue(request.getInputStream(), ApplicantSignInRequestModel.class);

			return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(creds.getUsername(),
					creds.getPassword(), new ArrayList<>()));

		} catch (IOException ioe)
		{
			throw new RuntimeException(ioe);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException
	{
		String userName = ((User) authResult.getPrincipal()).getUsername();

		String token = Jwts.builder()
							.setSubject(userName)
							.setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
							.signWith(SignatureAlgorithm.HS512, SecurityConstants.getTokenSecret())
							.compact();

		ApplicantService applicantService = (ApplicantService) SpringApplicationContext.getBean("applicantServiceImpl");
		ApplicantDto     applicantDto     = applicantService.getUser(userName);

		response.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + token);
		response.addHeader("ApplicantId", applicantDto.getApplicantId());
	}

}
