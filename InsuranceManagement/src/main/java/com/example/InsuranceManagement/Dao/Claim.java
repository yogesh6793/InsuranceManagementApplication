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
@Table(name="claims")
public class Claim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="claim_id")
	private int claimId;
	
	@Column(name="claim_number")
	private String claimNumber;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="claim_description")
	private String claimDescription;
	
	@Column(name="claim_date")
	private Date claimDate;
	
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

		public int getClaimId() {
			return claimId;
		}

		public void setClaimId(int claimId) {
			this.claimId = claimId;
		}

		public String getClaimNumber() {
			return claimNumber;
		}

		public void setClaimNumber(String claimNumber) {
			this.claimNumber = claimNumber;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public String getClaimDescription() {
			return claimDescription;
		}

		public void setClaimDescription(String claimDescription) {
			this.claimDescription = claimDescription;
		}

		public Date getClaimDate() {
			return claimDate;
		}

		public void setClaimDate(Date claimDate) {
			this.claimDate = claimDate;
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
			return "Claim [claimId=" + claimId + ", claimNumber=" + claimNumber + ", status=" + status
					+ ", claimDescription=" + claimDescription + ", claimDate=" + claimDate + ", createdAt=" + createdAt
					+ ", modifiedAt=" + modifiedAt + "]";
		}

}
