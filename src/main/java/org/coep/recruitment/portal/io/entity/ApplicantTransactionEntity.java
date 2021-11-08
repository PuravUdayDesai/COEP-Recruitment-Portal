package org.coep.recruitment.portal.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "transaction")
public class ApplicantTransactionEntity implements Serializable
{

	private static final long serialVersionUID = 172563521045824289L;
	@Id
	@GeneratedValue
	private Long              transactionId;
	@Column(nullable = false, unique = true)
	private String            emailId;
	@Column(nullable = false, unique = true)
	private String            contactNumber;
	@Column(nullable = false)
	private String            transactionBankId;
	@Column(nullable = false)
	private Double            creditAmount;
	@Column(nullable = false)
	private Boolean           transactionStatus;
	@Column(nullable = false)
	private Date              transactionDate;
	@Column(nullable = false)
	private String            transactionPurpose;
	@OneToOne(mappedBy = "applicantTransaction", cascade = CascadeType.ALL)
	private ApplicantEntity   applicant;

	public ApplicantTransactionEntity()
	{
		super();
	}

	public ApplicantTransactionEntity(Long transactionId, String emailId, String contactNumber,
			String transactionBankId, Double creditAmount, Boolean transactionStatus, Date transactionDate,
			String transactionPurpose, ApplicantEntity applicant)
	{
		super();
		this.transactionId = transactionId;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.transactionBankId = transactionBankId;
		this.creditAmount = creditAmount;
		this.transactionStatus = transactionStatus;
		this.transactionDate = transactionDate;
		this.transactionPurpose = transactionPurpose;
		this.applicant = applicant;
	}

	public Long getTransactionId()
	{
		return transactionId;
	}

	public void setTransactionId(Long transactionId)
	{
		this.transactionId = transactionId;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	public String getTransactionBankId()
	{
		return transactionBankId;
	}

	public void setTransactionBankId(String transactionBankId)
	{
		this.transactionBankId = transactionBankId;
	}

	public Double getCreditAmount()
	{
		return creditAmount;
	}

	public void setCreditAmount(Double creditAmount)
	{
		this.creditAmount = creditAmount;
	}

	public Boolean getTransactionStatus()
	{
		return transactionStatus;
	}

	public void setTransactionStatus(Boolean transactionStatus)
	{
		this.transactionStatus = transactionStatus;
	}

	public Date getTransactionDate()
	{
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate)
	{
		this.transactionDate = transactionDate;
	}

	public String getTransactionPurpose()
	{
		return transactionPurpose;
	}

	public void setTransactionPurpose(String transactionPurpose)
	{
		this.transactionPurpose = transactionPurpose;
	}

	public ApplicantEntity getApplicant()
	{
		return applicant;
	}

	public void setApplicant(ApplicantEntity applicant)
	{
		this.applicant = applicant;
	}

}
