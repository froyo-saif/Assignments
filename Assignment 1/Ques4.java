import java.util.Scanner;

public class Ques4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many classes held in total ");
        int total = sc.nextInt();
        System.out.println("Enter the days attended the class ");
        int attended = sc.nextInt();
        double percentage = ((double)attended/total)*100;

        if(percentage<70){
            System.out.print("Do you have a medical cause? (Y/N): ");
            char Medical = sc.next().charAt(0);
            if(Medical=='Y' || Medical == 'y'){
                System.out.println("ALLOWED");
            }
            else System.out.println("Not Allowed");
        }
        else System.out.println("Allowed");
    }

}






