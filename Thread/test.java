package Thread;

public class test {
    public static void main(String[] args) {

        A ob = new A();

        Thread t1 = new Thread(ob, "ThreadA");
        Thread t2 = new Thread(ob, "ThreadB");
        Thread t3 = new Thread(ob, "ThreadC");

        t1.start();
        t2.start();
        t3.start();
    }
}

class A implements Runnable {

    synchronized public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}