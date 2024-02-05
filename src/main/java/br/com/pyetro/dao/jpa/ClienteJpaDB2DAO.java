package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.ClienteJpa;
import br.com.pyetro.generic.GenericJpaDB2DAO;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}