public class BookingTask implements Runnable{
    private String customerName;
    private int numberOfTickets;
    private TicketCounter counter;

    public BookingTask(String customerName, int numberOfTickets, TicketCounter counter) {
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.bookTicket(customerName, numberOfTickets);
    }
}
