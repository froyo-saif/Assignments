import java.util.ArrayList;

public class Ques2 {
        public static void main(String[] args) {

            ArrayList<String> daysOfWeek = new ArrayList<String>();
            daysOfWeek.add("Monday");
            daysOfWeek.add("Tuesday");
            daysOfWeek.add("Wednesday");
            daysOfWeek.add("Thursday");
            daysOfWeek.add("Friday");
            daysOfWeek.add("Saturday");
            daysOfWeek.add("Sunday");

            System.out.println("Collection of days of the week: " + daysOfWeek);

            System.out.println("Length of the collection: " + daysOfWeek.size());

            String[] daysArray = new String[daysOfWeek.size()];
            daysArray = daysOfWeek.toArray(daysArray);

            System.out.print("Array of days of the week: ");
            for (String day : daysArray) {
                System.out.print(day + " ");
            }
        }
    }