import java.util.*;

public class question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of eggs: ");
       int totalEggs = sc.nextInt();
       
       int gross = 0;
       int dozen = 0;
       int leftEggs = 0;
       
       gross = totalEggs/144;
       totalEggs = totalEggs%144;
       
       dozen = totalEggs/12;
       totalEggs = totalEggs%12;
       
       System.out.println(gross + " Gross " + dozen + " Dozen" + " and " + totalEggs);
    }
}