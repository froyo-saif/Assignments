import java.util.*;

public class question5 {
    public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number of Classes Held: ");
       int totalClass = sc.nextInt();
       System.out.println("Enter The Number of Classes Attended: ");
       int classesAttended = sc.nextInt();
       
       float Attendance = (classesAttended * 100 )/totalClass;
       
       
       
       if(Attendance > 70) System.out.println("You are allowed to sit in exam");
       else 
       {
           char medicalCause='N';
           System.out.println("Do you have a Medical Cause?");
           medicalCause = sc.next().charAt(0);
           
           if(medicalCause=='Y') System.out.println("You are allowed to sit in exam");
           else System.out.println("You are not allowed to sit in exam");
       }
   
  }
}