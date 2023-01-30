package Thread_lesson;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // proof - eyni vaxta run olur her method
//        Worker w1 = new Worker("Murad");
//        Worker w2 = new Worker("Lyaman");
//        Worker w3 = new Worker("Revan");
//        Worker w4 = new Worker("Ruslan");
//        Worker w5 = new Worker("Shamshir");
//
//        w1.start();
//        w2.start();
//        w3.start();
//        w4.start();
//        w5.start();


        // extends Thread
        // eyni vaxtda 2 producer random deyer elave eliyir base classin static massiv listine ve 5 consumer o listden axrinci elementi silib cap eliyir
//        Producer p1 = new Producer();
//        Producer p2 = new Producer();
//        Consumer c1 = new Consumer("Murad");
//        Consumer c2 = new Consumer("Lyaman");
//        Consumer c3 = new Consumer("Revan");
//        Consumer c4 = new Consumer("Ruslan");
//        Consumer c5 = new Consumer("Shamshir");
//
//        p1.start();
//        p2.start();
//        c1.start();
//        c2.start();
//        c3.start();
//        c4.start();
//        c5.start();


        // implements Runnable
//        Thread p1 = new Thread(new Producer());
//        Thread p2 = new Thread(new Producer());
//        Thread c1 = new Thread(new Consumer("Murad"));
//        Thread c2 = new Thread(new Consumer("Lyaman"));
//        Thread c3 = new Thread(new Consumer("Revan"));
//        Thread c4 = new Thread(new Consumer("Ruslan"));
//        Thread c5 = new Thread(new Consumer("Shamshir"));
//
//        p1.start();
//        p2.start();
//        c1.start();
//        c2.start();
//        c3.start();
//        c4.start();
//        c5.start();


        // rase condition
//        Thread[] threads = new Thread[100];
//
//        for (int i=0; i<100; i++) {
//            threads[i] = new Thread(new Consumer("test"));
//        }
//
//        for (int i=0; i<100; i++) {
//            threads[i].start();
//        }
//
//        System.out.println("Thread coun = " + Thread.activeCount());
//
//        Thread.sleep(1000);
//        System.out.println(Base.a);


        //synchronization
        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new Consumer("test"));
        }

        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);
        System.out.println(Base.getA());

    }

}