public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    message.write(i++);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        producer.start();

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    message.read();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        consumer.start();

    }
}
