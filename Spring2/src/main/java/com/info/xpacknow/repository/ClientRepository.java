package com.info.xpacknow.repository;

import java.util.List;


import com.info.xpacknow.domain.Client;


public interface ClientRepository {

	List<Client> getAllClient();

	Client getClientById(String clientID);

	void addClient(Client client);
	
 Client getClientLogin(String login);
 
	void updateClient (Client client, int id);
	
	void delateClient (int id);
}
