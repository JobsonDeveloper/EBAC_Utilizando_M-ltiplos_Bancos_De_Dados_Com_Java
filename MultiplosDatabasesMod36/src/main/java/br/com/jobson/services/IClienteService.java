/**
 * 
 */
package br.com.jobson.services;

import br.com.jobson.domain.Cliente;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;
import br.com.jobson.services.generic.IGenericService;

/**
 * @author jobson.oliveira
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
