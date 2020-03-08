//Project 2
//GradeCalculator.java
//Programmer: Nick DeVos
//Date: 11/5/17

import java.util.Scanner;

public class GradeCalculator2
{
   public static void main(String[] args)
   {
      //instantiate Grades objects
      Grades2 student1 = new Grades2();
      
      student1 = getInfo(student1);
      student1 = getGrades(student1);
      System.out.println("");
      
      student1.displayInfo();
   }
   
   public static Grades2 getInfo(Grades2 s)
   {
      String studentFirstName;
      String studentLastName;
      String studID;
      
      Scanner keyboard = new Scanner(System.in);
   
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
   
   public static Grades2 getGrades(Grades2 x)
   {
      double test1 = 0.0, test2 = 0.0, test3 = 0.0;
      double lab1 = 0.0, lab2 = 0.0, lab3 = 0.0;
      double project1 = 0.0, project2 = 0.0, project3 = 0.0;
      double finalEx = 0.0;
      boolean testsEntered = false, labsEntered = false, projectsEntered = false, finalExamEntered = false;
      char charChoice;
      
      
      
      while(testsEntered == false || labsEntered == false || projectsEntered == false || finalExamEntered == false)
      {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Please choose a category: \"L\"=Labs, \"T\"=Tests, \"P\"=Projects, \"F\"=Final Exam, \"Q\"=Quit");
         charChoice = keyboard.next().charAt(0);
         switch(charChoice)
         {
            case 'l':
            case 'L': if(labsEntered == false)
            {
               System.out.println("Please enter the first lab grade >> ");
               lab1 = keyboard.nextDouble();
               System.out.println("Please enter the second lab grade >> ");
               lab2 = keyboard.nextDouble();
               System.out.println("Please enter the last lab grade >> ");
               lab3 = keyboard.nextDouble();
               labsEntered = true;
            }
               else
               System.out.println("Lab grades have already been entered, please choose a new category.");
               break;
            case 't':
            case 'T': if(testsEntered == false)
            {
               System.out.println("Please enter the first test grade >> ");
               test1 = keyboard.nextDouble();
               System.out.println("Please enter the second test grade >> ");
               test2 = keyboard.nextDouble();
               System.out.println("Please enter the last test grade >> ");
               test3 = keyboard.nextDouble();
               testsEntered = true;
            }   
               else
               System.out.println("Test grades have already been entered, please choose a new category.");
               break;
            case 'p':
            case 'P': if(projectsEntered == false)
            {
               System.out.println("Please enter the first project grade >> ");
               project1 = keyboard.nextDouble();
               System.out.println("Please enter the second project grade >> ");
               project2 = keyboard.nextDouble();
               System.out.println("Please enter the last project grade >> ");
               project3 = keyboard.nextDouble();
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

      
      x.setGrades(test1, test2, test3, lab1, lab2, lab3, project1, project2, project3, finalEx);
      return x;
   }
}