package br.com.vinicius.observer;

public class Internet implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via Internet " + subject.toString());
    }
}
