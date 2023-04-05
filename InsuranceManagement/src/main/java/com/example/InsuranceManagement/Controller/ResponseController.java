package com.example.InsuranceManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsuranceManagement.Model.ResponseModel;
import com.example.InsuranceManagement.Service.ResponseService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ResponseController {
	
	@Autowired
	ResponseService responseService;
	
	 @RequestMapping(value="/allResponseData", method=RequestMethod.GET)
	    public ResponseEntity<List<ResponseModel>> getAllResponseData(){
		 List<ResponseModel> result = responseService.getResponseModelData();
	        return new ResponseEntity<List<ResponseModel>>(result, HttpStatus.OK);
	 }

}
