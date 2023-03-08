package br.com.vinicius.factory;

public class NoContractFactory extends Factory{
    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Volkswagen(100, "full", "Blue");
        } else {
            return new Toyota(300, "full", "Red");
        }
    }
}
