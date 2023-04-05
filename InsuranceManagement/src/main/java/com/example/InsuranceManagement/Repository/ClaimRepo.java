package com.example.InsuranceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InsuranceManagement.Dao.Claim;

@Repository("claims")
public interface ClaimRepo extends JpaRepository<Claim, Integer>{

}
