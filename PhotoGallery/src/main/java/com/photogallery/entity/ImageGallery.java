package com.photogallery.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the image_gallery database table.
 * 
 */
@Entity
@Table(name="image_gallery")
public class ImageGallery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name="created_by")
	private BigInteger createdBy;

	@Column(name="created_time")
	private Timestamp createdTime;

	@Column(name="image_name")
	private String imageName;

	@Lob
	@Column(name="image_url")
	private byte[] imageUrl;

	private byte isSaved;

	private byte isTemp_saved;

	@Column(name="updated_by")
	private BigInteger updatedBy;

	@Column(name="updated_time")
	private Timestamp updatedTime;

	private BigInteger version;

	//bi-directional many-to-one association to UserAccount
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserAccount userAccount;

	public ImageGallery() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public byte[] getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(byte[] imageUrl) {
		this.imageUrl = imageUrl;
	}

	public byte getIsSaved() {
		return this.isSaved;
	}

	public void setIsSaved(byte isSaved) {
		this.isSaved = isSaved;
	}

	public byte getIsTemp_saved() {
		return this.isTemp_saved;
	}

	public void setIsTemp_saved(byte isTemp_saved) {
		this.isTemp_saved = isTemp_saved;
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

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}