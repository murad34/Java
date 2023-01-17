package Abstraction;

public class Main {

    public static void main(String[] args) {

        BMW.A innerClass = new BMW().new A();  // INNER CLASS

        BMW.C nestedClass = new BMW.C() ; // NESTED CLASS

        Car volwo = new Volwo();
        volwo.start();
        
        Car bmw = new BMW();
        bmw.foo();

    }

}
