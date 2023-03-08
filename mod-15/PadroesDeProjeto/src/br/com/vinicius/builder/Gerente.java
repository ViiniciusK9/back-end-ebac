package br.com.vinicius.builder;

public class Gerente {

    BurgerBuilder builder;

//    public Gerente(BurgerBuilder builder) {
//        this.builder = builder;
//    }

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.BuildBun();
        builder.BuildMeat();
        builder.BuildSalad();
        builder.BuildCheese();
        builder.BuildSauce();
        return builder.build();
    }

}
