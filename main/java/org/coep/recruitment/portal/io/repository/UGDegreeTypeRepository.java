package org.coep.recruitment.portal.io.repository;

import org.coep.recruitment.portal.io.entity.UGDegreeTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UGDegreeTypeRepository extends CrudRepository<UGDegreeTypeEntity, Long>
{

}
