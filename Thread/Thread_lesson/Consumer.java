package Thread_lesson;

public class Consumer implements Runnable {

    // potrebitel

    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    // proof
//    @Override
//    public void run() {
//
//        while (true) {
//
//            int lastIndex = Base.list.size() - 1;
//
//            if (lastIndex > -1) {
//
//                // massivin sonuncu elementini listden silir ve sildiyi elementini string tipinde geri qaytarir
//                String lastElement = Base.list.remove(lastIndex);
//
//                System.out.println(name + " = " + lastElement);
//
//            }
//
//        }
//
//    }

    // rase condition
//    @Override
//    public void run() {
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        Base.a++;
//        System.out.println(Base.a);
//
//    }

    // synchronization
    @Override
    public void run() {

        Base.increamentA();

    }

}
