package com.example.InsuranceManagement.Dao;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_id")
	private int clientId;
	
	@Column(name="client_name")
	private String clientName;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="client_photo")
	private String clientPhoto;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="modified_at")
	private Date modifiedAt;
	
	 @PrePersist
	    protected void onCreate() {
	        createdAt = new Date();
	    }
	    
	    @PreUpdate
	    protected void onUpdate() {
	        modifiedAt = new Date();
	    }

		public int getClientId() {
			return clientId;
		}

		public void setClientId(int clientId) {
			this.clientId = clientId;
		}

		public String getClientName() {
			return clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getClientPhoto() {
			return clientPhoto;
		}

		public void setClientPhoto(String clientPhoto) {
			this.clientPhoto = clientPhoto;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getModifiedAt() {
			return modifiedAt;
		}

		public void setModifiedAt(Date modifiedAt) {
			this.modifiedAt = modifiedAt;
		}

		@Override
		public String toString() {
			return "Client [clientId=" + clientId + ", clientName=" + clientName + ", status=" + status
					+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phone=" + phone + ", address=" + address
					+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", clientPhoto=" + clientPhoto
					+ ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
		}
	
	
}
