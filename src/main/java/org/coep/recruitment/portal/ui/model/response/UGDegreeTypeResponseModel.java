package org.coep.recruitment.portal.ui.model.response;

public class UGDegreeTypeResponseModel
{
	private String ugDegreeTypeId;
	private String ugDegreeTypeName;

	public UGDegreeTypeResponseModel()
	{
		super();
	}

	public UGDegreeTypeResponseModel(String ugDegreeTypeId, String ugDegreeTypeName)
	{
		super();
		this.ugDegreeTypeId = ugDegreeTypeId;
		this.ugDegreeTypeName = ugDegreeTypeName;
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
