package br.com.pyetro.dao.jpa;

import br.com.pyetro.domain.jpa.VendaJpa;
import br.com.pyetro.exception.DAOException;
import br.com.pyetro.exception.TipoChaveNaoEncontradaException;
import br.com.pyetro.generic.IGenericJapDAO;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}
