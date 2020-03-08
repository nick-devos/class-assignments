//Chapter 8: Exercise #3a
//Filename: CarCareChoice.java
//Programmer: Nick DeVos
//Date: 12/3/17

import java.util.Scanner;

public class CarCareChoice
{
   public static void main(String[] args)
   {
      String choiceInput; //for user input
      boolean validEntry = false; //for input validation
      
      //arrays initialized with needed values
      String[] choices = {"oil change", "tire rotation", "battery check", "brake inspection"};
      double[] prices = {25, 22, 15, 5};
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please type a service option: \noil change, tire rotation, battery check, or brake inspection\n");
      choiceInput = keyboard.nextLine();
      
      for(int x = 0; x < choices.length; ++x)//loops as many times as there is values in choices[]
         if(choiceInput.equals(choices[x]))//when a match is found
         {
            System.out.println(choices[x] + ": $" + prices[x]);//show service selected and price
            validEntry = true; //valid input
         }
         
      if(validEntry == false)//if no match is found (no change in validEntry)
         System.out.println("The service you entered could not be found, please enter a valid service option");
   }
}