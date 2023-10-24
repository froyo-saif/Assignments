
import java.util.*;

public class question11
{
    public static void main(String[] args) {
        int arr[] = new int[10];
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter 10 Elements: ");
      
      for(int i=0;i<10;i++)
      {
        arr[i] = sc.nextInt();
      }
      
     Arrays.sort(arr);
     
     int count=1;
     
     for(int i=0;i<10;i++)
     {
         if(i+1<10 && arr[i]==arr[i+1]) count++;
         else{
             System.out.println(arr[i] + " occured " + count + " times.");
             count=1;
         }
         
     }
      
      
    }
}
