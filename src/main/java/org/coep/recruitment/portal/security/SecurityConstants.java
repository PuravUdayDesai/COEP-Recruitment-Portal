package org.coep.recruitment.portal.security;

import org.coep.recruitment.portal.SpringApplicationContext;

public class SecurityConstants
{
	public static final Long   EXPIRATION_TIME = 864000000L;        // 10 days
	public static final String TOKEN_PREFIX    = "Bearer ";
	public static final String HEADER_STRING   = "Authorization";
	public static final String SIGN_UP_URL     = "/applicant";
	public static final String SIGN_IN_URL     = "/applicant/login";

	public static String getTokenSecret()
	{
		AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
		return appProperties.getTokenSecret();
	}
}
