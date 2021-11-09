package org.coep.recruitment.portal.ui.controller;

import java.util.List;

import org.coep.recruitment.portal.bl.BranchBusinessLogic;
import org.coep.recruitment.portal.ui.model.response.BranchResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchController
{
	@Autowired
	BranchBusinessLogic branchBusinessLogic;

	@GetMapping(path = "/all", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<BranchResponseModel> getAllBranch()
	{
		return branchBusinessLogic.getAllBranch();
	}

	@PostMapping(path = "/add", produces =
			{ MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public BranchResponseModel addBranch(@RequestParam(name="branchName", required = true) String branchName)
	{
		return branchBusinessLogic.addBranch(branchName);
	}

}
