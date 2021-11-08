package org.coep.recruitment.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.coep.recruitment.portal.io.entity.GradeClassEntity;
import org.coep.recruitment.portal.io.repository.GradeClassRepository;
import org.coep.recruitment.portal.service.GradeClassService;
import org.coep.recruitment.portal.shared.Utils;
import org.coep.recruitment.portal.shared.dto.GradeClassDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeClassServiceImpl implements GradeClassService
{
	@Autowired
	GradeClassRepository gradeClassRepository;

	@Autowired
	Utils utils;

	@Override
	public List<GradeClassDto> getAllGradeClass()
	{
		Iterable<GradeClassEntity> gradeClassEntity = gradeClassRepository.findAll();

		List<GradeClassDto> gradeClassList = new ArrayList<GradeClassDto>();

		gradeClassEntity.forEach((gradeClass) ->
		{
			GradeClassDto gradeClassDto = new GradeClassDto();
			BeanUtils.copyProperties(gradeClass, gradeClassDto);
			gradeClassList.add(gradeClassDto);
		});

		return gradeClassList;
	}

	@Override
	public GradeClassDto addGradeClass(String gradeClassName)
	{
		GradeClassEntity gradeClassEntity = new GradeClassEntity();
		gradeClassEntity.setGradeClassId(utils.generateSecureRandom(30));
		gradeClassEntity.setGradeClassName(gradeClassName);
		
		GradeClassEntity registeredGradeClass = gradeClassRepository.save(gradeClassEntity);
		
		GradeClassDto returnValue = new GradeClassDto();
		BeanUtils.copyProperties(registeredGradeClass, returnValue);
		
		return returnValue;
	}

}
