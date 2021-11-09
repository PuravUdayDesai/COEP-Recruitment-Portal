package org.coep.recruitment.portal.bl;

import java.io.IOException;

import javax.mail.MessagingException;

import org.coep.recruitment.portal.Constants;
import org.coep.recruitment.portal.aspect.EmailAspect;
import org.coep.recruitment.portal.aspect.FileUploaderAspect;
import org.coep.recruitment.portal.service.ApplicantService;
import org.coep.recruitment.portal.shared.dto.ApplicantDto;
import org.coep.recruitment.portal.shared.dto.ApplicantPersonalDetailsDto;
import org.coep.recruitment.portal.ui.model.request.ApplicantPersonalDetailsRequestModel;
import org.coep.recruitment.portal.ui.model.request.ApplicantSignUpRequestModel;
import org.coep.recruitment.portal.ui.model.response.ApplicantEssentialDetailsResponseModel;
import org.coep.recruitment.portal.ui.model.response.ApplicantSignUpResponseModel;
import org.coep.recruitment.portal.ui.model.response.OperationStatusModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ApplicantBusinessLogic
{
	@Autowired
	ApplicantService applicantService;

	public ApplicantSignUpResponseModel applicantSignUp(ApplicantSignUpRequestModel applicantSignUpRequestModel)
	{
		ApplicantSignUpResponseModel returnValue = new ApplicantSignUpResponseModel();

		ApplicantDto applicantDto = new ApplicantDto();
		BeanUtils.copyProperties(applicantSignUpRequestModel, applicantDto);

		ApplicantDto registeredApplicant = applicantService.registerApplicant(applicantDto);

		BeanUtils.copyProperties(registeredApplicant, returnValue);

		try
		{
			EmailAspect.sendEmailWithoutAttachment(registeredApplicant.getEmailId(), "TO", "Welcome to COEP",
					"    <div style=\"width: 100%; height: 100%;\">\n"
							+ "        <div style=\"width: 50%; height: auto; margin: 0 auto; padding: 10px; position: relative;\">\n"
							+ "            <center>\n"
							+ "                <img src=\"https://www.coep.org.in/sites/default/files/coep_new_logo.png\" alt=\"COEP\">\n"
							+ "            </center>\n" + "        </div>\n"
							+ "        <div style=\"margin: 5%; width: 90%; height: auto; margin: 0 auto; padding: 10px; position: relative; border: 5px solid transparent; border-image: linear-gradient(to right, indianred, purple); border-image-slice: 1;\">\n"
							+ "            <center>\n"
							+ "                <h1 style=\"font-family: 'Trebuchet MS', sans-serif;\">\n"
							+ "                    Welcome to COEP Recruitment Process\n" + "                </h1>\n"
							+ "            </center>\n"
							+ "            <div style=\"font-family: 'Trebuchet MS', sans-serif; margin-top: 5%; margin-left: 2%;\">\n"
							+ "                <p style=\"margin-top: 5%;\">\n"
							+ "                    Thank you <font color=\"blue\">" + registeredApplicant.getEmailId()
							+ "</font> for registering to COEP Recruitment\n" + "                    Portal.\n"
							+ "                </p>\n" + "                <p style=\"margin-top: 2%;\">\n"
							+ "                    You have successfully registered to COEP Recruitment Portal, to proceed please <b>verify your email\n"
							+ "                        with OTP</b> and <b>login via the username and password</b> provided below.\n"
							+ "                </p>\n" + "                <p style=\"text-align: center;\">\n"
							+ "                    OTP: <font style=\"color: grey; font-size: xx-large; margin-left: 1%;\">"
							+ registeredApplicant.getEmailVerificationToken() + "</font>\n" + "                </p>\n"
							+ "                <table align=\"center\" style=\"border-spacing:0 15px;\">\n"
							+ "                    <tr>\n" + "                        <td>\n"
							+ "                            Username:\n" + "                        </td>\n"
							+ "                        <td style=\"color: indianred; font-size: large;\">\n"
							+ "                            " + registeredApplicant.getUsername() + "\n"
							+ "                        </td>\n" + "                    </tr>\n"
							+ "                    <tr>\n" + "                        <td>\n"
							+ "                            Password:\n" + "                        </td>\n"
							+ "                        <td style=\"color: indianred; font-size: large;\">\n"
							+ "                            " + registeredApplicant.getPassword() + "\n"
							+ "                        </td>\n" + "                    </tr>\n"
							+ "                </table>\n" + "\n" + "            </div>\n" + "        </div>\n"
							+ "    </div>",
					"text/html");
		} catch (MessagingException e)
		{
			e.printStackTrace();
		}

		return returnValue;
	}

	public ApplicantEssentialDetailsResponseModel getApplicantDetails(String id)
	{
		return applicantService.getApplicantDetails(id);
	}

	public OperationStatusModel addApplicantPersonalDetails(String id,
			ApplicantPersonalDetailsRequestModel applicantPersonalDetailsRequestModel)
	{
		OperationStatusModel returnValue;

		ApplicantPersonalDetailsDto applicantPersonalDetailsDto = new ApplicantPersonalDetailsDto();
		BeanUtils.copyProperties(applicantPersonalDetailsRequestModel, applicantPersonalDetailsDto);

		returnValue = applicantService.addApplicantPersonalDetails(id, applicantPersonalDetailsDto);

		return returnValue;
	}

	public OperationStatusModel uploadApplicantImage(String id, MultipartFile file)
	{
		OperationStatusModel returnValue;

		String path = Constants.FILE_BASE_PATH + id + "/image";

		try
		{
			FileUploaderAspect.fileUpload(file, path);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		returnValue = applicantService.addApplicantImage(id, path);

		return returnValue;
	}

	public OperationStatusModel uploadDateOfBirthProof(String id, MultipartFile file)
	{
		OperationStatusModel returnValue;

		String path = Constants.FILE_BASE_PATH + id + "/dateOfBirthProof";

		try
		{
			FileUploaderAspect.fileUpload(file, path);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		returnValue = applicantService.addApplicantDateOfBirthProof(id, path);

		return returnValue;
	}

}
