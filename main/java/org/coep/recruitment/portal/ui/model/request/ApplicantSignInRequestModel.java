package org.coep.recruitment.portal.ui.model.request;

import javax.validation.constraints.NotNull;

public class ApplicantSignInRequestModel
{
	@NotNull(message = "Username should not be empty")
	private String username;
	@NotNull(message = "Password should not be empty")
	private String password;

	public ApplicantSignInRequestModel()
	{
		super();
	}

	public ApplicantSignInRequestModel(@NotNull(message = "Username should not be empty") String username,
			@NotNull(message = "Password should not be empty") String password)
	{
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}
