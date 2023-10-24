import java.util.*;
public class Question12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int total = 0;

            for(int i =1 ; i<=3 ; i++){
                int marks;
                while(true){
                    System.out.println("Enter marks for student "+i);
                    marks = sc.nextInt();
                    if(marks>=0 && marks<=100){
                        break;
                    }
                    else System.out.println("Invalid");
                }

                total+=marks;
            }

            double avg = (double)total/3;
            System.out.printf("Average is : %.2f%n", avg );
        }

    }

