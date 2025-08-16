/**
 * 
 */
package br.com.jobson.dao.generic;

import java.io.Serializable;

import br.com.jobson.dao.Persistente;

/**
 * 
 */
public abstract class GenericDB3DAO<T extends Persistente, E extends Serializable> extends GenericDAO<T, E> {

	public GenericDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "MySQLDatabase");
	}

}
