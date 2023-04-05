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
@Table(name="claim_insurance_mapping")
public class ClaimInsuranceMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="claim_insurance_mapping_id")
	private int claimInsuranceMappingId;
	
	@Column(name="claim_id")
	private int claimId;
	
	@Column(name="insurance_id")
	private int insuranceId;

	public int getClaimInsuranceMappingId() {
		return claimInsuranceMappingId;
	}

	public void setClaimInsuranceMappingId(int claimInsuranceMappingId) {
		this.claimInsuranceMappingId = claimInsuranceMappingId;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	@Override
	public String toString() {
		return "ClaimInsuranceMapping [claimInsuranceMappingId=" + claimInsuranceMappingId + ", claimId=" + claimId
				+ ", insuranceId=" + insuranceId + "]";
	}
	

	    
	    
}
