//Project Final
//GradeCalculatorFinal.java
//Programmer: Nick DeVos
//Date: 12/7/17

import java.util.Scanner;

public class GradeCalculatorFinal
{
   public static void main(String[] args)
   {
      //instantiate Grades objects
      GradesFinal student1 = new GradesFinal();
      GradesFinal student2 = new GradesFinal();
      
      //get name, ID, and grades for student1
      student1 = getInfo(student1);
      student1 = getGrades(student1);
      System.out.println("");
      
      //get name, ID, and grades for student2
      student2 = getInfo(student2);
      student2 = getGrades(student2);
      System.out.println("");
      
      //display information for each student
      student1.displayInfo();
      System.out.println("");
      student2.displayInfo();
   }
   
   public static GradesFinal getInfo(GradesFinal s)
   {
      //variables
      String studentFirstName;
      String studentLastName;
      String studID;
      
      Scanner keyboard = new Scanner(System.in);
      
      //setting student names and ID
      System.out.println("Enter student's first name ");
      studentFirstName = keyboard.nextLine();
      s.setFirstName(studentFirstName);
      System.out.println("Enter " + s.getFirstName() + "'s last name ");
      studentLastName = keyboard.nextLine();
      s.setLastName(studentLastName);
      System.out.println("Enter " + s.getFirstName() + " " + s.getLastName() + "'s ID number ");
      studID = keyboard.nextLine();
      s.setStudentID(studID);
      return s;
   }
   
   public static GradesFinal getGrades(GradesFinal x)
   {
      //variables
      double[] testGrades = new double[3];
      double[] labGrades = new double[3];
      double[] projectGrades = new double[3];
      double finalEx = 0.0;
      boolean testsEntered = false, labsEntered = false, projectsEntered = false, finalExamEntered = false;
      char charChoice;
      
      
      
      while(testsEntered == false || labsEntered == false || projectsEntered == false || finalExamEntered == false)
      {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Please choose a category: \"L\"=Labs, \"T\"=Tests, \"P\"=Projects, \"F\"=Final Exam, \"Q\"=Quit");
         
         //takes the first character of user input and sets charChoice for switch argument 
         charChoice = keyboard.next().charAt(0);
         
         //determines which array to input grades based on user's input
         switch(charChoice)
         {
            case 'l':
            case 'L': if(labsEntered == false)
            {
               for(int count = 0; count < 3; count++)
               {
                  System.out.println("Please enter a lab grade >> ");
                  labGrades[count] = keyboard.nextDouble();
               }
               labsEntered = true;
            }
               else
               System.out.println("Lab grades have already been entered, please choose a new category.");
               break;
            case 't':
            case 'T': if(testsEntered == false)
            {
               for(int count = 0; count < 3; count++)
               {
                  System.out.println("Please enter a test grade >> ");
                  testGrades[count] = keyboard.nextDouble();
               }
               testsEntered = true;
            }   
               else
               System.out.println("Test grades have already been entered, please choose a new category.");
               break;
            case 'p':
            case 'P': if(projectsEntered == false)
            {
               for(int count = 0; count < 3; count++)
               {
                  System.out.println("Please enter a project grade >> ");
                  projectGrades[count] = keyboard.nextDouble();
               }
               projectsEntered = true;
            }
               else
               System.out.println("Project grades have already been entered, please choose a new category.");
               break;
            case 'f':
            case 'F': if(finalExamEntered == false)
            {
               System.out.println("Please enter the final exam grade >> ");
               finalEx = keyboard.nextDouble();
               finalExamEntered = true;
            }
               else
               System.out.println("Final exam grade has already been entered, please choose a new category.");
               break;
            case 'q':
            case 'Q': testsEntered = true;
               labsEntered = true;
               projectsEntered = true;
               finalExamEntered = true;
               break;
        }
      }
      
      //calls setGrades() and passes arrays and finalEx values
      x.setGrades(testGrades, labGrades, projectGrades, finalEx);
      return x;
   }
}