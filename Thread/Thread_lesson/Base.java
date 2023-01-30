package Thread_lesson;

import java.util.ArrayList;
import java.util.List;

public class Base {

    public static List<String> list = new ArrayList<>();

    // rase condition
    public static int a = 0;
//    public static volatile int a = 0;

    // synchronization
    public static int getA() {
        return a;
    }

    public synchronized static void increamentA() {
        a++;
//        System.out.println(Base.a);
    }

}
