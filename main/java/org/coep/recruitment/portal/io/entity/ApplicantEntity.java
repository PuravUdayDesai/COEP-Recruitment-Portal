package org.coep.recruitment.portal.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "applicant")
public class ApplicantEntity implements Serializable
{
	private static final long              serialVersionUID = 6019022657775706183L;
	@Id
	@GeneratedValue
	private Long                           id;
	@Column(nullable = false)
	private String                         applicantId;
	@Column(nullable = false)
	private String                         username;
	@Column(nullable = false)
	private String                         password;
	@Column(nullable = false)
	private Date                           createdOn;
	@Column(nullable = false)
	private Date                           lastEditedOn;
	@Column(nullable = false)
	private Boolean                        markForDelete;
	@OneToOne
	@JoinColumn(name = "applicant_transaction_id")
	private ApplicantTransactionEntity     applicantTransaction;
	@OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
	private ApplicantPersonalDetailsEntity applicantPersonalDetails;

	public ApplicantEntity()
	{
		super();
	}

	public ApplicantEntity(Long id, String applicantId, String username, String password, Date createdOn,
			Date lastEditedOn, Boolean markForDelete, ApplicantTransactionEntity applicantTransaction,
			ApplicantPersonalDetailsEntity applicantPersonalDetails)
	{
		super();
		this.id = id;
		this.applicantId = applicantId;
		this.username = username;
		this.password = password;
		this.createdOn = createdOn;
		this.lastEditedOn = lastEditedOn;
		this.markForDelete = markForDelete;
		this.applicantTransaction = applicantTransaction;
		this.applicantPersonalDetails = applicantPersonalDetails;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getApplicantId()
	{
		return applicantId;
	}

	public void setApplicantId(String applicantId)
	{
		this.applicantId = applicantId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Date getCreatedOn()
	{
		return createdOn;
	}

	public void setCreatedOn(Date createdOn)
	{
		this.createdOn = createdOn;
	}

	public Date getLastEditedOn()
	{
		return lastEditedOn;
	}

	public void setLastEditedOn(Date lastEditedOn)
	{
		this.lastEditedOn = lastEditedOn;
	}

	public Boolean getMarkForDelete()
	{
		return markForDelete;
	}

	public void setMarkForDelete(Boolean markForDelete)
	{
		this.markForDelete = markForDelete;
	}

	public ApplicantTransactionEntity getApplicantTransaction()
	{
		return applicantTransaction;
	}

	public void setApplicantTransaction(ApplicantTransactionEntity applicantTransaction)
	{
		this.applicantTransaction = applicantTransaction;
	}

	public ApplicantPersonalDetailsEntity getApplicantPersonalDetails()
	{
		return applicantPersonalDetails;
	}

	public void setApplicantPersonalDetails(ApplicantPersonalDetailsEntity applicantPersonalDetails)
	{
		this.applicantPersonalDetails = applicantPersonalDetails;
	}
}
