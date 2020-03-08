//Chapter 6: Exercise #3
//EvenEntryLoop.java
//Programmer: Nick DeVos
//Date: 11/19/17

import java.util.Scanner;

public class EvenEntryLoop
{
   public static void main(String[] args)
   {
      int intEntered = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      while(intEntered != 999)
      {
         System.out.println("Please enter an even number (enter 999 to exit)");
         intEntered = keyboard.nextInt();
         
         if((intEntered % 2) == 0)
            System.out.println("Good job!");
         else if(intEntered == 999)
            System.out.println("**Exit loop sentinel value entered**");
         else
            System.out.println("ERROR: Value entered was not an even number!");
      }
   }
}