package DeadLock_lesson;

public class DeadLock {

    public static Object Lock1 = new Object();

    public static Object Lock2 = new Object();

    public static void main(String args[]) {

        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();

        t1.start();
        t2.start();

    }

}
