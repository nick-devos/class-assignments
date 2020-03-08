//Chapter 12: Exercise 9
//GradeException.java
//Programmer: Nick DeVos
//Date: 3/19/18

public class GradeException extends Exception
{
   public static char[] letterGrades = {'A', 'B', 'C', 'D', 'F', 'I'}; //valid letter grades
   
   public static boolean checkGrade(char gradeEntered)
   {
      boolean validGrade = false;
      
      for(int i=0; i<letterGrades.length; i++) //compares user entered grade to valid letterGrades[]
      {
         if(gradeEntered == letterGrades[i])
            validGrade = true; //changes to true if a match is found
      }
      
      return validGrade; //boolean value
   }
      
   public GradeException(char tem)
   {
      super("Invalid grade entered! You entered: " + tem + "\nBe sure to enter A, B, C, D, F, or I");
   }
}