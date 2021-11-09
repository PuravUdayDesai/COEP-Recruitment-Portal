package org.coep.recruitment.portal.ui.model.response;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ApplicantSignUpResponseModel
{
	@NotNull(message = "Username should not be empty")
	private String username;
	@NotNull(message = "Email should not be empty")
	@Email(message = "Email should be valid")
	private String emailId;
	@NotNull(message = "Contact Number should not be empty")
	@Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/", message = "Contact Number should be valid")
	private String contactNumber;
	@NotNull(message = "Email Verification Token should not be empty")
	private String emailVerificationToken;

	public ApplicantSignUpResponseModel()
	{
		super();
	}

	public ApplicantSignUpResponseModel(@NotNull(message = "Username should not be empty") String username,
			@NotNull(message = "Email should not be empty") @Email(message = "Email should be valid") String emailId,
			@NotNull(message = "Contact Number should not be empty") @Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/", message = "Contact Number should be valid") String contactNumber,
			@NotNull(message = "Email Verification Token should not be empty") String emailVerificationToken)
	{
		super();
		this.username = username;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.emailVerificationToken = emailVerificationToken;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	public String getEmailVerificationToken()
	{
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken)
	{
		this.emailVerificationToken = emailVerificationToken;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

}
