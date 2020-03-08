//Chapter 12: Exercise 9
//TestGrade.java
//Programmer: Nick DeVos
//Date: 3/19/18

import java.util.*;

public class TestGrade
{
   public static void main(String[] args)
   {
      //variables
      int[] studentIDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Scanner input = new Scanner(System.in);
      char[] studentGrades = new char[10];
      
      for(int i=0; i<studentIDs.length; i++) //loops for each student
      {
         char temp; //temporary value
         boolean validEntry;
         
         System.out.print("Enter grade for student ID number: " + studentIDs[i] + " >> ");
         temp = input.nextLine().toUpperCase().charAt(0); //gets only first letter entered and converts to uppercase
         validEntry = GradeException.checkGrade(temp);
         
         try
         {
            if(validEntry)
               studentGrades[i] = temp; //sets grade if grade entered is valid
            else
               throw new GradeException(temp); //throws exception if the grade entered is not an approved letter
         }
         
         catch(GradeException e)
         {
            System.out.println("" + e.getMessage()); //displays created error message
            studentGrades[i] = 'I'; //sets grade entered to 'I'
         }
      }
      
      System.out.println();
      
      for(int i=0; i<studentIDs.length; i++) //prints each student ID and grade
      {
         System.out.print("Student ID: " + studentIDs[i] + "   Grade: " + studentGrades[i] + "\n");
      }
   }
}