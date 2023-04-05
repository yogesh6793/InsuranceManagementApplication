package com.example.InsuranceManagement.Service;

import java.util.List;

import com.example.InsuranceManagement.Dao.InsurancePolicy;

public interface InsurancePolicyService {

	List<InsurancePolicy> getAll();

	InsurancePolicy getById(int insuranceId);

	InsurancePolicy create(InsurancePolicy insurancePolicy);

	InsurancePolicy update(InsurancePolicy insurancePolicy, int insuranceId);

	void deleteById(int insuranceId);

}
