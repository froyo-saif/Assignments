import java.util.*;

public class question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalRetail = 0;
        while (true) {
            
            System.out.println("1 - 22.50");
            System.out.println("2 - 44.50");
            System.out.println("3 - 9.98");
            System.out.println("4 - Exit");
            System.out.print("Enter product number: ");
            int productnumber = sc.nextInt();

            if (productnumber == 4) {
                break;
            }

            System.out.print("Enter quantity sold: ");
            int quantitySold = sc.nextInt();

            switch (productnumber) {
                case 1:
                    totalRetail += 22.50 * quantitySold;
                    break;
                case 2:
                    totalRetail += 44.50 * quantitySold;
                    break;
                case 3:
                    totalRetail += 9.98 * quantitySold;
                    break;
            }

            System.out.println("\nThe total retail value of all products sold:" + totalRetail);

        }
    }
}