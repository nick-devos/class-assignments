//Chapter 7: Exercise #11
//Filename: ConstructID.java
//Programmer: Nick DeVos
//Date: 11/30/17

import java.util.Scanner;

public class ConstructID
{
   public static void main(String[] args)
   {
      String fullName;
      String streetAddress;
      StringBuilder userID = new StringBuilder("");
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter your full name");
      fullName = keyboard.nextLine();
      System.out.println("Please enter your street address");
      streetAddress = keyboard.nextLine();
      
      userID.append(fullName.charAt(0));
      
      int count = 0;
      
      while(count < fullName.length())
      {
         if(fullName.charAt(count) == ' ')
         {
            userID.append(fullName.charAt(count + 1));
         }
         count++;
      }
      
      count = 0;
      
      while(count < streetAddress.length())
      {
         if(streetAddress.charAt(count) != ' ')
         {
            userID.append(streetAddress.charAt(count));
         }
         else
         {
            count = streetAddress.length();
         }
         count++;
      }
      
      System.out.println("ID: " + userID);
   }
}