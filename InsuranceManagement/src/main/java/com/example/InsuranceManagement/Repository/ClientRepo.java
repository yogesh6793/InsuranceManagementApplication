package com.example.InsuranceManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.InsuranceManagement.Dao.Client;
import com.example.InsuranceManagement.Dao.InsurancePolicy;

@Repository("clients")
public interface ClientRepo extends JpaRepository<Client, Integer> {

	@Query(value="select * from clients where client_id=:clientId",nativeQuery = true)
	Client findByClientId(int clientId);

}
