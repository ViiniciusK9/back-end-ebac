package br.com.vinicius.factory;

public class ContractFactory extends Factory{
    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Audi(700, "full", "Black");
        } else {
            return new Tesla(460, "full", "White");
        }
    }
}
