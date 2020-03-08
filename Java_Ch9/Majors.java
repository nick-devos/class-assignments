//Chapter 9: Exercise #9
//Majors.java
//Programmer: Nick DeVos
//Date: 1/29/18

import java.util.Scanner;

public class Majors
{
   enum CollegeMajors {ACC, CHEM, CIS, ENG, HIS, PHYS};
   
   public static void main(String[] args)
   {
      String userChoice;
      CollegeMajors majorChosen;
      
      System.out.print("Majors offered: ");
      for(CollegeMajors maj : CollegeMajors.values())
         System.out.print(maj + " ");
      System.out.println();
         
      System.out.print("Please enter a major >> ");
      Scanner input = new Scanner(System.in);
      userChoice = input.nextLine().toUpperCase();
      majorChosen = CollegeMajors.valueOf(userChoice);
      
      switch(majorChosen)
      {
         case ACC:
         case CIS: System.out.println(majorChosen + " is in the Business Division.");
            break;
         case CHEM:
         case PHYS: System.out.println(majorChosen + " is in the Science Division.");
            break;
         case ENG:
         case HIS: System.out.println(majorChosen + " is in the Humanities Division.");
            break;
      }
   }
}