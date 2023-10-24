import java.util.*;
public class Ques13 {
    public static void main(String[] args) {

            int [][] ticket_counter = {
                    {5,3,1},
                    {10,45},
                    {22,3,11}
            };

            for(int i = 0; i<ticket_counter.length ; i++){
                System.out.println("Counter "+(i+1)+" is serving :");
                for(int j=0 ; j<ticket_counter[i].length;j++){
                    System.out.println("Customer "+(j+1));
                }
                System.out.println();
            }

        }
    }

