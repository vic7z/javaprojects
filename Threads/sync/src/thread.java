public class thread extends Thread {
    public Counter counter;

    public thread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.count();
    }
}
