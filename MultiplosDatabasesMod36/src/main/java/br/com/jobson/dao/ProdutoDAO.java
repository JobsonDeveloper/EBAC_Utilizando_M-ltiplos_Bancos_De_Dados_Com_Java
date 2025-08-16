/**
 * 
 */
package br.com.jobson.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jobson.dao.generic.GenericDAO;
import br.com.jobson.domain.Produto;

/**
 * @author jobson.oliveira
 *
 */
public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class, "DatabaseOne");
	}

}