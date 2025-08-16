/**
 * 
 */
package br.com.jobson.dao;

import br.com.jobson.dao.generic.IGenericDAO;
import br.com.jobson.domain.Cliente;

/**
 * @author jobson.oliveira
 *
 */
public interface IClienteDAO<T extends Persistente> extends IGenericDAO<T, Long>{

}