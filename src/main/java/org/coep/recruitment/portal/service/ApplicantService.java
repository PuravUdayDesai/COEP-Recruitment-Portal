package org.coep.recruitment.portal.service;

import org.coep.recruitment.portal.shared.dto.ApplicantDto;
import org.coep.recruitment.portal.shared.dto.ApplicantPersonalDetailsDto;
import org.coep.recruitment.portal.ui.model.response.ApplicantEssentialDetailsResponseModel;
import org.coep.recruitment.portal.ui.model.response.OperationStatusModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ApplicantService extends UserDetailsService
{
	ApplicantDto registerApplicant(ApplicantDto applicant);

	ApplicantDto getUser(String username);

	ApplicantEssentialDetailsResponseModel getApplicantDetails(String id);

	OperationStatusModel addApplicantPersonalDetails(String id,
			ApplicantPersonalDetailsDto applicantPersonalDetailsDto);

}
