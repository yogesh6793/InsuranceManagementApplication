package com.example.InsuranceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InsuranceManagement.Dao.InsurancePolicy;

@Repository("insurance_policies")
public interface InsurancePolicyRepo extends JpaRepository<InsurancePolicy, Integer> {

}
