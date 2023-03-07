package br.com.vinicius.singleton;

public class SingletonPropriedade {
    private static SingletonPropriedade singleston;
    private String value;

    private SingletonPropriedade(String value){
        this.value = value;
    }

    public static SingletonPropriedade getInstance(String value){
        if (singleston == null){
            singleston = new SingletonPropriedade(value);
        }
        return singleston;
    }

    public String getValue() {
        return value;
    }
}
