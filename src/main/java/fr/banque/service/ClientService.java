package fr.banque.service;

import java.util.List;

import fr.banque.entities.Client;


public interface ClientService {

	 public void add(Client client);

	    public List<Client> findAll();

	    public void update(Client client);

	    public void delete(Client client);

	    public Client findById(int idclient);
}
