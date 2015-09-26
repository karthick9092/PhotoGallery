package com.photogallery.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the user_account database table.
 * 
 */
@Entity
@Table(name="user_account")
public class UserAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Lob
	private byte[] address;

	@Column(name="created_by")
	private BigInteger createdBy;

	@Column(name="created_time")
	private Timestamp createdTime;

	@Column(name="email_id")
	private String emailId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String password;

	@Column(name="phone_number")
	private BigInteger phoneNumber;

	@Column(name="updated_by")
	private BigInteger updatedBy;

	@Column(name="updated_time")
	private Timestamp updatedTime;

	private BigInteger version;

	//bi-directional many-to-one association to AlbumGallery
	@OneToMany(mappedBy="userAccount")
	private List<AlbumGallery> albumGalleries;

	//bi-directional many-to-one association to ImageGallery
	@OneToMany(mappedBy="userAccount")
	private List<ImageGallery> imageGalleries;

	//bi-directional many-to-one association to ImageGalleryHistory
	@OneToMany(mappedBy="userAccount")
	private List<ImageGalleryHistory> imageGalleryHistories;

	//bi-directional many-to-one association to PhotoGalleryHistory
	@OneToMany(mappedBy="userAccount")
	private List<PhotoGalleryHistory> photoGalleryHistories;

	//bi-directional many-to-one association to Company
	@ManyToOne
	private Company company;

	//bi-directional many-to-one association to UserRole
	@ManyToOne
	@JoinColumn(name="role_id")
	private UserRole userRole;

	public UserAccount() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getAddress() {
		return this.address;
	}

	public void setAddress(byte[] address) {
		this.address = address;
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

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigInteger getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public List<AlbumGallery> getAlbumGalleries() {
		return this.albumGalleries;
	}

	public void setAlbumGalleries(List<AlbumGallery> albumGalleries) {
		this.albumGalleries = albumGalleries;
	}

	public AlbumGallery addAlbumGallery(AlbumGallery albumGallery) {
		getAlbumGalleries().add(albumGallery);
		albumGallery.setUserAccount(this);

		return albumGallery;
	}

	public AlbumGallery removeAlbumGallery(AlbumGallery albumGallery) {
		getAlbumGalleries().remove(albumGallery);
		albumGallery.setUserAccount(null);

		return albumGallery;
	}

	public List<ImageGallery> getImageGalleries() {
		return this.imageGalleries;
	}

	public void setImageGalleries(List<ImageGallery> imageGalleries) {
		this.imageGalleries = imageGalleries;
	}

	public ImageGallery addImageGallery(ImageGallery imageGallery) {
		getImageGalleries().add(imageGallery);
		imageGallery.setUserAccount(this);

		return imageGallery;
	}

	public ImageGallery removeImageGallery(ImageGallery imageGallery) {
		getImageGalleries().remove(imageGallery);
		imageGallery.setUserAccount(null);

		return imageGallery;
	}

	public List<ImageGalleryHistory> getImageGalleryHistories() {
		return this.imageGalleryHistories;
	}

	public void setImageGalleryHistories(List<ImageGalleryHistory> imageGalleryHistories) {
		this.imageGalleryHistories = imageGalleryHistories;
	}

	public ImageGalleryHistory addImageGalleryHistory(ImageGalleryHistory imageGalleryHistory) {
		getImageGalleryHistories().add(imageGalleryHistory);
		imageGalleryHistory.setUserAccount(this);

		return imageGalleryHistory;
	}

	public ImageGalleryHistory removeImageGalleryHistory(ImageGalleryHistory imageGalleryHistory) {
		getImageGalleryHistories().remove(imageGalleryHistory);
		imageGalleryHistory.setUserAccount(null);

		return imageGalleryHistory;
	}

	public List<PhotoGalleryHistory> getPhotoGalleryHistories() {
		return this.photoGalleryHistories;
	}

	public void setPhotoGalleryHistories(List<PhotoGalleryHistory> photoGalleryHistories) {
		this.photoGalleryHistories = photoGalleryHistories;
	}

	public PhotoGalleryHistory addPhotoGalleryHistory(PhotoGalleryHistory photoGalleryHistory) {
		getPhotoGalleryHistories().add(photoGalleryHistory);
		photoGalleryHistory.setUserAccount(this);

		return photoGalleryHistory;
	}

	public PhotoGalleryHistory removePhotoGalleryHistory(PhotoGalleryHistory photoGalleryHistory) {
		getPhotoGalleryHistories().remove(photoGalleryHistory);
		photoGalleryHistory.setUserAccount(null);

		return photoGalleryHistory;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public UserRole getUserRole() {
		return this.userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}