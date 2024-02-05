package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.ClienteJpa;
import br.com.pyetro.generic.GenericJpaDAO;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}