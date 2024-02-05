package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.ClienteJpa2;
import br.com.pyetro.generic.GenericJpaDB3DAO;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}