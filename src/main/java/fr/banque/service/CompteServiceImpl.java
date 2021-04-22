package fr.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fr.banque.dao.CompteDaoImpl;
import fr.banque.entities.Compte;

@Service
public class CompteServiceImpl implements CompteService {

	@Autowired
	 private CompteDaoImpl comptedao;
	
	@Transactional (readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void add(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.add(compte);
	}
	@Transactional (readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return comptedao.findAll();
	}

	@Override
	public void update(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.update(compte);
	}

	@Override
	public void delete(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.delete(compte);
	}

	@Override
	public Compte findById(int idcompte) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the comptedao
	 */
	public CompteDaoImpl getComptedao() {
		return comptedao;
	}

	/**
	 * @param comptedao the comptedao to set
	 */
	public void setComptedao(CompteDaoImpl comptedao) {
		this.comptedao = comptedao;
	}

}
