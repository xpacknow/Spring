package com.info.xpacknow.repositoryImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.info.xpacknow.domain.Client;
import com.info.xpacknow.repository.ClientRepository;


@Repository
@Transactional(readOnly=true)
public class ClientRepositoryImp implements ClientRepository {



	
	
	
	
	@PersistenceContext(unitName = "testPU")
	private EntityManager en;
	
	@Override
	@Transactional(readOnly=false)
	public List<Client> getAllClient() {
		
		TypedQuery<Client> createQuery = en.createQuery("select e from Client e ", Client.class);
		List<Client> resultList = createQuery.getResultList();

		return resultList;
	}

	@Override
	@Transactional(readOnly=false)
	public Client getClientById(int clientId) {
		return en.find(Client.class, clientId);
	}



	@Override
	@Transactional(readOnly=false)
	public void addClient(Client client) {
				
	 en.merge(client);
		
		

	}

	
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=false)
	public Client getClientLogin(String login) {
		 
    	Query query = en.createQuery("from Client u where u.login = :login");
        
     
        
        query.setParameter("login", login);
        List<Client> userList = query.getResultList();
        
        
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;    
    }

	@Override
	public void updateClient(Client client, int id) {

		Query query = en.createQuery(
				"UPDATE Client u SET haslo=:haslo, imie=:imie, nazwisko=:nazwisko, nip =:nip   WHERE u.idKlient=:id");
		query.setParameter("id", id);
		query.setParameter("haslo", client.getHaslo());
		query.setParameter("imie", client.getImie());
		query.setParameter("nazwisko", client.getNazwisko());
		query.setParameter("nip", client.getNip());
		query.executeUpdate();

		
	}

	@Override
	public void delateClient(int id) {

		System.out.println(id);
		Query query = en.createQuery("DELETE FROM Client u WHERE u.idKlient=:id ");
		query.setParameter("id", id);
		query.executeUpdate();
		
	}
	}

	
	
	
	
	

