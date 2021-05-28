package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Session;

public interface ISessionFacade {

	Session get(Integer id);

	Session save(Session session);

	Session update(Session session);

	void delete(Session session);

	List<Session> findAll();

}