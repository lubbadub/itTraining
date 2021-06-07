package com.ib.projetFilRougeCommon.dao;

import java.util.Date;
import java.util.List;

import com.ib.projetFilRougeCommon.bo.Session;

public class SessionBouchonDAO implements ISessionDAO {
	private List<Session> sessions;

	@Override
	public List<Session> findAll() {
		Session session = new Session(98, new Date(), new Date(), null, null, null);
		sessions.add(session);
		session = new Session(99, new Date(), new Date(), null, null, null);
		sessions.add(session);
		return sessions;
	}

	@Override
	public Session save(Session session) {
		return session;
	}

	@Override
	public Session get(Integer id) {
		return null;
	}

	@Override
	public Session update(Session session) {
		return session;
	}

	@Override
	public void delete(Session bo) {

	}

}
