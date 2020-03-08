//Chapter 2: Exercise 5
//NauticalMiles.java
//Programmer: Nick DeVos
//Date: 9/18/17

import java.util.Scanner;

public class NauticalMiles
{
   public static void main(String[] args)
   {
      double KILOMETERS_IN_NM = 1.852;
      double MILES_IN_NM = 1.150779;
      double nauticalMiles = 2.54;
      // Declaring variables and constants
      
      System.out.print("The number of kilometers in " + nauticalMiles);
      System.out.print(" nautical miles is " + (nauticalMiles * KILOMETERS_IN_NM));
      // Number of kilometers in a given number of nautical miles
      
      System.out.print("\nThe number of miles in " + nauticalMiles);
      System.out.print(" nautical miles is " + (nauticalMiles * MILES_IN_NM));
      // Number of miles in a given number of nautical miles
   }
}