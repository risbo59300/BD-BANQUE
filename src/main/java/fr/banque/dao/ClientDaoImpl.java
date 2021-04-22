package fr.banque.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.banque.entities.Client;
import fr.banque.entities.Compte;

@Repository
public class ClientDaoImpl implements ClientDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(client);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		List<Client> listClient = sessionFactory.getCurrentSession().createQuery("from Client").list();
		return listClient;
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(client);
	}

	@Override
	public void delete(Client client) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(client);
	}

	@Override
	public Client findById(int idclient) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Client.class, idclient);
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
