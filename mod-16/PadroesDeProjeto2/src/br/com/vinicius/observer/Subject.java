package br.com.vinicius.observer;

public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyAll(String title);
}
