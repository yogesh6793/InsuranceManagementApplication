package com.example.InsuranceManagement.Dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="client_insurance_mapping")
public class ClientInsuranceMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_insurance_mapping_id")
	private int clientInsuranceMappingId;
	
	@Column(name="client_id")
	private int clientId;
	
	@Column(name="insurance_id")
	private int insuranceId;

	public int getClientInsuranceMappingId() {
		return clientInsuranceMappingId;
	}

	public void setClientInsuranceMappingId(int clientInsuranceMappingId) {
		this.clientInsuranceMappingId = clientInsuranceMappingId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	@Override
	public String toString() {
		return "ClientInsuranceMapping [clientInsuranceMappingId=" + clientInsuranceMappingId + ", clientId=" + clientId
				+ ", insuranceId=" + insuranceId + "]";
	}
	


}
