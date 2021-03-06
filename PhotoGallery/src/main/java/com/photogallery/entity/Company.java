package com.photogallery.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Lob
	@Column(name="company_address")
	private byte[] companyAddress;

	@Column(name="company_email")
	private String companyEmail;

	@Column(name="company_id")
	private BigInteger companyId;

	@Column(name="company_name")
	private String companyName;

	@Column(name="company_phone")
	private BigInteger companyPhone;

	@Column(name="created_by")
	private BigInteger createdBy;

	@Column(name="created_time")
	private Timestamp createdTime;

	@Column(name="updated_by")
	private BigInteger updatedBy;

	@Column(name="updated_time")
	private Timestamp updatedTime;

	private BigInteger version;

	//bi-directional many-to-one association to UserAccount
	@OneToMany(mappedBy="company")
	private List<UserAccount> userAccounts;

	public Company() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(byte[] companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return this.companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public BigInteger getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigInteger getCompanyPhone() {
		return this.companyPhone;
	}

	public void setCompanyPhone(BigInteger companyPhone) {
		this.companyPhone = companyPhone;
	}

	public BigInteger getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public BigInteger getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigInteger updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	public BigInteger getVersion() {
		return this.version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}

	public List<UserAccount> getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccounts(List<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	public UserAccount addUserAccount(UserAccount userAccount) {
		getUserAccounts().add(userAccount);
		userAccount.setCompany(this);

		return userAccount;
	}

	public UserAccount removeUserAccount(UserAccount userAccount) {
		getUserAccounts().remove(userAccount);
		userAccount.setCompany(null);

		return userAccount;
	}

}