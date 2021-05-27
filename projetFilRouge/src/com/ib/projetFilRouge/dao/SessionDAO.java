package com.ib.projetFilRouge.dao;

import java.util.List;

import com.ib.projetFilRouge.bo.Session;

public class SessionDAO implements ISessionDAO {

	public SessionDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Session> findAll() {
		List<Session> session = null;

		// recuperation des livres en BD (SELECT)
		session = em.createQuery("from Session").getResultList();

		return session;
	}

	@Override
	public Session get(Integer id) {
		Session session = null;
		session = em.find(Session.class, id);
		return session;
	}
}
