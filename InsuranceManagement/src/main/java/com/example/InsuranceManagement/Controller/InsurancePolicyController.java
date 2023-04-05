package com.example.InsuranceManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsuranceManagement.Dao.InsurancePolicy;
import com.example.InsuranceManagement.Service.InsurancePolicyService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class InsurancePolicyController {

	@Autowired
	InsurancePolicyService insurancePolicyService;
	
	 @RequestMapping(value="/policies", method=RequestMethod.GET)
	    public ResponseEntity<List<InsurancePolicy>> getAllInsurancePolicies(){
	        List<InsurancePolicy> listOfInsurancePolicy = insurancePolicyService.getAll();
	        return new ResponseEntity<List<InsurancePolicy>>(listOfInsurancePolicy, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/policies/{insuranceId}", method=RequestMethod.GET)
	    public ResponseEntity<InsurancePolicy> getInsurancePolicyById(@PathVariable int insuranceId){
		 InsurancePolicy insurancePolicyById = insurancePolicyService.getById(insuranceId);
	        return new ResponseEntity<InsurancePolicy>(insurancePolicyById, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/policies", method=RequestMethod.POST)
	    public ResponseEntity<InsurancePolicy> createInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy){
		 InsurancePolicy saveInsurancePolicy = insurancePolicyService.create(insurancePolicy);
		 	return new ResponseEntity<InsurancePolicy>(saveInsurancePolicy, HttpStatus.CREATED);
	    }
	
	 @RequestMapping(value="/policies/{insuranceId}", method=RequestMethod.PUT)
	    public ResponseEntity<InsurancePolicy> updateInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy, @PathVariable int insuranceId){
		 InsurancePolicy updateInsurancePolicy = insurancePolicyService.update(insurancePolicy,insuranceId);
		 	return new ResponseEntity<InsurancePolicy>(updateInsurancePolicy, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value="/policies/{insuranceId}", method=RequestMethod.DELETE)
	    public ResponseEntity<InsurancePolicy> deleteInsurancePolicyByID(@PathVariable int insuranceId){
		 insurancePolicyService.deleteById(insuranceId);
	        return new ResponseEntity<InsurancePolicy>(HttpStatus.OK);
	 }
	 
	
	    
}
