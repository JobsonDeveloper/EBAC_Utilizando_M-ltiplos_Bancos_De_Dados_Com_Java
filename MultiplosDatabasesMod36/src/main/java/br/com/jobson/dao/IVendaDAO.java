/**
 * 
 */
package br.com.jobson.dao;

import br.com.jobson.dao.generic.IGenericDAO;
import br.com.jobson.domain.Venda;
import br.com.jobson.exceptions.DAOException;
import br.com.jobson.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author jobson.oliveira
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);
}