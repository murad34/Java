package Thread;

import java.util.UUID;

public class Producer implements Runnable {

    // proizvoditel, istehsal eliyen

    @Override
    public void run() {

        while (true) {

            Base.list.add(UUID.randomUUID().toString()); // random value verir ve onu stringe ceviririk biz

        }

    }

//    public void doIt1() {
//        System.out.println("doIt1 bashladi");
//        System.out.println("doIt1");
//        System.out.println("doIt1 bitdi");
//    }
//
//    public void doIt2() {
//        System.out.println("doIt2 bashladi");
//        System.out.println("doIt2");
//        System.out.println("doIt2 bitdi");
//    }
//
//    public void doIt3() {
//        System.out.println("doIt3 bashladi");
//        System.out.println("doIt3");
//        System.out.println("doIt3 bitdi");
//    }

}
