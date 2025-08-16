/**
 * 
 */
package br.com.jobson.services;

import br.com.jobson.dao.IProdutoDAO;
import br.com.jobson.dao.generic.IGenericDAO;
import br.com.jobson.domain.Produto;
import br.com.jobson.services.generic.GenericService;

/**
 * @author jobson.oliveira
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IGenericDAO<Produto, String> dao) {
		super(dao);
	}

}
