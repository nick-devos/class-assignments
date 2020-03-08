//Chapter 6: Exercise #13
//BarChart.java
//Programmer: Nick DeVos
//Date: 11/19/17

import java.util.Scanner;

public class BarChart
{
   public static void main(String[] args)
   {
      int artPts, bobPts, calPts, danPts, eliPts;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter points scored by Art >> ");
      artPts = keyboard.nextInt();
      System.out.println("Enter points scored by Bob >> ");
      bobPts = keyboard.nextInt();
      System.out.println("Enter points scored by Cal >> ");
      calPts = keyboard.nextInt();
      System.out.println("Enter points scored by Dan >> ");
      danPts = keyboard.nextInt();
      System.out.println("Enter points scored by Eli >> ");
      eliPts = keyboard.nextInt();
      
      displayBarChart(artPts,bobPts,calPts,danPts,eliPts);
   }
   
   public static void displayBarChart(int artPts, int bobPts, int calPts, int danPts, int eliPts)
   {
      System.out.println("\nPoints for Game");
      
      System.out.print("\nArt   ");
      while(artPts > 0)
      {
         System.out.print("*");
         artPts--;
      }
      
      System.out.print("\nBob   ");
      while(bobPts > 0)
      {
         System.out.print("*");
         bobPts--;
      }
      
      System.out.print("\nCal   ");
      while(calPts > 0)
      {
         System.out.print("*");
         calPts--;
      }
      
      System.out.print("\nDan   ");
      while(danPts > 0)
      {
         System.out.print("*");
         danPts--;
      }
      
      System.out.print("\nEli   ");
      while(eliPts > 0)
      {
         System.out.print("*");
         eliPts--;
      }
   }
}