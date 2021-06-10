package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.ParticipeSession;

public class ParticipeSessionDAO extends AbstractDAO<ParticipeSession> implements IParticipeSessionDAO {

	public ParticipeSessionDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ParticipeSession> findAll() {
		List<ParticipeSession> participe_session = null;

		// recuperation des livres en BD (SELECT)
		participe_session = em.createQuery("from Participe_Session").getResultList();

		return participe_session;
	}

	@Override
	public ParticipeSession get(Integer id) {
		ParticipeSession participe_session = null;
		participe_session = em.find(ParticipeSession.class, id);
		return participe_session;
	}
}
