package org.coep.recruitment.portal.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "branch")
public class BranchEntity implements Serializable
{
	private static final long serialVersionUID = 8955329677736088720L;
	@Id
	@GeneratedValue
	private Long              id;
	@Column(name = "branch_id", nullable = false)
	private String            branchId;
	@Column(name = "branch_name", nullable = false, unique = true)
	private String            branchName;

	public BranchEntity()
	{
		super();
	}

	public BranchEntity(Long id, String branchId, String branchName)
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