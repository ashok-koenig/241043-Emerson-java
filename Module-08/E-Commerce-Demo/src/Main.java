import java.util.ArrayList;
import java.util.List;

public class Main{
    static void main() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "John", 500));
        orders.add(new Order(102, "Smith", 1500));
        orders.add(new Order(103, "Bob", 800));
        orders.add(new Order(104, "Peter", 2200));
        orders.add(new Order(105, "David", 700));

        // Display All Orders
        System.out.println("All Orders:");
//        orders.forEach( order -> System.out.println(order));
        // Method references
        orders.forEach(System.out::println);

        // Filter: order above 1000
        System.out.println("High Value orders (>1000)");
        orders.stream()
                .filter(order -> order.getAmount()>1000)
                .forEach(order -> System.out.println(order));

        // map: Customer names in Upper Case
        System.out.println("Customer names in Uppercase: ");
        orders.stream()
                .map(order -> order.getCustomerName().toUpperCase())
                .forEach(System.out::println);

        // reduce: Total order amount
//        double totalAmount = orders.stream().map(order -> order.getAmount()).reduce(0.0, (a,b)->a+b);
        double totalAmount = orders.stream().map(Order::getAmount).reduce(0.0, Double::sum);
        System.out.println("Total order amount: "+ totalAmount);

        //toList: Higher value order into new list
        List<Order> highValueOrders = orders.stream().filter(order -> order.getAmount() > 1000).toList();

        System.out.println("High Valur order in new list");
        highValueOrders.forEach(System.out::println);

    }
}