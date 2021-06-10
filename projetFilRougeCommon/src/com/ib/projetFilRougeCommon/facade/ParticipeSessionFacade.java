package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.ParticipeSession;
import com.ib.projetFilRougeCommon.dao.IParticipeSessionDAO;

public class ParticipeSessionFacade implements IParticipeSessionFacade {

	private IParticipeSessionDAO participesessionDAO = null;

	public ParticipeSessionFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ParticipeSession> findAll() {
		List<ParticipeSession> participe_sessions = null;

		// appel à la couche DAO
		participe_sessions = participesessionDAO.findAll();

		return participe_sessions;
	}

	@Override
	public void delete(ParticipeSession participe_session) {
		participesessionDAO.delete(participe_session);

	}

	@Override
	public ParticipeSession update(ParticipeSession participe_session) {
		ParticipeSession participe_sessionUpdate = participesessionDAO.update(participe_session);
		return participe_sessionUpdate;
	}

	@Override
	public ParticipeSession save(ParticipeSession participe_session) {
		ParticipeSession participe_sessionSave = participesessionDAO.save(participe_session);
		return participe_sessionSave;

	}

	@Override
	public ParticipeSession get(Integer id) {
		ParticipeSession participe_session = participesessionDAO.get(id);
		return participe_session;
	}

	/**
	 * @return the participesessionDAO
	 */
	public IParticipeSessionDAO getParticipesessionDAO() {
		return participesessionDAO;
	}

	/**
	 * @param participesessionDAO the participesessionDAO to set
	 */
	public void setParticipesessionDAO(IParticipeSessionDAO participesessionDAO) {
		this.participesessionDAO = participesessionDAO;
	}

}
