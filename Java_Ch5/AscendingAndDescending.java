//Chapter 5: Exercise #2
//AscendingAndDescending.java
//Programmer: Nick DeVos
//Date: 11/12/17

import java.util.Scanner;

public class AscendingAndDescending
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, num3, high, low, mid;
      high = 0;
      low = 0;
      mid = 0;
      
      System.out.println("Please enter an integer >> ");
      num1 = keyboard.nextInt();
      System.out.println("Please enter a second integer >> ");
      num2 = keyboard.nextInt();
      System.out.println("Please enter a third integer >> ");
      num3 = keyboard.nextInt();
      
      //if statement only works if all numbers are different
      if(num1 != num2 && num2 != num3)
      {   
         //determine highest number
         if((num1 > num2) && (num1 > num3))
            high = num1;
         else if((num1 < num2) && (num1 < num3))
            low = num1;
         else
            mid = num1;
         
         //determine lowest number
         if((num2 > num1) && (num2 > num3))
            high = num2;
         else if((num2 < num1) && (num2 < num3))
            low = num2;
         else
            mid = num2;
         
         //determine middle number   
         if((num3 > num1) && (num3 > num2))
            high = num3;
         else if((num3 < num1) && (num3 < num2))
            low = num3;
         else
            mid = num3;
      }
      else
      {//one or more numbers are equal
         if(num1 == num2)
            if(num1 > num3)
            {
               low = num3;
               mid = num1;
               high = num2;
            }
            else
            {
               low = num1;
               mid = num2;
               high = num3;
            }
         else if(num2 == num3)
            if(num2 > num1)
            {
               low = num1;
               mid = num2;
               high = num3;
            }
            else
            {
               high = num1;
               mid = num2;
               low = num3;
            }
         else if(num1 == num3)
            if(num1 > num2)
            {
               low = num2;
               mid = num1;
               high = num3;
            }
            else
            {
               high = num2;
               mid = num1;
               low = num3;
            }
         else if(num1 == num2 && num1 == num3)//all numbers are equal
         {   
            high = num1;
            mid = num2;
            low = num3;
         }
      }
      
      System.out.println("Your numbers in ascending order are " + low + ", " + mid + ", " + high);
      System.out.println("Your numbers in descending order are " + high + ", " + mid + ", " + low);
   }
}