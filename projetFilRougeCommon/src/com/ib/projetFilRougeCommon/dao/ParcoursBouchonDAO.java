package com.ib.projetFilRougeCommon.dao;

import java.util.Date;
import java.util.List;

import com.ib.projetFilRougeCommon.bo.Parcours;

public class ParcoursBouchonDAO implements IParcoursDAO {

	private List<Parcours> parcourss;

	@Override
	public List<Parcours> findAll() {
		
		// bouchon
		Parcours parcours = new Parcours(1,"Java EE",true,false,null);
		parcourss.add(parcours);
		parcours = new Parcours(2,"Devops",true,false,null);
		parcourss.add(parcours);

		return parcourss;
	}

	@Override
	public void delete(Parcours parcours) {
		// TODO Auto-generated method stub

	}

	@Override
	public Parcours update(Parcours parcours) {
		
		return parcours;

	}

	@Override
	public Parcours save(Parcours parcours) {
		parcours.setId(9999);
		return null;
	}

	@Override
	public Parcours get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
