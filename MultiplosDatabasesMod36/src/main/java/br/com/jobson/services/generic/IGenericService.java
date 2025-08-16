/**
 * 
 */
package br.com.jobson.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.jobson.dao.Persistente;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.MaisDeUmRegistroException;
import br.com.jobson.exceptions.TableException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author jobson.oliveira
 *
 */
public interface IGenericService <T extends Persistente, E extends Serializable> {
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}

