import java.util.ArrayList;
import java.util.Scanner;
public class unique {
        public static void main(String[] args) {
            ArrayList<Integer> uniqueNumbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter number " + i + ": ");
                int number = scanner.nextInt();

                if (uniqueNumbers.contains(number)) {
                    System.out.println("Number " + number + " is already in the collection.");
                } else {
                    System.out.print("Enter the index where it should be stored: ");
                    int index = scanner.nextInt();

                    if (index < 0 || index > uniqueNumbers.size()) {
                        System.out.println("Invalid index. The number will be added at the end.");
                        uniqueNumbers.add(number);
                    } else {
                        uniqueNumbers.add(index, number);
                    }
                }
            }

            System.out.println("Unique Numbers in the Collection:");
            for (int i = 0; i < uniqueNumbers.size(); i++) {
                System.out.println("Index " + i + ": " + uniqueNumbers.get(i));
            }

        }
    }


