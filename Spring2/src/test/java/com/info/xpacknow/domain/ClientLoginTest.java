package com.info.xpacknow.domain;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.info.xpacknow.repository.ClientRepository;
import com.info.xpacknow.repositoryImp.ClientRepositoryImp;


public class ClientLoginTest {
	
	private ClientRepository clientRepository;

	@Before
	public void setup() {
		
		clientRepository = new ClientRepositoryImp();
	}
	
	@Test
	public void client_login() {
		
		
	
		 Client client = new Client(179,"Login","Haslo");
		clientRepository.addClient(client);
		Client clientById = clientRepository.getClientById(client.getIdKlient());
		
		//Por�wnaj
		Assert.assertEquals(clientById, client.getLogin());
	}	
}
