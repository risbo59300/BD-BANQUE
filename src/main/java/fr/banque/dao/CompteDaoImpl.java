package fr.banque.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.banque.entities.Compte;

@Repository
public class CompteDaoImpl implements CompteDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Compte compte) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(compte);
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		List<Compte> listCompte = sessionFactory.getCurrentSession().createQuery("from Compte").list();
		return listCompte;
	}

	@Override
	public void update(Compte compte) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(compte);

	}

	@Override
	public void delete(Compte compte) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(compte);
	}

	@Override
	public Compte findById(int idcompte) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Compte.class, idcompte);
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
