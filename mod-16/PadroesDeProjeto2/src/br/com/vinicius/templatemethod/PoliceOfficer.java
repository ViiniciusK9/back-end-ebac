package br.com.vinicius.templatemethod;

public class PoliceOfficer extends Worker {
    @Override
    protected void toWork() {
        System.out.println("Working as a police officer!");
    }

    @Override
    public void getUp() {
        System.out.println("Get out of bed at 8 am.");
    }
}
