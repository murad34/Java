package Thread_lesson;

import java.util.UUID;

public class Producer implements Runnable {

    // proizvoditel, istehsal eliyen

    @Override
    public void run() {

        while (true) {

            Base.list.add(UUID.randomUUID().toString()); // random value verir ve onu stringe ceviririk biz

        }

    }

}
