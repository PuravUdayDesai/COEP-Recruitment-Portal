package org.coep.recruitment.portal.bl;

import java.util.ArrayList;
import java.util.List;

import org.coep.recruitment.portal.service.BranchService;
import org.coep.recruitment.portal.shared.dto.BranchDto;
import org.coep.recruitment.portal.ui.model.response.BranchResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BranchBusinessLogic
{
	@Autowired
	BranchService branchService;
	
	public List<BranchResponseModel> getAllBranch()
	{
		List<BranchDto> branchList = branchService.getAllBranch();
		List<BranchResponseModel> returnValue = new ArrayList<BranchResponseModel>();
		
		branchList.forEach((branch) -> {
			BranchResponseModel branchReturn = new BranchResponseModel();
			BeanUtils.copyProperties(branch, branchReturn);
			returnValue.add(branchReturn);
		});
		
		return returnValue;
	}
	
	public BranchResponseModel addBranch(String branchName)
	{
		BranchResponseModel returnValue = new BranchResponseModel();
		BranchDto branchDto = branchService.addBranch(branchName);
		BeanUtils.copyProperties(branchDto, returnValue);
		
		return returnValue;
	}
}
