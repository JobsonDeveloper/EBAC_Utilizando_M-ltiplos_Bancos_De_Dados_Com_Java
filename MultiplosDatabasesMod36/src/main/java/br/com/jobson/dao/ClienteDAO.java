/**
 * 
 */
package br.com.jobson.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jobson.dao.generic.GenericDAO;
import br.com.jobson.dao.generic.GenericDB1DAO;
import br.com.jobson.domain.Cliente;

/**
 * @author jobson.oliveira
 *
 */
public class ClienteDAO extends GenericDB1DAO<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDAO() {
		super(Cliente.class);
	}

}