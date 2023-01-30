package ExecutorService_lesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    public static void main(String[] args) {

//        singleThreadExecutor();
//        fixedThreadPool();

    }

    private static void singleThreadExecutor() {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new MyRunnable(1));
        executorService.submit(new MyRunnable(2));
        executorService.submit(new MyRunnable(3));

        // executor service sira ve sira threadleri start eliyir, bir thread ishini bitirir sonra ikinci thread ishe dushur

        // ozumuz bir nece threadi start elesey hamisi birden ishe dushecek, bir birlerin gozlemeden
        // bunu ozumuzde threadin join methodunanda eliye bilerik, gozleme bash versin

//            Thread t1 = new Thread(new MyRunnable());
//            Thread t2 = new Thread(new MyRunnable());
//            Thread t3 = new Thread(new MyRunnable());
//
//            t1.start();
//            t1.join();
//            t2.start();
//            t2.join();
//            t3.start();

    }

    private static void fixedThreadPool() {

        // ilk yazilan thread sayi (index) ishe dushur, ve sonra qalanlari eyni zamanda ishe dushur
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i=1; i<15; i++) {

            executorService.submit(new MyRunnable(i));

        }

    }

}
