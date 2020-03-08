//Chapter 6: Exercise #14b
//CreatePurchase.java
//Programmer: Nick DeVos
//Date: 11/19/17

import java.util.Scanner;

public class CreatePurchase
{
   public static void main(String[] args)
   {
      int invoiceNumEntered = 0;//initial value starts loop
      double salesAmountEntered = -1;//initial value starts loop
      
      Scanner keyboard = new Scanner(System.in);
      
      while(invoiceNumEntered < 1000 || invoiceNumEntered > 8000)//loop starts and doesn't stop until
                                                                 //user enters value from 1000 and 8000 
      {
         System.out.println("Please enter a valid invoice number (1,000-8,000)");
         
         invoiceNumEntered = keyboard.nextInt();
      }
      
      while(salesAmountEntered < 0)//loops starts and doesn't stop until value entered is above 0
      {
         System.out.println("Please enter a positive sales amount");
         
         salesAmountEntered = keyboard.nextDouble();
      }
      
      Purchase purchase1 = new Purchase(invoiceNumEntered, salesAmountEntered);//creates new object with needed info
      
      purchase1.displayDetails();//displays info for new object
   }
}