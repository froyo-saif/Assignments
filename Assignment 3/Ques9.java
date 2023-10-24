import java.util.Scanner;
public class Ques9 {
        public static double area(double a, double b, double c) {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public static double perimeter(double a, double b, double c) {
            return a + b + c;
        }

        public static boolean isValid(double a, double b, double c) {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter the values of a, b, and c (or -1 to exit): ");
                double a = scanner.nextDouble();

                if (a == -1) {
                    System.out.println("BYE");
                    break;
                }

                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                if (isValid(a, b, c)) {
                    double triangleArea = area(a, b, c);
                    double trianglePerimeter = perimeter(a, b, c);

                    System.out.println("The triangle is valid.");
                    System.out.println("Area: " + triangleArea);
                    System.out.println("Perimeter: " + trianglePerimeter);
                } else {
                    System.out.println("The input is invalid.");
                }
            }

            }
    }

