package com.info.xpacknow.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.xpacknow.domain.Client;
import com.info.xpacknow.repository.ClientRepository;
import com.info.xpacknow.service.ClientService;

@Service
public class ClientServiceImp implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	
	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientById(String clientID) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addClient(Client client) {
		clientRepository.addClient(client);
	}

	@Override
	public Client getClientByLogin(String login) {

	
		
		return clientRepository.getClientLogin(login);
	}

	@Override
	public void updateClient(Client client, int id) {

		clientRepository.updateClient(client, id);
	}

	@Override
	public void delateClient(int id) {

		clientRepository.delateClient(id);
	}

	



}
