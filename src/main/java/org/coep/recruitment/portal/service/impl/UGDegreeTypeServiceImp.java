package org.coep.recruitment.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.coep.recruitment.portal.io.entity.UGDegreeTypeEntity;
import org.coep.recruitment.portal.io.repository.UGDegreeTypeRepository;
import org.coep.recruitment.portal.service.UGDegreeTypeService;
import org.coep.recruitment.portal.shared.Utils;
import org.coep.recruitment.portal.shared.dto.UGDegreeTypeDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UGDegreeTypeServiceImp implements UGDegreeTypeService
{
	@Autowired
	UGDegreeTypeRepository ugDegreeTypeRepository;

	@Autowired
	Utils utils;

	@Override
	public List<UGDegreeTypeDto> getAllUGDegreeType()
	{
		Iterable<UGDegreeTypeEntity> ugDegreeTypeEntity = ugDegreeTypeRepository.findAll();

		List<UGDegreeTypeDto> ugDegreeTypeList = new ArrayList<UGDegreeTypeDto>();

		ugDegreeTypeEntity.forEach((ugDegreeType) ->
		{
			UGDegreeTypeDto ugDegreeTypeDto = new UGDegreeTypeDto();
			BeanUtils.copyProperties(ugDegreeType, ugDegreeTypeDto);
			ugDegreeTypeList.add(ugDegreeTypeDto);
		});

		return ugDegreeTypeList;
	}

	@Override
	public UGDegreeTypeDto addUGDegreeType(String upDegreeTypeName)
	{
		UGDegreeTypeEntity ugDegreeTypeEntity = new UGDegreeTypeEntity();
		ugDegreeTypeEntity.setUgDegreeTypeId(utils.generateSecureRandom(30));
		ugDegreeTypeEntity.setUgDegreeTypeName(upDegreeTypeName);

		UGDegreeTypeEntity registeredUGDegreeType = ugDegreeTypeRepository.save(ugDegreeTypeEntity);

		UGDegreeTypeDto returnValue = new UGDegreeTypeDto();
		BeanUtils.copyProperties(registeredUGDegreeType, returnValue);
		return returnValue;
	}
}
