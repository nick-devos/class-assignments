//Chapter 5: Exercise #10
//TwelveDays.java
//Programmer: Nick DeVos
//Date: 11/12/17

import java.util.Scanner;

public class TwelveDays
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int dayEntered = 0;
      
      System.out.println("Which day would you like to start at? (1-12) >> ");
      dayEntered = keyboard.nextInt();
      
      if(dayEntered >= 1 && dayEntered <= 12) //only show if a valid number is entered
         System.out.println("On the " + dayEntered + " day of Christmas, my true love sent to me");
         
      switch(dayEntered)
      {
         case 12: System.out.println("Twelve drummers drumming");
         case 11: System.out.println("Eleven pipers piping");
         case 10: System.out.println("Ten lords a-leaping");
         case 9: System.out.println("Nine ladies dancing");
         case 8: System.out.println("Eight maids a-milking");
         case 7: System.out.println("Seven swans a-swimming");
         case 6: System.out.println("Six geese a-laying");
         case 5: System.out.println("FIVE GOLDEN RINGS!");
         case 4: System.out.println("Four calling birds");
         case 3: System.out.println("Three french hens");
         case 2: System.out.println("Two turtle doves and");
         case 1: System.out.println("A partridge in a pear tree");
            break; //one break statement at the very end so that you get each statement after the one you enter
         default:
            System.out.println("You must enter a number from 1 to 12, please restart");
      }
   }
}