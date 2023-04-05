package com.example.InsuranceManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsuranceManagement.Dao.Claim;
import com.example.InsuranceManagement.Dao.ClaimInsuranceMapping;
import com.example.InsuranceManagement.Dao.Client;
import com.example.InsuranceManagement.Dao.ClientInsuranceMapping;
import com.example.InsuranceManagement.Dao.InsurancePolicy;
import com.example.InsuranceManagement.Model.ResponseModel;
import com.example.InsuranceManagement.Repository.ClaimInsuranceMappingRepo;
import com.example.InsuranceManagement.Repository.ClaimRepo;
import com.example.InsuranceManagement.Repository.ClientInsuranceMappingRepo;
import com.example.InsuranceManagement.Repository.ClientRepo;
import com.example.InsuranceManagement.Repository.InsurancePolicyRepo;
import com.example.InsuranceManagement.Service.ResponseService;

@Service
public class ResponseServiceImpl implements ResponseService{

	@Autowired
	ClientRepo clientRepo;
	
	@Autowired
	ClientInsuranceMappingRepo clientInsuranceMappingRepo;
	
	@Autowired
	InsurancePolicyRepo insurancePolicyRepo;
	
	@Autowired
	ClaimInsuranceMappingRepo claimInsuranceMappingRepo;
	
	@Autowired
	ClaimRepo claimRepo;
	
	@Override
	public List<ResponseModel> getResponseModelData() {
		// TODO Auto-generated method stub
		ArrayList<ResponseModel> resultList = new ArrayList<>();
		
		List<Client> clientList = clientRepo.findAll();

		for (Client client : clientList) {
			ResponseModel result = new ResponseModel();
			Client clientData = clientRepo.findById(client.getClientId()).get();		//client table data

			Client clientObj = new Client();
			clientObj.setClientId(clientData.getClientId());
			clientObj.setClientName(clientData.getClientName());
			clientObj.setStatus(clientData.isStatus());
			clientObj.setDateOfBirth(clientData.getDateOfBirth());
			clientObj.setAddress(clientData.getAddress());
			clientObj.setCity(clientData.getCity());
			clientObj.setState(clientData.getState());
			clientObj.setPhone(clientData.getPhone());
			clientObj.setEmail(clientData.getEmail());
			clientObj.setZip(clientData.getZip());
			clientObj.setClientPhoto(clientData.getClientPhoto());
			result.setClient(clientObj);
			
			List<Integer> clientInsurance = clientInsuranceMappingRepo.getInsuranceIdByClientId(client.getClientId());		//clientInsuranceMapping data
			ArrayList<InsurancePolicy> insuranceListObj = new ArrayList<>();
			if(clientInsurance.size()>0) {
				for (Integer insuranceId : clientInsurance) {
				
					InsurancePolicy insurance = insurancePolicyRepo.findById(insuranceId).get();		//insurance Data
					InsurancePolicy insuranceObj = new InsurancePolicy();
					insuranceObj.setInsuranceId(insurance.getInsuranceId());
					insuranceObj.setInsurancePolicyNumber(insurance.getInsurancePolicyNumber());
					insuranceObj.setInsurancePolicyName(insurance.getInsurancePolicyName());
					insuranceObj.setStatus(insurance.isStatus());
					insuranceObj.setCoverageAmount(insurance.getCoverageAmount());
					insuranceObj.setPremium(insurance.getPremium());
					insuranceObj.setStartDate(insurance.getStartDate());
					insuranceObj.setEndDate(insurance.getEndDate());
					insuranceListObj.add(insuranceObj);
				
				
					ArrayList<Claim> claimListObj = new ArrayList<>();
					if(insuranceId!=null || insuranceId!=0) {
						List<ClaimInsuranceMapping> claimInsurance = claimInsuranceMappingRepo.findByInsuranceId(insuranceId);	//claimInsuraceMapping Data
				
						if(claimInsurance!=null) {
							for (ClaimInsuranceMapping claim : claimInsurance) {
					
								Claim claimData = claimRepo.findById(claim.getClaimId()).get();		//claim Data
								Claim claimObj = new Claim();
								claimObj.setClaimId(claimData.getClaimId());
								claimObj.setClaimNumber(claimData.getClaimNumber());
								claimObj.setClaimDescription(claimData.getClaimDescription());
								claimObj.setClaimDate(claimData.getClaimDate());
								claimObj.setStatus(claimData.isStatus());
								claimListObj.add(claimObj);
				
							}
						}
					}
					result.setClaimList(claimListObj);
				
				}
			}
			result.setInsurancePolicyList(insuranceListObj);
	
			resultList.add(result);	
		}
		
		return resultList;
	}

}
