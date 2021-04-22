package fr.banque.dao;

import java.util.List;

import fr.banque.entities.Compte;


public interface CompteDao {

	 public void add(Compte compte);

	    public List<Compte> findAll();

	    public void update(Compte compte);

	    public void delete(Compte compte);

	    public Compte findById(int idcompte);
}
