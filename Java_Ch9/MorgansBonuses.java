//Chapter 9: Exercise #10
//MorgansBonuses.java
//Programmer: Nick DeVos
//Date: 2/4/18

import java.util.Scanner;

public class MorgansBonuses
{
   public static void main(String[] args)
   {
      //variables
      int weeksWorked = 0;
      int positiveReviews = 0;
      Scanner keyboard = new Scanner(System.in);
      //declare the two-dimensional array and initialize the values
      double[][] bonuses = { {5.00,    9.00,  16.00,  22.00,  30.00},
                             {10.00,  12.00,  18.00,  24.00,  36.00},
                             {20.00,  25.00,  32.00,  42.00,  53.00},
                             {32.00,  38.00,  45.00,  55.00,  68.00},
                             {46.00,  54.00,  65.00,  77.00,  90.00},
                             {60.00,  72.00,  84.00,  96.00, 120.00},
                             {85.00, 100.00, 120.00, 140.00, 175.00} };
                             
      System.out.println("Morgan's Department Store bonus look-up - Programmed by Nick DeVos\n");
      while(weeksWorked >= 0)
      {
         System.out.print("Enter the employees full weeks worked or enter a negative integer to exit >> ");
         weeksWorked = keyboard.nextInt();
         if(weeksWorked > 6)
            weeksWorked = 6;
         if(weeksWorked >= 0)
         {
            System.out.print("Enter the number of positive reviews >> ");
            positiveReviews = keyboard.nextInt();
            if(positiveReviews > 4)
               positiveReviews = 4;
            else if(positiveReviews < 0)
               positiveReviews = 0;
            System.out.printf("The employee's bonus is: $%.2f\n", bonuses[weeksWorked][positiveReviews]);
            System.out.println();
         }
      }
      System.out.println("Thank you for using Nick's bonus look-up program, using a two-dimensional array!");
   }
}