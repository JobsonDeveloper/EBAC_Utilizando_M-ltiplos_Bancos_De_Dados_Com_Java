/**
 * 
 */
package br.com.jobson.dao;

import br.com.jobson.dao.generic.GenericDAO;
import br.com.jobson.dao.generic.GenericDB2DAO;
import br.com.jobson.domain.Cliente;

/**
 * @author jobson.oliveira
 */
public class ClienteDB2DAO extends GenericDB2DAO<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDB2DAO() {
		super(Cliente.class);
	}

}
