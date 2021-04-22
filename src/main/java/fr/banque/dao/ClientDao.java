package fr.banque.dao;

import java.util.List;

import fr.banque.entities.Client;


public interface ClientDao {

	 public void add(Client client);

	    public List<Client> findAll();

	    public void update(Client client);

	    public void delete(Client client);

	    public Client findById(int idclient);
}
