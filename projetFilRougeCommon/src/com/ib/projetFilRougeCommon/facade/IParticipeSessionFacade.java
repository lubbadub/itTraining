package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.ParticipeSession;

public interface IParticipeSessionFacade {

	List<ParticipeSession> findAll();

	void delete(ParticipeSession participe_session);

	ParticipeSession update(ParticipeSession participe_session);

	ParticipeSession save(ParticipeSession participe_session);

	ParticipeSession get(Integer id);

}