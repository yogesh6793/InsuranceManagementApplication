package com.example.InsuranceManagement.Service;

import java.util.List;

import com.example.InsuranceManagement.Dao.Client;

public interface ClientService {

	List<Client> getAll();

	Client getById(int clientId);

	Client create(Client client);

	Client update(Client client, int clientId);

	Client deleteById(int clientId);

}
