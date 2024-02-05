package br.com.pyetro.generic.jpa.service;

import java.io.Serializable;
import java.util.Collection;

import br.com.pyetro.dao.jpa.Persistente;
import br.com.pyetro.exception.DAOException;
import br.com.pyetro.exception.MaisDeUmRegistroException;
import br.com.pyetro.exception.TableException;
import br.com.pyetro.exception.TipoChaveNaoEncontradaException;

public interface IGenericJpaService<T extends Persistente, E extends Serializable> {

	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

	public void excluir(T entity) throws DAOException;

	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

	public Collection<T> buscarTodos() throws DAOException;

}