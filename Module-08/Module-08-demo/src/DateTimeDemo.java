import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    static void main() {
        LocalDate date = LocalDate.now();
        System.out.println("Local Date:" + date);

        LocalTime time = LocalTime.now();
        System.out.println("Local Time: "+ time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local Data & Time: "+ dateTime);

        LocalDate customDate = LocalDate.of(2026, 1, 1);
        System.out.println("Custom Date: "+ customDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Formatted Date and Time: "+ dateTime.format(formatter));
    }
}
