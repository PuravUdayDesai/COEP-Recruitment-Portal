package org.coep.recruitment.portal.ui.controller;

import javax.mail.MessagingException;
import javax.validation.Valid;

import org.coep.recruitment.portal.bl.ApplicantBusinessLogic;
import org.coep.recruitment.portal.ui.model.request.ApplicantPersonalDetailsRequestModel;
import org.coep.recruitment.portal.ui.model.request.ApplicantSignUpRequestModel;
import org.coep.recruitment.portal.ui.model.response.ApplicantEssentialDetailsResponseModel;
import org.coep.recruitment.portal.ui.model.response.ApplicantSignUpResponseModel;
import org.coep.recruitment.portal.ui.model.response.OperationStatusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/applicant")
@CrossOrigin(origins = "*")
public class ApplicantController
{
	@Autowired
	ApplicantBusinessLogic applicantBusinessLogic;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ApplicantSignUpResponseModel applicantSignUp(
			@Valid @RequestBody ApplicantSignUpRequestModel applicantSignUpRequestModel) throws MessagingException
	{
		return applicantBusinessLogic.applicantSignUp(applicantSignUpRequestModel);
	}

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ApplicantEssentialDetailsResponseModel getApplicantDetails(@PathVariable String id)
	{
		return applicantBusinessLogic.getApplicantDetails(id);
	}

	@PostMapping(path = "/personalDetails/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces =
			{ MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public OperationStatusModel addApplicantPersonalDetails(@PathVariable String id,
			@Valid @RequestBody ApplicantPersonalDetailsRequestModel applicantPersonalDetailsRequestModel)
	{
		return applicantBusinessLogic.addApplicantPersonalDetails(id, applicantPersonalDetailsRequestModel);
	}

	@PostMapping(path = "/upload/applicantImage/{id}")
	public OperationStatusModel uploadApplicantImage(@PathVariable String id, @RequestPart("file") MultipartFile file)
	{
		return applicantBusinessLogic.uploadApplicantImage(id, file);
	}

	@PostMapping(path = "/upload/dateofBirthProof/{id}")
	public OperationStatusModel uploadDateofBirthProof(@PathVariable String id, @RequestPart("file") MultipartFile file)
	{
		return applicantBusinessLogic.uploadDateOfBirthProof(id, file);
	}

}
