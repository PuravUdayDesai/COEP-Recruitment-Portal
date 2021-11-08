package org.coep.recruitment.portal.io.repository;

import org.coep.recruitment.portal.io.entity.ApplicantTransactionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantTransactionRepository extends CrudRepository<ApplicantTransactionEntity, Long>
{
	ApplicantTransactionEntity findByTransactionId(Long transactionId);
}
