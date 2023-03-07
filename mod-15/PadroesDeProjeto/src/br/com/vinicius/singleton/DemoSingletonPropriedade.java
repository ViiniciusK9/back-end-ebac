package br.com.vinicius.singleton;

public class DemoSingletonPropriedade {

    public static void main(String[] args) {
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste1");

        System.out.println(singleton1 + singleton1.getValue());
        System.out.println(singleton + singleton.getValue());
    }
}
