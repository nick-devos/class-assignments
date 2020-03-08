//Chapter 5: Exercise #1
//EvenOdd.java
//Programmer: Nick DeVos
//Date: 11/12/17

import java.util.Scanner;

public class EvenOdd
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number;
      
      System.out.println("Please enter an integer >> ");
      number = keyboard.nextInt();
      
      if(number % 2 == 0)//remainder division (remainder of 1 or 0)
         System.out.println("Your number is even!");
      else
         System.out.println("Your number is odd!");
   }
}