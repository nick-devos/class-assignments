//Chapter 10: Exercise #8
//CollegeCourse.java
//Programmer: Nick DeVos
//Date: 2/18/18

public class CollegeCourse
{
   private String department;
   private int courseNumber;
   private int credits;
   protected double fees;
   
   //constructor that requires three arguments
   CollegeCourse(String depart, int courseNum, int cred)
   {
      department = depart;
      courseNumber = courseNum;
      credits = cred;
      fees = credits * 120;
   }
   
   public void display()
   {
      System.out.println("Department: " + department);
      System.out.println("Course Number: " + courseNumber);
      System.out.println("Credit Hours: " + credits);
      System.out.printf("Course fee: $%.2f\n", fees);
   }
}