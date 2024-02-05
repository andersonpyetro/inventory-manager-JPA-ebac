package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.ClienteJpa;

import br.com.pyetro.generic.GenericJpaDB1DAO;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}