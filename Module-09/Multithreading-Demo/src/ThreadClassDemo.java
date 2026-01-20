class MyThreadA extends Thread {
    public void run(){
        System.out.println("Thread A Task is running..." + getName());
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        System.out.println("The Main Thread starts");
        MyThreadA t1 = new MyThreadA();
        t1.start(); // runs in a separate thread
        System.out.println("The Main Thread ends");
    }
}
