package org.coep.recruitment.portal.service;

import java.util.List;

import org.coep.recruitment.portal.shared.dto.GradeClassDto;

public interface GradeClassService
{
	List<GradeClassDto> getAllGradeClass();

	GradeClassDto addGradeClass(String gradeClassName);
}
