public class TicketCounter {
    private int availabeTickets = 10;

    // Synchronized to prevent race conditions
    public synchronized void bookTicket(String customerName, int ticketsRequested){
        System.out.println(customerName + " is trying to book "+ ticketsRequested + " ticket(s)");
        if(ticketsRequested <= availabeTickets){
            System.out.println("Booking successful for "+ customerName);
            availabeTickets -= ticketsRequested;
            System.out.println("Tickets Left: "+ availabeTickets);
        }else {
            System.out.println("Booking failed for "+ customerName + ". Not enough tickets!");
        }
    }
}
