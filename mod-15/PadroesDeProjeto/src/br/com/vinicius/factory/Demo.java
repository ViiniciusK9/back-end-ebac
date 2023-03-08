package br.com.vinicius.factory;

public class Demo {

    public static void main(String[] args) {
        Customer customer = new Customer("A", false);
        Factory factory = getFactory(customer);
        Car car = factory.create(customer.getGradeRequest());

        car.startEngine();

    }

    private static Factory getFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new NoContractFactory();
        }
    }

}
