import java.util.InputMismatchException;
import java.util.Scanner;
public class Ques3 {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            try {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException: You did not enter a valid integer.");

            }


            try {
                String text = "Saif";
                System.out.println("Enter an index to access a character in the string: ");
                int index = scanner.nextInt();
                char character = text.charAt(index);
                System.out.println("The character at index " + index + " is: " + character);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException: Index is out of bounds.");
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException: Please enter a valid integer index.");
            }

        }
    }


