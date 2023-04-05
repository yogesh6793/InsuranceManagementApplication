package com.example.InsuranceManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.InsuranceManagement.Dao.ClaimInsuranceMapping;
import com.example.InsuranceManagement.Dao.ClientInsuranceMapping;

@Repository("client_insurance_mapping")
public interface ClientInsuranceMappingRepo extends JpaRepository<ClaimInsuranceMapping, Integer> {

	@Query(value="select insurance_id from client_insurance_mapping where client_id=:clientId",nativeQuery = true)
	List<Integer> getInsuranceIdByClientId(int clientId);

}
