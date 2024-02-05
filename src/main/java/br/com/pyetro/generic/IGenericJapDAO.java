package br.com.pyetro.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.pyetro.dao.jpa.Persistente;
import br.com.pyetro.exception.DAOException;
import br.com.pyetro.exception.MaisDeUmRegistroException;
import br.com.pyetro.exception.TableException;
import br.com.pyetro.exception.TipoChaveNaoEncontradaException;

public interface IGenericJapDAO<T extends Persistente, E extends Serializable> {

	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

	public void excluir(T entity) throws DAOException;

	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

	public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

	public Collection<T> buscarTodos() throws DAOException;
}