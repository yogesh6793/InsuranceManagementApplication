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

import com.example.InsuranceManagement.Dao.Claim;
import com.example.InsuranceManagement.Service.ClaimService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClaimController {

	@Autowired
	ClaimService claimService;
	
	 @RequestMapping(value="/claims", method=RequestMethod.GET)
	    public ResponseEntity<List<Claim>> getAllClaim(){
	        List<Claim> listOfClaim = claimService.getAll();
	        return new ResponseEntity<List<Claim>>(listOfClaim, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/claims/{claimId}", method=RequestMethod.GET)
	    public ResponseEntity<Claim> getClaimById(@PathVariable int claimId){
		 Claim claimById = claimService.getById(claimId);
	        return new ResponseEntity<Claim>(claimById, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/claims", method=RequestMethod.POST)
	    public ResponseEntity<Claim> createClaim(@RequestBody Claim claim){
		 Claim saveClaim = claimService.create(claim);
		 	return new ResponseEntity<Claim>(saveClaim, HttpStatus.CREATED);
	    }
	
	 @RequestMapping(value="/claims/{claimId}", method=RequestMethod.PUT)
	    public ResponseEntity<Claim> updateClaim(@RequestBody Claim claim, @PathVariable int claimId){
		 Claim updateClaim = claimService.update(claim,claimId);
		 	return new ResponseEntity<Claim>(updateClaim, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value="/claims/{claimId}", method=RequestMethod.DELETE)
	    public ResponseEntity<Claim> deleteClaimByID(@PathVariable int claimId){
		 claimService.deleteById(claimId);
	        return new ResponseEntity<Claim>(HttpStatus.OK);
	 }
	 
}
