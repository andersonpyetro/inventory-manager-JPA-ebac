package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.ProdutoJpa;

import br.com.pyetro.generic.GenericJpaDB1DAO;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
