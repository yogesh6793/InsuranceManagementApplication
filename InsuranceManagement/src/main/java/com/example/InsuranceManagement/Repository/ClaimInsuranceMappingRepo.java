package com.example.InsuranceManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.InsuranceManagement.Dao.ClaimInsuranceMapping;

@Repository("claim_insurance_mapping")
public interface ClaimInsuranceMappingRepo extends JpaRepository<ClaimInsuranceMapping, Integer> {

	@Query(value="select * from claim_insurance_mapping where insurance_id=:insuranceId",nativeQuery = true)
	List<ClaimInsuranceMapping> findByInsuranceId(int insuranceId);

}
