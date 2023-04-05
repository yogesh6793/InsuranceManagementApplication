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
@Table(name="insurance_policies")
public class InsurancePolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="insurance_id")
	private int insuranceId;
	
	@Column(name="insurance_policy_number")
	private String insurancePolicyNumber;
	
	@Column(name="insurance_policy_name")
	private String insurancePolicyName;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="coverage_amount")
	private int coverageAmount;
	
	@Column(name="premium")
	private int premium;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
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

		public int getInsuranceId() {
			return insuranceId;
		}

		public void setInsuranceId(int insuranceId) {
			this.insuranceId = insuranceId;
		}

		public String getInsurancePolicyNumber() {
			return insurancePolicyNumber;
		}

		public void setInsurancePolicyNumber(String insurancePolicyNumber) {
			this.insurancePolicyNumber = insurancePolicyNumber;
		}

		public String getInsurancePolicyName() {
			return insurancePolicyName;
		}

		public void setInsurancePolicyName(String insurancePolicyName) {
			this.insurancePolicyName = insurancePolicyName;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public int getCoverageAmount() {
			return coverageAmount;
		}

		public void setCoverageAmount(int coverageAmount) {
			this.coverageAmount = coverageAmount;
		}

		public int getPremium() {
			return premium;
		}

		public void setPremium(int premium) {
			this.premium = premium;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
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
			return "InsurancePolicyController [insuranceId=" + insuranceId + ", insurancePolicyNumber="
					+ insurancePolicyNumber + ", insurancePolicyName=" + insurancePolicyName + ", status=" + status
					+ ", coverageAmount=" + coverageAmount + ", premium=" + premium + ", startDate=" + startDate
					+ ", endDate=" + endDate + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
		}
	    
}
