package br.com.pyetro.generic;

import java.io.Serializable;

import br.com.pyetro.dao.jpa.Persistente;

public abstract class GenericJpaDB1DAO<T extends Persistente, E extends Serializable> extends GenericJpaDAO<T, E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "JPAebac");
	}

}
