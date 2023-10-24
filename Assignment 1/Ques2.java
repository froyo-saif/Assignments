import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary");
        double sal = sc.nextDouble();
        System.out.println("year of service");
        int yos = sc.nextInt();

        if(yos>6){
            double net = (sal*0.10);
            System.out.println(net);
        }
        else System.out.println("NOT ELIGIBLE");
    }
}
