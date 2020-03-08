//Chapter 10: Exercise #8
//UseCourse.java
//Programmer: Nick DeVos
//Date: 2/18/18

import java.util.Scanner;

public class UseCourse
{
   public static void main(String[] args)
   {
      String departmentEntered;
      int courseNumEntered;
      int creditsEntered;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the three letter department code (Example: ENG) >> ");
      departmentEntered = input.nextLine().toUpperCase();
      System.out.print("Enter the course number >> ");
      courseNumEntered = input.nextInt();
      input.nextLine();
      System.out.print("Enter the amount of credit hours >> ");
      creditsEntered = input.nextInt();
      input.nextLine();
      System.out.println();
      
      switch(departmentEntered)
      {
         case "BIO":
         case "CHM":
         case "CIS":
         case "PHY": LabCourse labCourse = new LabCourse(departmentEntered, courseNumEntered, creditsEntered);
                     labCourse.display();
            break;
         default: CollegeCourse colCourse = new CollegeCourse(departmentEntered, courseNumEntered, creditsEntered);
                  colCourse.display();
            break;
      }
   }
}