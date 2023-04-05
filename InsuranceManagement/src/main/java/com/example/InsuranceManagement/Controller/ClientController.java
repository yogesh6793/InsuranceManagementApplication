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

import com.example.InsuranceManagement.Dao.Client;
import com.example.InsuranceManagement.Service.ClientService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	 @RequestMapping(value="/clients", method=RequestMethod.GET)
	    public ResponseEntity<List<Client>> getAllClients(){
	        List<Client> listOfClient = clientService.getAll();
	        return new ResponseEntity<List<Client>>(listOfClient, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/clients/{clientId}", method=RequestMethod.GET)
	    public ResponseEntity<Client> getClientById(@PathVariable int clientId){
	        Client clientById = clientService.getById(clientId);
	        return new ResponseEntity<Client>(clientById, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/clients", method=RequestMethod.POST)
	    public ResponseEntity<Client> createClient(@RequestBody Client client){
		 	Client saveClient = clientService.create(client);
		 	return new ResponseEntity<Client>(saveClient, HttpStatus.CREATED);
	    }
	
	 @RequestMapping(value="/clients/{clientId}", method=RequestMethod.PUT)
	    public ResponseEntity<Client> updateClient(@RequestBody Client client, @PathVariable int clientId){
		 	Client updateClient = clientService.update(client,clientId);
		 	return new ResponseEntity<Client>(updateClient, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value="/clients/{clientId}", method=RequestMethod.DELETE)
	    public ResponseEntity<Client> deleteClientByID(@PathVariable int clientId){
	       	clientService.deleteById(clientId);
	        return new ResponseEntity<Client>(HttpStatus.OK);
	 }
	 
}
