import java.time.LocalDate;
import java.time.Period;
public class Ques4 {

        public static void main(String[] args) {

            LocalDate birthdate = LocalDate.of(2000,9,2);

            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthdate, currentDate);

            int years = age.getYears();
            int months = age.getMonths();
            int days = age.getDays();

            System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
        }
    }


