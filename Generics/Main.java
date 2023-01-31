package Generics;

public class Main {
    public static void main(String[] args) {

        // Wildcard
        Container<User2> container = new Container<>();
        method1(container);

        Container<User> container2 = new Container<>();
        method2(container2);

    }

    public static void method1(Container<? extends User> container) { // gonderdiyin class User den extends elemelidi
        // yuxari serhed Userdi
    }

    public static void method2(Container<? super User3> container) { // super deyir ki User3 gonderdiyin calssdan extends elemelidi
        // ashagi serhed User3
    }

}