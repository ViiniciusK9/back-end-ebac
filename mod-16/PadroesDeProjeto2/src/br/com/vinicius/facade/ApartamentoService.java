package br.com.vinicius.facade;

public class ApartamentoService implements IApartamentoService{

    public void procurarPorEndereco() {
        System.out.println("Procurando endereço");
    }

    public void procurarContato() {
        System.out.println("Procurando contato");
    }

    public void procurarValorTotal() {
        System.out.println("Procurando valor total");
    }

    @Override
    public void alugarApartamento() {
        procurarContato();
        procurarPorEndereco();
        procurarValorTotal();
    }
}
