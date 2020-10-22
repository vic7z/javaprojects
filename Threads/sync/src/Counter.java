public class Counter {
    public  void count() {
        int i;
        synchronized (this) {
            for (i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

}
