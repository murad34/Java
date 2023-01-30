package ExecutorService_lesson;

public class MyRunnable implements Runnable{

    private int index;

    public MyRunnable(int index) {
        this.index = index;
    }

    @Override
    public void run() {

        System.out.println(index + ". Runnable ishe dushdu ve 3 saniye gozleyecek...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(index + ". Runnable ishini bitirdi");

    }

}
