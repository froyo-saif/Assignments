import java.time.LocalDate;
import java.time.LocalTime;

public class Ques6 {
        public static void main(String[] args) {
            // Display current date without time
            LocalDate currentDate = LocalDate.now();
            System.out.println("Current Date: " + currentDate);

            // Display current time without date
            LocalTime currentTime = LocalTime.now();
            System.out.println("Current Time: " + currentTime);
        }
    }