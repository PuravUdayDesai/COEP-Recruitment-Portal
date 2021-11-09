package org.coep.recruitment.portal.ui.model.request;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicantPersonalDetailsRequestModel
{

	@NotNull(message = "First Name should not be empty")
	private String    firstName;
	@NotNull(message = "Middle Name should not be empty")
	private String    middleName;
	@NotNull(message = "Last Name should not be empty")
	private String    lastName;
	@NotNull(message = "Gender should not be empty")
	private Boolean   gender;
	@NotNull(message = "Marital Status should not be empty")
	private Boolean   maritalStatus;
	@NotNull(message = "Date of Birth should not be empty")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "IST")
	private Timestamp dateofBirth;
	@NotNull(message = "Permanent Address Line1 should not be empty")
	private String    permanentAddressLine1;
	@NotNull(message = "Permanent Address Line2 should not be empty")
	private String    permanentAddressLine2;
	@NotNull(message = "Permanent Address Line3 should not be empty")
	private String    permanentAddressLine3;
	@NotNull(message = "Current Address Line1 should not be empty")
	private String    currentAddressLine1;
	@NotNull(message = "Current Address Line2 should not be empty")
	private String    currentAddressLine2;
	@NotNull(message = "Current Address Line3 should not be empty")
	private String    currentAddressLine3;

	public ApplicantPersonalDetailsRequestModel()
	{
		super();
	}

	public ApplicantPersonalDetailsRequestModel(
			@NotNull(message = "First Name should not be empty") String firstName,
			@NotNull(message = "Middle Name should not be empty") String middleName,
			@NotNull(message = "Last Name should not be empty") String lastName,
			@NotNull(message = "Gender should not be empty") Boolean gender,
			@NotNull(message = "Marital Status should not be empty") Boolean maritalStatus,
			@NotNull(message = "Date of Birth should not be empty") Timestamp dateofBirth,
			@NotNull(message = "Permanent Address Line1 should not be empty") String permanentAddressLine1,
			@NotNull(message = "Permanent Address Line2 should not be empty") String permanentAddressLine2,
			@NotNull(message = "Permanent Address Line3 should not be empty") String permanentAddressLine3,
			@NotNull(message = "Current Address Line1 should not be empty") String currentAddressLine1,
			@NotNull(message = "Current Address Line2 should not be empty") String currentAddressLine2,
			@NotNull(message = "Current Address Line3 should not be empty") String currentAddressLine3)
	{
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.dateofBirth = dateofBirth;
		this.permanentAddressLine1 = permanentAddressLine1;
		this.permanentAddressLine2 = permanentAddressLine2;
		this.permanentAddressLine3 = permanentAddressLine3;
		this.currentAddressLine1 = currentAddressLine1;
		this.currentAddressLine2 = currentAddressLine2;
		this.currentAddressLine3 = currentAddressLine3;
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
}
