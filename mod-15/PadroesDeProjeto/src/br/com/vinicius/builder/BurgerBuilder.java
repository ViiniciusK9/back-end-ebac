package br.com.vinicius.builder;

public abstract class BurgerBuilder {

    Burger burger = new Burger();

    abstract void BuildBun();
    abstract void BuildMeat();
    abstract void BuildSalad();
    abstract void BuildCheese();
    abstract void BuildSauce();

    Burger build(){
        return burger;
    }
}
