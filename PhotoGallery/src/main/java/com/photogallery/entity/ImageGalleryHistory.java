package com.photogallery.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the image_gallery_history database table.
 * 
 */
@Entity
@Table(name="image_gallery_history")
public class ImageGalleryHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="deleted_by")
	private BigInteger deletedBy;

	@Column(name="deleted_time")
	private Timestamp deletedTime;

	@Column(name="image_name")
	private String imageName;

	@Lob
	@Column(name="image_url")
	private byte[] imageUrl;

	private BigInteger version;

	//bi-directional many-to-one association to UserAccount
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserAccount userAccount;

	public ImageGalleryHistory() {
	}

	public BigInteger getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(BigInteger deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Timestamp getDeletedTime() {
		return this.deletedTime;
	}

	public void setDeletedTime(Timestamp deletedTime) {
		this.deletedTime = deletedTime;
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