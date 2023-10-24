import java.util.Scanner;

public class Ques8 {
    public double add(double x, double y){
        return x+y;
    }
    public double sub(double x, double y){
        return x-y;
    }
    public double mul(double x, double y){
        return x*y;
    }
    public double di(double x, double y){
        if(y==0) System.out.println("No");
        return x/y;
    }

    public static void main(String[] args) {
        Ques8 c= new Ques8();
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double ans =0.0;
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                ans = c.add(n1, n2);
                break;
            case '-':
                ans = c.sub(n1, n2);
                break;
            case '*':
                ans = c.mul(n1, n2);
                break;
            case '/':
                ans = c.di(n1, n2);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        System.out.println("Result: " + ans);





    }
}
