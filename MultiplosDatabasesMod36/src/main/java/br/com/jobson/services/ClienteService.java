/**
 * 
 */
package br.com.jobson.services;

import br.com.jobson.dao.IClienteDAO;
import br.com.jobson.domain.Cliente;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.MaisDeUmRegistroException;
import br.com.jobson.exceptions.TableException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;
import br.com.jobson.services.generic.GenericService;

/**
 * @author jobson.oliveira
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}
}
