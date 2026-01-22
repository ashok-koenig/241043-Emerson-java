import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for(int i=1; i<=5; i++){
            int taskId = i;
            Future<?> obj = pool.submit(() -> {
                System.out.println("Task "+ taskId + " executed by "+ Thread.currentThread().getName());
            });
            System.out.println(obj.get());
        }

        pool.shutdown();
    }
}
