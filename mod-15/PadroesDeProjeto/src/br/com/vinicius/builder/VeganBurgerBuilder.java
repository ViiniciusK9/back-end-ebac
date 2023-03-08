package br.com.vinicius.builder;

public class VeganBurgerBuilder extends BurgerBuilder {
    @Override
    void BuildBun() {
        burger.setBun("Vegan White Bread");
    }

    @Override
    void BuildMeat() {
        burger.setMeat("Vegan Beef");
    }

    @Override
    void BuildSalad() {
        burger.setSalad("Vegan Iceberg");
    }

    @Override
    void BuildCheese() {
        burger.setCheese("Vegan Cheese");
    }

    @Override
    void BuildSauce() {
        burger.setSauce("Vegan Secret Sauce");
    }
}
