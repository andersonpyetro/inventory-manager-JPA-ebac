package br.com.pyetro.generic;

import java.io.Serializable;

import br.com.pyetro.dao.jpa.Persistente;

public abstract class GenericJpaDB2DAO<T extends Persistente, E extends Serializable> extends GenericJpaDAO<T, E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgres");
	}

}