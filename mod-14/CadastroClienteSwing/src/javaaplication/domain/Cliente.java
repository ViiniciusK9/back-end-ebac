/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication.domain;

import java.util.Objects;

/**
 *
 * @author red
 */
public class Cliente {

    private String nome;
    private Long cpf;
    private Long telefone;
    private String endereco;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(String nome, String cpf, String telefone, String endereco, String numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.telefone = Long.valueOf(telefone.trim());
        this.endereco = endereco;
        this.numero = Integer.valueOf(numero.trim());
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "br.com.vinicius.domain.Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
