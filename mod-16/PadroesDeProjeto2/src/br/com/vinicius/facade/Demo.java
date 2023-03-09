package br.com.vinicius.facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();

        service.alugarApartamento();
    }

}
