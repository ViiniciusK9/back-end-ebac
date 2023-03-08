package br.com.vinicius.templatemethod;

public abstract class Worker {
    public void dailyRoutine() {
        initRoutine();
        getUp();
        goToWork();
        toWork();
        comeBackHome();
    }

    public void comeBackHome() {
        System.out.println("Coming home.");
    }

    protected abstract void toWork();

    public void goToWork() {
        System.out.println("Going to work.");
    }

    public void initRoutine() {
        System.out.println("Starting routine!");
    }

    public void getUp(){
        System.out.println("Getting out of bed early in the morning.");
    }
}
