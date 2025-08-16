/**
 * 
 */
package br.com.jobson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jobson.dao.ClienteDaoMock;
import br.com.jobson.dao.IClienteDAO;
import br.com.jobson.domain.Cliente;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;
import br.com.jobson.services.ClienteService;
import br.com.jobson.services.IClienteService;

/**
 * @author jobson.oliveira
 *
 */
public class ClienteServiceTest {

	private IClienteService clienteService;

	private Cliente cliente;

	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}

	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);

	}

	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Cliente retorno = clienteService.cadastrar(cliente);

		Assert.assertNotNull(retorno);
	}

	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente);
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Rodrigo Pires");
		clienteService.alterar(cliente);

		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}
}
