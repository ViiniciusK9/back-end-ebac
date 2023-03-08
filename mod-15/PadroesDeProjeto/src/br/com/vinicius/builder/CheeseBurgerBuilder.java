package br.com.vinicius.builder;

public class CheeseBurgerBuilder extends BurgerBuilder {

    @Override
    void BuildBun() {
        burger.setBun("White Bread");
    }

    @Override
    void BuildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    void BuildSalad() {
        burger.setSalad("Iceberg");
    }

    @Override
    void BuildCheese() {
        burger.setCheese("American Cheese");
    }

    @Override
    void BuildSauce() {
        burger.setSauce("Secret Sauce");
    }
}
