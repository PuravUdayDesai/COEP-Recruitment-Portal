package org.coep.recruitment.portal.io.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "applicant_personal_details")
public class ApplicantPersonalDetailsEntity implements Serializable
{
	private static final long serialVersionUID = -4716041165786803624L;
	@Id
	@GeneratedValue
	private Long              applicantPersonalDetailsId;
	@Column(name = "first_name", nullable = false)
	private String            firstName;
	@Column(name = "middle_name", nullable = false)
	private String            middleName;
	@Column(name = "last_name", nullable = false)
	private String            lastName;
	@Column(name = "gender", nullable = false)
	private Boolean           gender;
	@Column(name = "marital_status", nullable = false)
	private Boolean           maritalStatus;
	@Column(name = "date_of_birth", nullable = false)
	private Timestamp         dateofBirth;
	@Column(name = "permanent_address_line1", nullable = false)
	private String            permanentAddressLine1;
	@Column(name = "permanent_address_line2", nullable = false)
	private String            permanentAddressLine2;
	@Column(name = "permanent_address_line3", nullable = false)
	private String            permanentAddressLine3;
	@Column(name = "current_address_line1", nullable = false)
	private String            currentAddressLine1;
	@Column(name = "current_address_line2", nullable = false)
	private String            currentAddressLine2;
	@Column(name = "current_address_line3", nullable = false)
	private String            currentAddressLine3;
	@Column(name = "applicant_image_file")
	private String            applicantImageFile;
	@Column(name = "date_of_birth_proof")
	private String            dateOfBirthProof;
	@OneToOne
	@JoinColumn(name = "applicant_id")
	private ApplicantEntity   applicant;

	public ApplicantPersonalDetailsEntity()
	{
		super();
	}

	public ApplicantPersonalDetailsEntity(Long applicantPersonalDetailsId, String firstName, String middleName,
			String lastName, Boolean gender, Boolean maritalStatus, Timestamp dateofBirth, String permanentAddressLine1,
			String permanentAddressLine2, String permanentAddressLine3, String currentAddressLine1,
			String currentAddressLine2, String currentAddressLine3, String applicantImageFile, String dateOfBirthProof,
			ApplicantEntity applicant)
	{
		super();
		this.applicantPersonalDetailsId = applicantPersonalDetailsId;
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
		this.applicantImageFile = applicantImageFile;
		this.dateOfBirthProof = dateOfBirthProof;
		this.applicant = applicant;
	}

	public Long getApplicantPersonalDetailsId()
	{
		return applicantPersonalDetailsId;
	}

	public void setApplicantPersonalDetailsId(Long applicantPersonalDetailsId)
	{
		this.applicantPersonalDetailsId = applicantPersonalDetailsId;
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

	public String getApplicantImageFile()
	{
		return applicantImageFile;
	}

	public void setApplicantImageFile(String applicantImageFile)
	{
		this.applicantImageFile = applicantImageFile;
	}

	public String getDateOfBirthProof()
	{
		return dateOfBirthProof;
	}

	public void setDateOfBirthProof(String dateOfBirthProof)
	{
		this.dateOfBirthProof = dateOfBirthProof;
	}

	public ApplicantEntity getApplicant()
	{
		return applicant;
	}

	public void setApplicant(ApplicantEntity applicant)
	{
		this.applicant = applicant;
	}

}
