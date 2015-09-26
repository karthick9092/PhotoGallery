package com.photogallery.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the user_roles database table.
 * 
 */
@Entity
@Table(name="user_roles")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private String roleId;

	@Column(name="created_by")
	private BigInteger createdBy;

	@Column(name="created_time")
	private Timestamp createdTime;

	@Column(name="role_name")
	private String roleName;

	@Column(name="updated_by")
	private BigInteger updatedBy;

	@Column(name="updated_time")
	private Timestamp updatedTime;

	private BigInteger version;

	//bi-directional many-to-one association to UserAccount
	@OneToMany(mappedBy="userRole")
	private List<UserAccount> userAccounts;

	public UserRole() {
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
		userAccount.setUserRole(this);

		return userAccount;
	}

	public UserAccount removeUserAccount(UserAccount userAccount) {
		getUserAccounts().remove(userAccount);
		userAccount.setUserRole(null);

		return userAccount;
	}

}