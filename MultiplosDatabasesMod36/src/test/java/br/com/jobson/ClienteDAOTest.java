/**
 * 
 */
package br.com.jobson;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.jobson.dao.ClienteDAO;
import br.com.jobson.dao.IClienteDAO;
import br.com.jobson.domain.Cliente;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.MaisDeUmRegistroException;
import br.com.jobson.exceptions.TableException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author jobson.oliveira
 *
 */
public class ClienteDAOTest {

	private IClienteDAO clienteDao;

	private Random rd;

	public ClienteDAOTest() {
		this.clienteDao = new ClienteDAO();
		rd = new Random();
	}

	@After
	public void end() throws DAOException {
		Collection<Cliente> list = clienteDao.buscarTodos();

		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void pesquisarCliente()
			throws MaisDeUmRegistroException, TableException, TipoChaveNaoEncontradaException, DAOException {
		Cliente cliente = criarCliente();
		clienteDao.cadastrar(cliente);

		Cliente clienteConsultado = (Cliente) clienteDao.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente()
			throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
		Cliente cliente = criarCliente();
		Cliente retorno = (Cliente) clienteDao.cadastrar(cliente);
		Assert.assertNotNull(retorno);

		Cliente clienteConsultado = (Cliente) clienteDao.consultar(retorno.getId());
		Assert.assertNotNull(clienteConsultado);

		clienteDao.excluir(cliente);

		Cliente clienteConsultado1 = (Cliente) clienteDao.consultar(retorno.getId());
		Assert.assertNull(clienteConsultado1);
	}

	@Test
	public void excluirCliente()
			throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
		Cliente cliente = criarCliente();
		Cliente retorno = (Cliente) clienteDao.cadastrar(cliente);
		Assert.assertNotNull(retorno);

		Cliente clienteConsultado = (Cliente) clienteDao.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado);

		clienteDao.excluir(cliente);
		clienteConsultado = (Cliente) clienteDao.consultar(cliente.getId());
		Assert.assertNull(clienteConsultado);
	}

	@Test
	public void alterarCliente()
			throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
		Cliente cliente = criarCliente();
		Cliente retorno = (Cliente) clienteDao.cadastrar(cliente);
		Assert.assertNotNull(retorno);

		Cliente clienteConsultado = (Cliente) clienteDao.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado);

		clienteConsultado.setNome("Jobson Oliveira");
		clienteDao.alterar(clienteConsultado);

		Cliente clienteAlterado = (Cliente) clienteDao.consultar(clienteConsultado.getId());
		Assert.assertNotNull(clienteAlterado);
		Assert.assertEquals("Jobson Oliveira", clienteAlterado.getNome());

		clienteDao.excluir(clienteAlterado);
		clienteConsultado = (Cliente) clienteDao.consultar(clienteAlterado.getId());
		Assert.assertNull(clienteConsultado);
	}

	@Test
	public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {
		Cliente cliente = criarCliente();
		Cliente retorno = (Cliente) clienteDao.cadastrar(cliente);
		Assert.assertNotNull(retorno);

		Cliente cliente1 = criarCliente();
		Cliente retorno1 = (Cliente) clienteDao.cadastrar(cliente1);
		Assert.assertNotNull(retorno1);

		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);

		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});

		Collection<Cliente> list1 = clienteDao.buscarTodos();
		assertTrue(list1 != null);
		assertTrue(list1.size() == 0);
	}

	private Cliente criarCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf(rd.nextLong());
		cliente.setNome("Jobson");
		cliente.setCidade("Recife");
		cliente.setEnd("Rua Fim do Sol");
		cliente.setEstado("PE");
		cliente.setNumero(44);
		cliente.setTel(558195648512L);

		return cliente;
	}
}
