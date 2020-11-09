public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        thread t1 = new thread(counter);
        t1.setName("thread1");
        thread t2 = new thread(counter);
        t2.setName("thread2");

        t1.start();
        t2.start();
    }
}
