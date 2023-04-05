package com.example.InsuranceManagement.Model;

import java.util.List;

import com.example.InsuranceManagement.Dao.Claim;
import com.example.InsuranceManagement.Dao.Client;
import com.example.InsuranceManagement.Dao.InsurancePolicy;

public class ResponseModel {

	private Client client;
	
	private List<InsurancePolicy> insurancePolicyList;
	
	private List<Claim> claimList;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<InsurancePolicy> getInsurancePolicyList() {
		return insurancePolicyList;
	}

	public void setInsurancePolicyList(List<InsurancePolicy> insurancePolicyList) {
		this.insurancePolicyList = insurancePolicyList;
	}

	public List<Claim> getClaimList() {
		return claimList;
	}

	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}

	
	
	
}
