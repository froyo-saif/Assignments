import java.time.YearMonth;
public class Ques2 {
        public static void main(String[] args) {
            int year = 2023;
            int month = 7;

            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            System.out.println("Number of days in the specified month: " + daysInMonth);
        }
    }

