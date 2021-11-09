package org.coep.recruitment.portal.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "grade_class")
public class GradeClassEntity implements Serializable
{
	private static final long serialVersionUID = -8494759150689125000L;
	@Id
	@GeneratedValue
	private Long              id;
	@Column(name = "grade_class_id", nullable = false)
	private String            gradeClassId;
	@Column(name = "grade_class_name", nullable = false, unique = true)
	private String            gradeClassName;
	

	public GradeClassEntity()
	{
		super();
	}

	public GradeClassEntity(Long id, String gradeClassId, String gradeClassName)
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
