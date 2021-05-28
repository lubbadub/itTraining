package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Session;
import com.ib.projetFilRougeCommon.dao.ISessionDAO;

public class SessionFacade implements ISessionFacade {

	private ISessionDAO sessionDAO = null;

	public SessionFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Session> findAll() {
		List<Session> sessions = null;

		// appel à la couche DAO
		sessions = sessionDAO.findAll();

		return sessions;
	}

	@Override
	public void delete(Session session) {
		sessionDAO.delete(session);

	}

	@Override
	public Session update(Session session) {
		Session sessionUpdate = sessionDAO.update(session);
		return sessionUpdate;
	}

	@Override
	public Session save(Session session) {
		Session sessionSave = sessionDAO.save(session);
		return sessionSave;

	}

	@Override
	public Session get(Integer id) {
		Session session = sessionDAO.get(id);
		return session;
	}

	/**
	 * @return the sessionDAO
	 */
	public ISessionDAO getSessionDAO() {
		return sessionDAO;
	}

	/**
	 * @param sessionDAO the sessionDAO to set
	 */
	public void setSessionDAO(ISessionDAO sessionDAO) {
		this.sessionDAO = sessionDAO;
	}

}
