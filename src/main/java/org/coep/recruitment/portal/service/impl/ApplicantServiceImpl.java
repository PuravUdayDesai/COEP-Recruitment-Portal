package org.coep.recruitment.portal.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.coep.recruitment.portal.io.entity.ApplicantEntity;
import org.coep.recruitment.portal.io.entity.ApplicantPersonalDetailsEntity;
import org.coep.recruitment.portal.io.entity.ApplicantTransactionEntity;
import org.coep.recruitment.portal.io.repository.ApplicantPersonalDetailsRepository;
import org.coep.recruitment.portal.io.repository.ApplicantRepository;
import org.coep.recruitment.portal.io.repository.ApplicantTransactionRepository;
import org.coep.recruitment.portal.service.ApplicantService;
import org.coep.recruitment.portal.shared.Utils;
import org.coep.recruitment.portal.shared.dto.ApplicantDto;
import org.coep.recruitment.portal.shared.dto.ApplicantPersonalDetailsDto;
import org.coep.recruitment.portal.ui.controller.RequestOperationName;
import org.coep.recruitment.portal.ui.model.response.ApplicantEssentialDetailsResponseModel;
import org.coep.recruitment.portal.ui.model.response.ErrorMessages;
import org.coep.recruitment.portal.ui.model.response.OperationStatusModel;
import org.coep.recruitment.portal.ui.model.response.RequestOperationStatus;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService
{
	@Autowired
	ApplicantTransactionRepository applicantTransactionRepository;

	@Autowired
	ApplicantRepository applicantRepository;

	@Autowired
	ApplicantPersonalDetailsRepository applicantPersonalDetailsRepository;

	@Autowired
	Utils utils;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public ApplicantDto registerApplicant(ApplicantDto applicant)
	{
		String password = utils.generateSecureRandom(5);

		ApplicantTransactionEntity applicantEntity = new ModelMapper().map(applicant, ApplicantTransactionEntity.class);
		applicantEntity.setTransactionBankId(utils.generateSecureRandom(10));
		applicantEntity.setCreditAmount(1000.0);
		applicantEntity.setTransactionDate(new Date());
		applicantEntity.setTransactionPurpose("New Register");
		applicantEntity.setTransactionStatus(true);

		ApplicantEntity applicantDataEntity = new ApplicantEntity();
		applicantDataEntity.setUsername(applicantEntity.getEmailId());
		applicantDataEntity.setPassword(bCryptPasswordEncoder.encode(password));
		applicantDataEntity.setCreatedOn(new Date());
		applicantDataEntity.setLastEditedOn(new Date());
		applicantDataEntity.setMarkForDelete(false);
		applicantDataEntity.setApplicantId(utils.generateSecureRandom(30));
		applicantDataEntity.setApplicantTransaction(applicantEntity);

		applicantEntity.setApplicant(applicantDataEntity);

		ApplicantTransactionEntity registeredApplicant = applicantTransactionRepository.save(applicantEntity);

		ApplicantDto returnValue = new ApplicantDto();
		BeanUtils.copyProperties(registeredApplicant, returnValue);

		returnValue.setPassword(password);
		returnValue.setUsername(registeredApplicant.getEmailId());
		returnValue.setEmailVerificationToken(String.format("%04d", new Random().nextInt(10000)));

		return returnValue;
	}

	@Override
	public ApplicantDto getUser(String username)
	{
		ApplicantEntity userEntity = applicantRepository.findByUsername(username);

		if (userEntity == null)
		{
			throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
		}

		ApplicantDto returnValue = new ApplicantDto();
		BeanUtils.copyProperties(userEntity, returnValue);
		return returnValue;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{

		ApplicantEntity userEntity = applicantRepository.findByUsername(username);

		if (userEntity == null)
		{
			throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
		}

		return new User(userEntity.getUsername(), userEntity.getPassword(), new ArrayList<>());
	}

	@Override
	public ApplicantEssentialDetailsResponseModel getApplicantDetails(String id)
	{
		ApplicantEssentialDetailsResponseModel applicant = new ApplicantEssentialDetailsResponseModel();

		ApplicantEntity applicantEntity = applicantRepository.findByApplicantId(id);

		if (applicantEntity == null)
		{
			throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
		}

		applicant.setApplicantId(applicantEntity.getApplicantId());

		ApplicantTransactionEntity applicantTransactionEntiry = applicantTransactionRepository
				.findByTransactionId(applicantEntity.getApplicantTransaction().getTransactionId());

		applicant.setEmailId(applicantTransactionEntiry.getEmailId());
		applicant.setContactNumber(applicantTransactionEntiry.getContactNumber());

		return applicant;
	}

	@Override
	public OperationStatusModel addApplicantPersonalDetails(String id,
			ApplicantPersonalDetailsDto applicantPersonalDetailsDto)
	{
		
		OperationStatusModel returnValue = new OperationStatusModel();
		returnValue.setOperationName(RequestOperationName.CREATE.name());
		
		ApplicantEntity applicantEntity = applicantRepository.findByApplicantId(id);

		if (applicantEntity == null)
		{
			returnValue.setOperationResult(RequestOperationStatus.ERROR.name());
			throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
		}
		
		ApplicantPersonalDetailsEntity applicantPersonalDetailsEntity = new ApplicantPersonalDetailsEntity();
		
		BeanUtils.copyProperties(applicantPersonalDetailsDto, applicantPersonalDetailsEntity);
		
		applicantPersonalDetailsEntity.setApplicant(applicantEntity);

		applicantEntity.setApplicantPersonalDetails(applicantPersonalDetailsEntity);
		applicantRepository.save(applicantEntity);
		
		returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
		
		return returnValue;
	}

	@Override
	public OperationStatusModel addApplicantImage(String id, String path)
	{
		OperationStatusModel returnValue = new OperationStatusModel();
		returnValue.setOperationName(RequestOperationName.CREATE.name());
		
		ApplicantEntity applicantEntity = applicantRepository.findByApplicantId(id);

		if (applicantEntity == null)
		{
			returnValue.setOperationResult(RequestOperationStatus.ERROR.name());
			throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
		}
		
		applicantEntity.getApplicantPersonalDetails().setApplicantImageFile(path);
		applicantRepository.save(applicantEntity);
		
		returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
		
		return returnValue;
	}

	@Override
	public OperationStatusModel addApplicantDateOfBirthProof(String id, String path)
	{
		OperationStatusModel returnValue = new OperationStatusModel();
		returnValue.setOperationName(RequestOperationName.CREATE.name());
		
		ApplicantEntity applicantEntity = applicantRepository.findByApplicantId(id);

		if (applicantEntity == null)
		{
			returnValue.setOperationResult(RequestOperationStatus.ERROR.name());
			throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
		}
		
		applicantEntity.getApplicantPersonalDetails().setDateOfBirthProof(path);
		applicantRepository.save(applicantEntity);
		
		returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
		
		return returnValue;
	}

}
