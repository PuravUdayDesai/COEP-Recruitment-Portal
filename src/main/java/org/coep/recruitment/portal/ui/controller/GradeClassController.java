package org.coep.recruitment.portal.ui.controller;

import java.util.List;

import org.coep.recruitment.portal.bl.GradeClassBusinessLogic;
import org.coep.recruitment.portal.ui.model.response.GradeClassResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradeClass")
public class GradeClassController
{
	@Autowired
	GradeClassBusinessLogic gradeClassBusinessLogic;

	@GetMapping(path = "/all", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<GradeClassResponseModel> getAllBranch()
	{
		return gradeClassBusinessLogic.getAllGradeClass();
	}

	@PostMapping(path = "/add", produces =
			{ MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public GradeClassResponseModel addBranch(@RequestParam(name="gradeClassName", required = true) String gradeClassName)
	{
		return gradeClassBusinessLogic.addGradeClass(gradeClassName);
	}
}
