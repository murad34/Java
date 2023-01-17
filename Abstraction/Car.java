package Abstraction;

public abstract class Car {

    public abstract void start();
    public abstract void stop();
    public abstract void speedUp();

    public void foo() {
        this.start();
        this.speedUp();
        this.stop();
    }

}
