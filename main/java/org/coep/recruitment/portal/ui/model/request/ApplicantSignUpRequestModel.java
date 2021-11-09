package org.coep.recruitment.portal.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ApplicantSignUpRequestModel
{
	@NotNull(message = "Email should not be empty")
	@Email(message = "Email should be valid")
	private String emailId;
	@NotNull(message = "Contact Number should not be empty")
	@Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/", message = "Contact Number should be valid")
	private String contactNumber;

	public ApplicantSignUpRequestModel()
	{
		super();
	}

	public ApplicantSignUpRequestModel(
			@NotNull(message = "Email should not be empty") @Email(message = "Email should be valid") String emailId,
			@NotNull(message = "Contact Number should not be empty") @Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/", message = "Contact Number should be valid") String contactNumber)
	{
		super();
		this.emailId = emailId;
		this.contactNumber = contactNumber;
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

}
