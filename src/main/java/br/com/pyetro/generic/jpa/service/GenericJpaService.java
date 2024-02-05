package br.com.pyetro.generic.jpa.service;

import java.io.Serializable;
import java.util.Collection;


import br.com.pyetro.exception.TipoChaveNaoEncontradaException;
import br.com.pyetro.dao.jpa.Persistente;
import br.com.pyetro.exception.DAOException;
import br.com.pyetro.exception.MaisDeUmRegistroException;
import br.com.pyetro.exception.TableException;
import br.com.pyetro.generic.IGenericJapDAO;

public abstract class GenericJpaService<T extends Persistente, E extends Serializable>
		implements IGenericJpaService<T, E> {

	protected IGenericJapDAO<T, E> dao;

	public GenericJpaService(IGenericJapDAO<T, E> dao) {
		this.dao = dao;
	}

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}

}