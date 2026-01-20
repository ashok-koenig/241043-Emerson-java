class Buffer {
    private int data;
    private boolean hadData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hadData){
            wait(); // wait until data is consumed
        }
        data = value;
        hadData = true;
        System.out.println("Produced: "+ value);
        notify(); // notify consumer
    }
    public synchronized int consume() throws InterruptedException {
        while (!hadData){
            wait(); // wait until data is produced
        }
        hadData = false;
        System.out.println("Consumed: "+ data);
        notify();
        return data;
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(()-> {
            for(int i = 1; i <=5; i++){
                try {
                    buffer.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(()-> {
            for(int i=1; i<=5; i++){
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
