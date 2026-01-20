import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for(int i=1; i<=5; i++){
            int taskId = i;
            pool.submit(() -> {
                System.out.println("Task "+ taskId + " executed by "+ Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
}
