package br.com.vinicius.cadastro.dao.generic;

import br.com.vinicius.cadastro.domain.Cliente;
import br.com.vinicius.cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {
    public Boolean cadastrar(T entidade);

    public void excluir(Long chave);

    public void alterar(T entidade);

    public T consultar(Long chave);

    public Collection<T> buscarTodos();
}
