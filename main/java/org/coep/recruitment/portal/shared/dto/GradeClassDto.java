package org.coep.recruitment.portal.shared.dto;

import java.io.Serializable;

public class GradeClassDto implements Serializable
{
	private static final long serialVersionUID = 4215760600757038665L;
	private Long              id;
	private String            gradeClassId;
	private String            gradeClassName;

	public GradeClassDto()
	{
		super();
	}

	public GradeClassDto(Long id, String gradeClassId, String gradeClassName)
	{
		super();
		this.id = id;
		this.gradeClassId = gradeClassId;
		this.gradeClassName = gradeClassName;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
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
