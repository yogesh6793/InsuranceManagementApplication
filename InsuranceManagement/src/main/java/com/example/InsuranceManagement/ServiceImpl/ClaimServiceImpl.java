package com.example.InsuranceManagement.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsuranceManagement.Dao.Claim;
import com.example.InsuranceManagement.Repository.ClaimRepo;
import com.example.InsuranceManagement.Service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService  {

	@Autowired
	ClaimRepo claimRepo;
	
	@Override
	public List<Claim> getAll() {
		// TODO Auto-generated method stub
		List<Claim> allClaim = claimRepo.findAll();
		return allClaim;
	}

	@Override
	public Claim getById(int claimId) {
		// TODO Auto-generated method stub
		Claim claimById = claimRepo.findById(claimId).get();
		return claimById;
	}

	@Override
	public Claim create(Claim claim) {
		// TODO Auto-generated method stub
		Claim saveClaim = claimRepo.save(claim);
		return saveClaim;
	}

	@Override
	public Claim update(Claim claim, int claimId) {
		// TODO Auto-generated method stub
		Claim claimById = claimRepo.findById(claimId).get();
		
		Claim update = new Claim();
		update.setClaimId(claimId);
		update.setClaimNumber(claim.getClaimNumber());
		update.setStatus(claim.isStatus());
		update.setClaimDescription(claim.getClaimDescription());
		update.setClaimDate(claim.getClaimDate());
		update.setCreatedAt(claimById.getCreatedAt());
		update.setModifiedAt(new Date());
		
		Claim updated = claimRepo.save(update);
		return updated;
	}

	@Override
	public void deleteById(int claimId) {
		// TODO Auto-generated method stub
		claimRepo.deleteById(claimId);
	}

}
