//Chapter 2: Figure 2-43
//ArithmeticDemo3.java
//Programmer: Nick DeVos
//Date: 9/18/17

import java.util.Scanner;
// Importing scanner

public class ArithmeticDemo3
{
   public static void main(String[] args)
   {
      double firstNumber, secondNumber, sum, difference, average;
      // Declaring all variables as doubles
      
      Scanner input = new Scanner(System.in);
      // New scanner input
      
      System.out.print("Please enter a double >> ");
      firstNumber = input.nextDouble();
      System.out.print("Please enter another double >> ");
      secondNumber = input.nextDouble();
      // Asking user for input
      
      sum = firstNumber + secondNumber;
      difference = firstNumber - secondNumber;
      average = sum / 2.0;
      // Calculations
      
      System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
      System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
      System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
      // Print to screen
   }
}