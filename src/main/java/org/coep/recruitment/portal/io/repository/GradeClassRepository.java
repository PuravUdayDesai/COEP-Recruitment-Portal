package org.coep.recruitment.portal.io.repository;

import org.coep.recruitment.portal.io.entity.GradeClassEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeClassRepository extends CrudRepository<GradeClassEntity, Long>
{

}
