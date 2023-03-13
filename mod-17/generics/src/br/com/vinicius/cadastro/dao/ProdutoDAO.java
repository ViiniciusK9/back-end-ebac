package br.com.vinicius.cadastro.dao;

import br.com.vinicius.cadastro.dao.generic.GenericDAO;
import br.com.vinicius.cadastro.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entidade, Produto entidadeCadastrada) {
        entidadeCadastrada.setNome(entidade.getNome());
    }
}
