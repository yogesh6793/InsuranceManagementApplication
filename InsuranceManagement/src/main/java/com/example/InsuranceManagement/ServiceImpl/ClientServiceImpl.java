package com.example.InsuranceManagement.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsuranceManagement.Dao.Client;
import com.example.InsuranceManagement.Repository.ClientRepo;
import com.example.InsuranceManagement.Service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepo clientRepo;
	
	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		List<Client> allClient = clientRepo.findAll();
		return allClient;
	}

	@Override
	public Client getById(int clientId) {
		// TODO Auto-generated method stub
		Client client = clientRepo.findById(clientId).get();
		return client;
	}

	@Override
	public Client create(Client client) {
		// TODO Auto-generated method stub
		Client save = clientRepo.save(client);
		return save;
	}

	@Override
	public Client update(Client client, int clientId) {
		// TODO Auto-generated method stub
		Client clientById = clientRepo.findById(clientId).get();
		
		Client update = new Client();
		update.setClientId(clientId);
		update.setClientName(client.getClientName());
		update.setStatus(client.isStatus());
		update.setDateOfBirth(client.getDateOfBirth());
		update.setEmail(client.getEmail());
		update.setPhone(client.getPhone());
		update.setAddress(client.getAddress());
		update.setCity(client.getCity());
		update.setState(client.getState());
		update.setZip(client.getZip());
		update.setClientPhoto(client.getClientPhoto());
		update.setCreatedAt(clientById.getCreatedAt());
		update.setModifiedAt(new Date());
	
		Client updatedClient = clientRepo.save(update);
		return updatedClient;
	}

	@Override
	public Client deleteById(int clientId) {
		// TODO Auto-generated method stub
		clientRepo.deleteById(clientId);
		return null;
	}

}
