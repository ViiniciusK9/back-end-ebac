package br.com.vinicius.observer;

public class Demo {
    public static void main(String[] args) {

        Journalist journalist = new Journalist();

        journalist.add(new TV());
        journalist.add(new Internet());

        journalist.notifyAll("Test");

        journalist.add(new NewsPaper());

        journalist.notifyAll("Test 2");

    }
}
