public class Message {
    private boolean check=true;
    int num;
    public synchronized void write(int i){
        while (!check){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("write : "+i);
        this.num=i;
        check=false;
        notify();
    }

    public synchronized void read(){
        while (!check){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("read : "+num);
        check=true;
        notify();

    }

}
