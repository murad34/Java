package Abstraction;

public class Volwo extends Car {
    @Override
    public void start() {
        System.out.println("Volwo start");
    }

    @Override
    public void stop() {
        System.out.println("Volwo stop");
    }

    @Override
    public void speedUp() {
        System.out.println("Volwo speed up");
    }
}
