package com.example.InsuranceManagement.Service;

import java.util.List;

import com.example.InsuranceManagement.Dao.Claim;

public interface ClaimService {

	List<Claim> getAll();

	Claim getById(int claimId);

	Claim create(Claim claim);

	Claim update(Claim claim, int claimId);

	void deleteById(int claimId);

}
