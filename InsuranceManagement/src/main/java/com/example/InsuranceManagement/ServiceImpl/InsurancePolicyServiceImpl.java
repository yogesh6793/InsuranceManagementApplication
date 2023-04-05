package com.example.InsuranceManagement.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsuranceManagement.Dao.InsurancePolicy;
import com.example.InsuranceManagement.Repository.InsurancePolicyRepo;
import com.example.InsuranceManagement.Service.InsurancePolicyService;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

	@Autowired
	InsurancePolicyRepo insurancePolicyRepo;
	
	@Override
	public List<InsurancePolicy> getAll() {
		// TODO Auto-generated method stub
		List<InsurancePolicy> allPolicies = insurancePolicyRepo.findAll();
		return allPolicies;
	}

	@Override
	public InsurancePolicy getById(int insuranceId) {
		// TODO Auto-generated method stub
		InsurancePolicy insurancePolicyById = insurancePolicyRepo.findById(insuranceId).get();
		return insurancePolicyById;
	}

	@Override
	public InsurancePolicy create(InsurancePolicy insurancePolicy) {
		// TODO Auto-generated method stub
		InsurancePolicy savePolicy = insurancePolicyRepo.save(insurancePolicy);
		return savePolicy;
	}

	@Override
	public InsurancePolicy update(InsurancePolicy insurancePolicy, int insuranceId) {
		// TODO Auto-generated method stub
		InsurancePolicy insurancePolicyById = insurancePolicyRepo.findById(insuranceId).get();
		
		InsurancePolicy update = new InsurancePolicy();
		update.setInsuranceId(insuranceId);
		update.setInsurancePolicyNumber(insurancePolicy.getInsurancePolicyNumber());
		update.setInsurancePolicyName(insurancePolicy.getInsurancePolicyName());
		update.setStatus(insurancePolicy.isStatus());
		update.setCoverageAmount(insurancePolicy.getCoverageAmount());
		update.setPremium(insurancePolicy.getPremium());
		update.setStartDate(insurancePolicy.getStartDate());
		update.setEndDate(insurancePolicy.getEndDate());
		update.setCreatedAt(insurancePolicyById.getCreatedAt());
		update.setModifiedAt(new Date());
		
		InsurancePolicy updated = insurancePolicyRepo.save(update);
		return updated;
	}

	@Override
	public void deleteById(int insuranceId) {
		// TODO Auto-generated method stub
		insurancePolicyRepo.deleteById(insuranceId);
	}

	
}
