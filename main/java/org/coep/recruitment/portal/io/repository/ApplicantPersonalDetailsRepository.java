package org.coep.recruitment.portal.io.repository;

import org.coep.recruitment.portal.io.entity.ApplicantPersonalDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantPersonalDetailsRepository extends CrudRepository<ApplicantPersonalDetailsEntity, Long>
{

}
