package org.coep.recruitment.portal.shared.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class ApplicantPersonalDetailsDto implements Serializable
{
	private static final long serialVersionUID = -608245525660667999L;
	private Long              id;
	private Long              applicantId;
	private String            firstName;
	private String            middleName;
	private String            lastName;
	private Boolean           gender;
	private Boolean           maritalStatus;
	private String            contactNumber;
	private String            emailId;
	private Timestamp         dateofBirth;
	private String            permanentAddressLine1;
	private String            permanentAddressLine2;
	private String            permanentAddressLine3;
	private String            currentAddressLine1;
	private String            currentAddressLine2;
	private String            currentAddressLine3;
	private String            applicantImageFile;

	public ApplicantPersonalDetailsDto()
	{
		super();
	}

	public ApplicantPersonalDetailsDto(Long id, Long applicantId, String firstName, String middleName, String lastName,
			Boolean gender, Boolean maritalStatus, String contactNumber, String emailId, Timestamp dateofBirth,
			String permanentAddressLine1, String permanentAddressLine2, String permanentAddressLine3,
			String currentAddressLine1, String currentAddressLine2, String currentAddressLine3,
			String applicantImageFile)
	{
		super();
		this.id = id;
		this.applicantId = applicantId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.dateofBirth = dateofBirth;
		this.permanentAddressLine1 = permanentAddressLine1;
		this.permanentAddressLine2 = permanentAddressLine2;
		this.permanentAddressLine3 = permanentAddressLine3;
		this.currentAddressLine1 = currentAddressLine1;
		this.currentAddressLine2 = currentAddressLine2;
		this.currentAddressLine3 = currentAddressLine3;
		this.applicantImageFile = applicantImageFile;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getApplicant_id()
	{
		return applicantId;
	}

	public void setApplicant_id(Long applicantId)
	{
		this.applicantId = applicantId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Boolean getGender()
	{
		return gender;
	}

	public void setGender(Boolean gender)
	{
		this.gender = gender;
	}

	public Boolean getMaritalStatus()
	{
		return maritalStatus;
	}

	public void setMaritalStatus(Boolean maritalStatus)
	{
		this.maritalStatus = maritalStatus;
	}

	public String getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
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

	public Timestamp getDateofBirth()
	{
		return dateofBirth;
	}

	public void setDateofBirth(Timestamp dateofBirth)
	{
		this.dateofBirth = dateofBirth;
	}

	public String getPermanentAddressLine1()
	{
		return permanentAddressLine1;
	}

	public void setPermanentAddressLine1(String permanentAddressLine1)
	{
		this.permanentAddressLine1 = permanentAddressLine1;
	}

	public String getPermanentAddressLine2()
	{
		return permanentAddressLine2;
	}

	public void setPermanentAddressLine2(String permanentAddressLine2)
	{
		this.permanentAddressLine2 = permanentAddressLine2;
	}

	public String getPermanentAddressLine3()
	{
		return permanentAddressLine3;
	}

	public void setPermanentAddressLine3(String permanentAddressLine3)
	{
		this.permanentAddressLine3 = permanentAddressLine3;
	}

	public String getCurrentAddressLine1()
	{
		return currentAddressLine1;
	}

	public void setCurrentAddressLine1(String currentAddressLine1)
	{
		this.currentAddressLine1 = currentAddressLine1;
	}

	public String getCurrentAddressLine2()
	{
		return currentAddressLine2;
	}

	public void setCurrentAddressLine2(String currentAddressLine2)
	{
		this.currentAddressLine2 = currentAddressLine2;
	}

	public String getCurrentAddressLine3()
	{
		return currentAddressLine3;
	}

	public void setCurrentAddressLine3(String currentAddressLine3)
	{
		this.currentAddressLine3 = currentAddressLine3;
	}

	public String getApplicantImageFile()
	{
		return applicantImageFile;
	}

	public void setApplicantImageFile(String applicantImageFile)
	{
		this.applicantImageFile = applicantImageFile;
	}

}
