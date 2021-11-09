package org.coep.recruitment.portal.shared.dto;

import java.io.Serializable;

public class BranchDto implements Serializable
{
	private static final long serialVersionUID = 2950551611908543034L;
	private Long              id;
	private String            branchId;
	private String            branchName;

	public BranchDto()
	{
		super();
	}

	public BranchDto(Long id, String branchId, String branchName)
	{
		super();
		this.id = id;
		this.branchId = branchId;
		this.branchName = branchName;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getBranchId()
	{
		return branchId;
	}

	public void setBranchId(String branchId)
	{
		this.branchId = branchId;
	}

	public String getBranchName()
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

}
