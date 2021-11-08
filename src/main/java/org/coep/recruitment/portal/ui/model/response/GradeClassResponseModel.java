package org.coep.recruitment.portal.ui.model.response;

public class GradeClassResponseModel
{
	private String gradeClassId;
	private String gradeClassName;

	public GradeClassResponseModel()
	{
		super();
	}

	public GradeClassResponseModel(String gradeClassId, String gradeClassName)
	{
		super();
		this.gradeClassId = gradeClassId;
		this.gradeClassName = gradeClassName;
	}

	public String getGradeClassId()
	{
		return gradeClassId;
	}

	public void setGradeClassId(String gradeClassId)
	{
		this.gradeClassId = gradeClassId;
	}

	public String getGradeClassName()
	{
		return gradeClassName;
	}

	public void setGradeClassName(String gradeClassName)
	{
		this.gradeClassName = gradeClassName;
	}

}
