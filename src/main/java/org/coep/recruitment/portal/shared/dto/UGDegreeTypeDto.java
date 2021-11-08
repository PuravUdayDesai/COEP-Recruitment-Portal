package org.coep.recruitment.portal.shared.dto;

import java.io.Serializable;

public class UGDegreeTypeDto implements Serializable
{
	private static final long serialVersionUID = 7997415487934830319L;
	private Long              id;
	private String            ugDegreeTypeId;
	private String            ugDegreeTypeName;

	public UGDegreeTypeDto()
	{
		super();
	}

	public UGDegreeTypeDto(Long id, String ugDegreeTypeId, String ugDegreeTypeName)
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
