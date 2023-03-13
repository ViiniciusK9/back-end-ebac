package br.com.vinicius.cadastro.dao.generic;

import br.com.vinicius.cadastro.domain.Cliente;
import br.com.vinicius.cadastro.domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {
    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClasse();

    public GenericDAO() {

        if (this.map == null) {
            this.map = new HashMap<>();
        }

        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Boolean cadastrar(T entidade) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno.containsKey(entidade.getChave())) {
            // Não efetua cadastro da entidade
            return false;
        }
        // Insere a entidade no map
        mapaInterno.put(entidade.getChave(), entidade);
        return true;
    }

    @Override
    public void excluir(Long chave) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T entidadeCadastrada = mapaInterno.get(chave);

        if (entidadeCadastrada != null){
            mapaInterno.remove(chave, entidadeCadastrada);
        }
    }

    @Override
    public void alterar(T entidade) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T entidadeCadastrada = mapaInterno.get(entidade.getChave());

        if (entidadeCadastrada != null){
            atualizarDados(entidade, entidadeCadastrada);
        }
    }

    public abstract void atualizarDados(T entidade, T entidadeCadastrada);

    @Override
    public T consultar(Long chave) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T entidadeCadastrada = mapaInterno.get(chave);

        if (entidadeCadastrada != null){
            return entidadeCadastrada;
        }
        return null;
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
