package org.coep.recruitment.portal.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ug_degree_type")
public class UGDegreeTypeEntity implements Serializable
{
	private static final long serialVersionUID = 3603683835027406762L;
	@Id
	@GeneratedValue
	private Long              id;
	@Column(name = "up_degree_type_id", nullable = false)
	private String            ugDegreeTypeId;
	@Column(name = "up_degree_type_name", nullable = false, unique = true)
	private String            ugDegreeTypeName;

	public UGDegreeTypeEntity()
	{
		super();
	}

	public UGDegreeTypeEntity(Long id, String ugDegreeTypeId, String ugDegreeTypeName)
	{
		super();
		this.id = id;
		this.ugDegreeTypeId = ugDegreeTypeId;
		this.ugDegreeTypeName = ugDegreeTypeName;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getUgDegreeTypeId()
	{
		return ugDegreeTypeId;
	}

	public void setUgDegreeTypeId(String ugDegreeTypeId)
	{
		this.ugDegreeTypeId = ugDegreeTypeId;
	}

	public String getUgDegreeTypeName()
	{
		return ugDegreeTypeName;
	}

	public void setUgDegreeTypeName(String ugDegreeTypeName)
	{
		this.ugDegreeTypeName = ugDegreeTypeName;
	}

}
