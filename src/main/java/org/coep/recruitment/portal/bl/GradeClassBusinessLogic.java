package org.coep.recruitment.portal.bl;

import java.util.ArrayList;
import java.util.List;

import org.coep.recruitment.portal.service.GradeClassService;
import org.coep.recruitment.portal.shared.dto.GradeClassDto;
import org.coep.recruitment.portal.ui.model.response.GradeClassResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GradeClassBusinessLogic
{
	@Autowired
	GradeClassService gradeClassService;
	
	public List<GradeClassResponseModel> getAllGradeClass()
	{
		List<GradeClassDto> gradeClassList = gradeClassService.getAllGradeClass();
		List<GradeClassResponseModel> returnValue = new ArrayList<GradeClassResponseModel>();
		
		gradeClassList.forEach((gradeClass) -> {
			GradeClassResponseModel gradeClassReturn = new GradeClassResponseModel();
			BeanUtils.copyProperties(gradeClass, gradeClassReturn);
			returnValue.add(gradeClassReturn);
		});
		
		return returnValue;
	}
	
	public GradeClassResponseModel addGradeClass(String gradeClassName)
	{
		GradeClassResponseModel returnValue = new GradeClassResponseModel();
		GradeClassDto gradeClassDto = gradeClassService.addGradeClass(gradeClassName);
		BeanUtils.copyProperties(gradeClassDto, returnValue);
		
		return returnValue;
	}

}
