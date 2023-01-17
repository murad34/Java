package Abstraction;

public class BMW extends Car{

    public class A {

    } // inner class

    public static class C {

    } // nested class

    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }

    @Override
    public void speedUp() {
        System.out.println("BMW speed up");
    }
}
