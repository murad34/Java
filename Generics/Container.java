package Generics;

public class Container<T> {

    private Object object;

    public Container() {
    }

    public Object doItAndReturn() {

        System.out.println("I did something");

        return this.object;
    }

}
