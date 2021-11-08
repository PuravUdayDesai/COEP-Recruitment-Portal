package org.coep.recruitment.portal.ui.model.response;

public class BranchResponseModel
{
	private String branchId;
	private String branchName;
	
	public BranchResponseModel()
	{
		super();
	}

	public BranchResponseModel(String branchId, String branchName)
	{
		super();
		this.branchId = branchId;
		this.branchName = branchName;
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
