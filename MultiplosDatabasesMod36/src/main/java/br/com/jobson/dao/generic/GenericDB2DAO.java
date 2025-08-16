/**
 * 
 */
package br.com.jobson.dao.generic;

import java.io.Serializable;

import br.com.jobson.dao.Persistente;

/**
 * @author jobson.oliveira
 */
public abstract class GenericDB2DAO<T extends Persistente, E extends Serializable> extends GenericDAO<T, E> {

	public GenericDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "PostgreTwo");
	}

}
