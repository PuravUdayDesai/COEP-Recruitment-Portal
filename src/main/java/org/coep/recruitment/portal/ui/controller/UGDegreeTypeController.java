package org.coep.recruitment.portal.ui.controller;

import java.util.List;

import org.coep.recruitment.portal.bl.UGDegreeTypeBusinessLogic;
import org.coep.recruitment.portal.ui.model.response.UGDegreeTypeResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ugDegreeType")
public class UGDegreeTypeController
{
	@Autowired
	UGDegreeTypeBusinessLogic ugDegreeTypeBusinessLogic;

	@GetMapping(path = "/all", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<UGDegreeTypeResponseModel> getAllBranch()
	{
		return ugDegreeTypeBusinessLogic.getAllUGDegreeType();
	}

	@PostMapping(path = "/add", produces =
			{ MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UGDegreeTypeResponseModel addBranch(@RequestParam(name="upDegreeTypeName", required = true) String upDegreeTypeName)
	{
		return ugDegreeTypeBusinessLogic.addUGDegreeType(upDegreeTypeName);
	}
}
