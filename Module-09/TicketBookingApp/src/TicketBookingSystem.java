import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.execute(new BookingTask("John", 2, counter));
        service.execute(new BookingTask("Peter", 4, counter));
        service.execute(new BookingTask("Smith", 3, counter));
        service.execute(new BookingTask("Bob", 2, counter));
        service.execute(new BookingTask("Ana", 1, counter));

        service.shutdown();
    }
}
