import java.util.*;

public class question1 {
    public static void main(String[] args) {
      int totalNoOfStudents = 90;
      int totalBoys = 45;
      int totalGirls = totalNoOfStudents - totalBoys;
      
      int studentsWithGradeA = totalNoOfStudents/2;
      int boysWithGradeA = 20;
      
      int girlsWithGradeA = studentsWithGradeA - boysWithGradeA;
      
      System.out.print("Girls Getting Grade A: " + girlsWithGradeA);
      
  }
}