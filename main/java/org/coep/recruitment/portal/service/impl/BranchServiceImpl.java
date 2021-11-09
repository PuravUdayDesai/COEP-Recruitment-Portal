package org.coep.recruitment.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.coep.recruitment.portal.io.entity.BranchEntity;
import org.coep.recruitment.portal.io.repository.BranchRepository;
import org.coep.recruitment.portal.service.BranchService;
import org.coep.recruitment.portal.shared.Utils;
import org.coep.recruitment.portal.shared.dto.BranchDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService
{
	
	@Autowired
	BranchRepository branchRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public List<BranchDto> getAllBranch()
	{
		Iterable<BranchEntity> branchEntity = branchRepository.findAll();
		
		List<BranchDto> branchList = new ArrayList<BranchDto>();
		
		branchEntity.forEach((branch) -> {
			BranchDto branchDto = new BranchDto();
			BeanUtils.copyProperties(branch, branchDto);
			branchList.add(branchDto);
		});
		
		return branchList;
	}

	@Override
	public BranchDto addBranch(String branchName)
	{
		BranchEntity branchEntity = new BranchEntity();
		branchEntity.setBranchId(utils.generateSecureRandom(30));
		branchEntity.setBranchName(branchName);
		
		BranchEntity registeredBranch = branchRepository.save(branchEntity);
		
		BranchDto returnValue = new BranchDto();
		BeanUtils.copyProperties(registeredBranch, returnValue);
		
		return returnValue;
	}

}
