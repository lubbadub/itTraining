package com.ib.projetFilRougeCommon.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ib.projetFilRougeCommon.bo.Parcours;
import com.ib.projetFilRougeCommon.bo.Responsable;
import com.ib.projetFilRougeCommon.bo.Salle;

public class SalleBouchonDAO implements ISalleDAO {

	private List<Salle> salles;

	@Override
	public List<Salle> findAll() {
		
		List<Salle> salles = new ArrayList<Salle>();

		// bouchon
		Salle salle = new Salle(1,"Toulouse","rue de la découverte");
		salles.add(salle);
		salle = new Salle(2,"Paris","La défense");
		salles.add(salle);
		

		return salles;
	
	}

	@Override
	public Salle save(Salle bo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salle get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salle update(Salle bo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Salle bo) {
		// TODO Auto-generated method stub
		
	}


	


}
