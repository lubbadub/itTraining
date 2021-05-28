package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Entreprise;

public class EntrepriseBouchonDAO implements IEntrepriseDAO {

	private List<Entreprise> entreprises;

	@Override
	public List<Entreprise> findAll() {
		// List<Livre> livres = new ArrayList<Livre>();

		// bouchon
		Entreprise entreprise = new Entreprise(800, " xmen1");
		entreprises.add(entreprise);
		entreprise = new Entreprise(800, " xmen2");
		entreprises.add(entreprise);

		return entreprises;
	}

	@Override
	public void delete(Entreprise entreprise) {
		// TODO Auto-generated method stub

	}

	@Override
	public Entreprise update(Entreprise entreprise) {
		return entreprise;

	}

	@Override
	public Entreprise save(Entreprise entreprise) {
		entreprise.setId(800);
		return entreprise;
	}

	@Override
	public Entreprise get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

}
