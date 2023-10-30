import java.time.LocalDate;
import java.time.Month;

public class Ques3 {

    public static void main(String[] args) {
            LocalDate currentDate = LocalDate.now();
            Month currentMonth = currentDate.getMonth();

            int monthsRemaining = 12 - currentMonth.getValue();

            System.out.println("Months remaining in the year: " + monthsRemaining);
        }
    }

