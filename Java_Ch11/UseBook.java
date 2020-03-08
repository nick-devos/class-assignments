//Chapter 11: Exercise 1a
//UseBook.java
//Programmer: Nick DeVos
//Date: 3/10/18

import java.util.Scanner;

public class UseBook
{
   public static void main(String[] args)
   {
      String titleOfBook;
      char genre;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Is your book fiction or nonfiction?\nPlease enter an 'N' for nonfiction or a 'F' for fiction >> ");
      genre = input.nextLine().charAt(0);
      System.out.println("What is the title of your book?");
      titleOfBook = input.nextLine();
      
      switch(genre)
      {
         case 'n':
         case 'N': NonFiction nonFictionBook1 = new NonFiction(titleOfBook);
                   System.out.println("Title: " + nonFictionBook1.getTitle());
                   System.out.println("Price: " + nonFictionBook1.getPrice());
            break;
         case 'f':
         case 'F': Fiction fictionBook1 = new Fiction(titleOfBook);
                   System.out.println("Title: " + fictionBook1.getTitle());
                   System.out.println("Price: " + fictionBook1.getPrice());
            break;
         default: System.out.println("You entered an incorrect choice, please try again");
      }
   }
}