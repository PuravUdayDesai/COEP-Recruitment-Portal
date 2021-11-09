package org.coep.recruitment.portal.bl;

import java.util.ArrayList;
import java.util.List;

import org.coep.recruitment.portal.service.UGDegreeTypeService;
import org.coep.recruitment.portal.shared.dto.UGDegreeTypeDto;
import org.coep.recruitment.portal.ui.model.response.UGDegreeTypeResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UGDegreeTypeBusinessLogic
{

	@Autowired
	UGDegreeTypeService ugDegreeTypeService;

	public List<UGDegreeTypeResponseModel> getAllUGDegreeType()
	{
		List<UGDegreeTypeDto>           ugDegreeTypeList = ugDegreeTypeService.getAllUGDegreeType();
		List<UGDegreeTypeResponseModel> returnValue      = new ArrayList<UGDegreeTypeResponseModel>();

		ugDegreeTypeList.forEach((ugDegreeType) ->
		{
			UGDegreeTypeResponseModel ugDegreeTypeReturn = new UGDegreeTypeResponseModel();
			BeanUtils.copyProperties(ugDegreeType, ugDegreeTypeReturn);
			returnValue.add(ugDegreeTypeReturn);
		});

		return returnValue;
	}

	public UGDegreeTypeResponseModel addUGDegreeType(String upDegreeTypeName)
	{
		UGDegreeTypeResponseModel returnValue     = new UGDegreeTypeResponseModel();
		UGDegreeTypeDto           ugDegreeTypeDto = ugDegreeTypeService.addUGDegreeType(upDegreeTypeName);
		BeanUtils.copyProperties(ugDegreeTypeDto, returnValue);
		return returnValue;
	}

}
