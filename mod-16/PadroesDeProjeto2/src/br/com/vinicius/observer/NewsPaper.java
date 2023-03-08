package br.com.vinicius.observer;

public class NewsPaper implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via NewsPaper " + subject.toString());
    }
}
