package com.info.xpacknow.service;

import java.util.List;

import com.info.xpacknow.domain.Client;

public interface ClientService {

	List<Client> getAllClient();

	Client getClientById(String clienciID);

	void addClient(Client client);

	Client getClientByLogin(String login);

	void updateClient(Client client, int id);

	void delateClient(int id);

}
