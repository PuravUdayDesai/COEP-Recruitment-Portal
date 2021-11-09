package org.coep.recruitment.portal.shared.dto;

import java.io.Serializable;

public class ApplicantDto implements Serializable
{

	private static final long serialVersionUID        = -9187532432900924519L;
	private Long              id;
	private String            applicantId;
	private String            username;
	private String            emailId;
	private String            contactNumber;
	private String            password;
	private String            encryptedPassword;
	private String            emailVerificationToken;
	private Boolean           emailVerificationStatus = false;

	public ApplicantDto()
	{
		super();
	}

	public ApplicantDto(Long id, String applicantId, String username, String emailId, String contactNumber,
			String password, String encryptedPassword, String emailVerificationToken, Boolean emailVerificationStatus)
	{
		super();
		this.id = id;
		this.applicantId = applicantId;
		this.username = username;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
		this.emailVerificationToken = emailVerificationToken;
		this.emailVerificationStatus = emailVerificationStatus;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getApplicantId()
	{
		return applicantId;
	}

	public void setApplicantId(String applicantId)
	{
		this.applicantId = applicantId;
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

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEncryptedPassword()
	{
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword)
	{
		this.encryptedPassword = encryptedPassword;
	}

	public Boolean getEmailVerificationStatus()
	{
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(Boolean emailVerificationStatus)
	{
		this.emailVerificationStatus = emailVerificationStatus;
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
