package org.coep.recruitment.portal.ui.model.request;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicantUGDetails
{
	@NotNull(message = "Degree Type Id should not be empty")
	private String    degreeTypeId;
	@NotNull(message = "College Name should not be empty")
	private String    collegeName;
	@NotNull(message = "Branch Id should not be empty")
	private String    branchId;
	@NotNull(message = "CGPA should not be empty")
	private Double    cgpa;
	@NotNull(message = "Grade Class Id should not be empty")
	private String    gradeClassId;
	@NotNull(message = "Date Of Joining should not be empty")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "IST")
	private Timestamp dateOfJoining;
	@NotNull(message = "Date Of Graduation should not be empty")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "IST")
	private Timestamp dateOfGraduation;

	public ApplicantUGDetails()
	{
		super();
	}

	public ApplicantUGDetails(@NotNull(message = "Degree Type Id should not be empty") String degreeTypeId,
			@NotNull(message = "College Name should not be empty") String collegeName,
			@NotNull(message = "Branch Id should not be empty") String branchId,
			@NotNull(message = "CGPA should not be empty") Double cgpa,
			@NotNull(message = "Grade Class Id should not be empty") String gradeClassId,
			@NotNull(message = "Date Of Joining should not be empty") Timestamp dateOfJoining,
			@NotNull(message = "Date Of Graduation should not be empty") Timestamp dateOfGraduation)
	{
		super();
		this.degreeTypeId = degreeTypeId;
		this.collegeName = collegeName;
		this.branchId = branchId;
		this.cgpa = cgpa;
		this.gradeClassId = gradeClassId;
		this.dateOfJoining = dateOfJoining;
		this.dateOfGraduation = dateOfGraduation;
	}

	public String getDegreeTypeId()
	{
		return degreeTypeId;
	}

	public void setDegreeTypeId(String degreeTypeId)
	{
		this.degreeTypeId = degreeTypeId;
	}

	public String getCollegeName()
	{
		return collegeName;
	}

	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}

	public String getBranchId()
	{
		return branchId;
	}

	public void setBranchId(String branchId)
	{
		this.branchId = branchId;
	}

	public Double getCgpa()
	{
		return cgpa;
	}

	public void setCgpa(Double cgpa)
	{
		this.cgpa = cgpa;
	}

	public String getGradeClassId()
	{
		return gradeClassId;
	}

	public void setGradeClassId(String gradeClassId)
	{
		this.gradeClassId = gradeClassId;
	}

	public Timestamp getDateOfJoining()
	{
		return dateOfJoining;
	}

	public void setDateOfJoining(Timestamp dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
	}

	public Timestamp getDateOfGraduation()
	{
		return dateOfGraduation;
	}

	public void setDateOfGraduation(Timestamp dateOfGraduation)
	{
		this.dateOfGraduation = dateOfGraduation;
	}

}
