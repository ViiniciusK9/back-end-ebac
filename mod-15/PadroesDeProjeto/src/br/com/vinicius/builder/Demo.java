package br.com.vinicius.builder;

public class Demo {

    public static void main(String[] args) {
        // Utilizando gerente com constructor

        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        //Burger burger = gerente.buildBurger();

        //burger.print();

        //Gerente gerente1 = new Gerente(new VeganBurgerBuilder());
        //Burger burger1 = gerente1.buildBurger();

        //burger1.print();

        // Utilizando gerente com setter

        Gerente gerente = new Gerente();

        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger2 = gerente.buildBurger();
        burger2.print();
    }

}
