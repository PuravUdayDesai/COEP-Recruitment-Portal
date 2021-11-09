package org.coep.recruitment.portal.io.repository;

import org.coep.recruitment.portal.io.entity.BranchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends CrudRepository<BranchEntity, Long>
{

}
