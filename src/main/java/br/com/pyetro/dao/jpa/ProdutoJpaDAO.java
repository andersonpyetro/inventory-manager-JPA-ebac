package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.ProdutoJpa;
import br.com.pyetro.generic.GenericJpaDAO;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
