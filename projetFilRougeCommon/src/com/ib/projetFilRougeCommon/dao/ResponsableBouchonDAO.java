package com.ib.projetFilRougeCommon.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ib.projetFilRougeCommon.bo.Parcours;
import com.ib.projetFilRougeCommon.bo.Responsable;

public class ResponsableBouchonDAO implements IResponsableDAO {

	private List<Responsable> responsables;

	@Override
	public List<Responsable> findAll() {
		
		List<Responsable> responsables = new ArrayList<Responsable>();

		// bouchon
		Responsable responsable = new Responsable(1,"Dufloux","Thierry","Responsable emargement");
		responsables.add(responsable);
		responsable = new Responsable(2,"Haut","Claude","Responsable salut");
		responsables.add(responsable);
		

		return responsables;
	}

	@Override
	public Responsable save(Responsable bo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Responsable get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Responsable update(Responsable bo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Responsable bo) {
		// TODO Auto-generated method stub
		
	}


	


}
