package com.ib.projetFilRougeCommon.dao;

import java.util.List;

public interface IDAO<T> {

	List<T> findAll();

	T save(T bo);

	T get(Integer id);

	T update(T bo);

	void delete(T bo);

}