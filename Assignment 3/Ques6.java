import java.util.Scanner;
    class DuplicateEmployeeException extends Exception {
        public DuplicateEmployeeException(String message) {
            super(message);
        }
    }

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    class Employee1 {
        static String previousName = "";
        String name;
         int age;

        public Employee1() throws DuplicateEmployeeException, InvalidAgeException {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of the employee: ");
            name = scanner.nextLine();

            if (name.equals(previousName)) {
                throw new DuplicateEmployeeException("Employee with the same name already exists.");
            }
            System.out.print("Enter the age of the employee: ");
            age = scanner.nextInt();

            if (age < 18 || age > 60) {
                throw new InvalidAgeException("Employee age must be between 18 and 60.");
            }

            previousName = name;
        }
    }

    public class Ques6 {
        public static void main(String[] args) {
            try {
                Employee1 employee1 = new Employee1();
                System.out.println("Employee 1 created successfully.");
            } catch (DuplicateEmployeeException | InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                Employee1 employee2 = new Employee1();
                System.out.println("Employee 2 created successfully.");
            } catch (DuplicateEmployeeException | InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
