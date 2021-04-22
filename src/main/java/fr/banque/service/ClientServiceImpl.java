package fr.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.banque.dao.ClientDaoImpl;
import fr.banque.entities.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	 private ClientDaoImpl clientdao;
	
	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub
		clientdao.add(client);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientdao.findAll();
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		clientdao.update(client);
	}

	@Override
	public void delete(Client client) {
		// TODO Auto-generated method stub
		clientdao.delete(client);
	}

	@Override
	public Client findById(int idclient) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the clientdao
	 */
	public ClientDaoImpl getClientdao() {
		return clientdao;
	}

	/**
	 * @param clientdao the clientdao to set
	 */
	public void setClientdao(ClientDaoImpl clientdao) {
		this.clientdao = clientdao;
	}

}
