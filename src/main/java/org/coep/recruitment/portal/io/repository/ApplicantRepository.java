package org.coep.recruitment.portal.io.repository;

import org.coep.recruitment.portal.io.entity.ApplicantEntity;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepository extends CrudRepository<ApplicantEntity, Long>
{
	ApplicantEntity findByUsername(String username);
	ApplicantEntity findByApplicantId(String applicantId);
}
