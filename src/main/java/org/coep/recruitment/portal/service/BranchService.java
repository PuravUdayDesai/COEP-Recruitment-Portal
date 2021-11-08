package org.coep.recruitment.portal.service;

import java.util.List;

import org.coep.recruitment.portal.shared.dto.BranchDto;

public interface BranchService
{
	List<BranchDto> getAllBranch();

	BranchDto addBranch(String branchName);
}
