//Chapter 2: Case Problem 1
//CarlysEventPrice.java
//Programmer: Nick DeVos
//Date: 9/18/17

import java.util.Scanner;

public class CarlysEventPrice
{
   public static void main(String[] args)
   {
      double PRICE_PER_GUEST = 35;
      int guestNum;
      boolean largeEvent;
      // Variables and constants
      
      Scanner input = new Scanner(System.in);
      // Allow input
      
      System.out.println("How many guests will be present?");
      guestNum = input.nextInt();
      // Get input from user
      
      System.out.println("*************************************************");
      System.out.println("* Carly's makes the food that makes it a party. *");
      System.out.println("*************************************************");
      // Display motto
      
      double totalPrice = guestNum * PRICE_PER_GUEST;
      largeEvent = (guestNum >= 50);
      // Calculations
      
      System.out.println("Number of guests: " + guestNum);
      System.out.println("Price per guest: $" + PRICE_PER_GUEST);
      System.out.println("Total price: $" + totalPrice);
      System.out.println("Large Event? " + largeEvent);
      // Print results
   }
}