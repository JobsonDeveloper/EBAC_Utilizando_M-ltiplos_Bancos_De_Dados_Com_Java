/**
 * 
 */
package br.com.jobson.dao;

import br.com.jobson.dao.generic.GenericDAO;
import br.com.jobson.domain.Venda;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author jobson.oliveira
 */
public class VendaExclusaoDAO extends GenericDAO<Venda, Long> implements IVendaDAO {

	public VendaExclusaoDAO() {
		super(Venda.class,  "DatabaseOne");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public Venda consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
