package br.com.vinicius.cadastro.dao;

import br.com.vinicius.cadastro.dao.generic.GenericDAO;
import br.com.vinicius.cadastro.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{
    public ClienteMapDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entidade, Cliente entidadeCadastrada) {
        entidadeCadastrada.setNome(entidade.getNome());
        entidadeCadastrada.setCidade(entidade.getCidade());
        entidadeCadastrada.setEndereco(entidade.getEndereco());
        entidadeCadastrada.setEstado(entidade.getEstado());
        entidadeCadastrada.setNumero(entidade.getNumero());
        entidadeCadastrada.setTelefone(entidade.getTelefone());

    }

    //    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if (this.map.containsKey(cliente.getCpf())) {
//            // Não efetua cadastro do cliente
//            return false;
//        }
//        // Insere o cliente no map
//        this.map.put(cliente.getCpf(), cliente);
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//
//        if (clienteCadastrado != null){
//            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
//
//        if (clienteCadastrado != null){
//            // Atualizar as informações do cliente
//            clienteCadastrado.setNome(cliente.getNome());
//            clienteCadastrado.setCidade(cliente.getCidade());
//            clienteCadastrado.setEndereco(cliente.getEndereco());
//            clienteCadastrado.setEstado(cliente.getEstado());
//            clienteCadastrado.setNumero(cliente.getNumero());
//            clienteCadastrado.setTelefone(cliente.getTelefone());
//        }
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return this.map.values();
//    }
}
