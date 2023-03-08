package br.com.vinicius.templatemethod;

public class Demo {

    public static void main(String[] args) {
        Worker worker = new Fireman();

        worker.dailyRoutine();

        Worker worker2 = new PoliceOfficer();

        worker2.dailyRoutine();
    }

}
