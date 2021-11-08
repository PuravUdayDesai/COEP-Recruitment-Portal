package org.coep.recruitment.portal.service;

import java.util.List;

import org.coep.recruitment.portal.shared.dto.UGDegreeTypeDto;

public interface UGDegreeTypeService
{

	List<UGDegreeTypeDto> getAllUGDegreeType();

	UGDegreeTypeDto addUGDegreeType(String upDegreeTypeName);

}
