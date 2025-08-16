/**
 * 
 */
package br.com.jobson.dao;

import br.com.jobson.dao.generic.GenericDB3DAO;
import br.com.jobson.domain.Cliente;

/**
 * 
 */
public class ClienteDB3DAO extends GenericDB3DAO<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDB3DAO() {
			super(Cliente.class);
		}

}
