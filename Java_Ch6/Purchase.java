//Chapter 6: Exercise #14a
//Purchase.java
//Programmer: Nick DeVos
//Date: 11/19/17

import java.text.*;//needed for formatting

public class Purchase
{
   //variables
   private int invoiceNumber;
   private double salesAmount;
   private double salesTax;
   private double totalAmount;
   
   public Purchase(int invNum, double salAm)//constructor that takes two arguments
   {
      setInvoiceNumber(invNum);
      setSalesAmount(salAm);
   }
   
   public void setInvoiceNumber(int invoiceNum)
   {
      invoiceNumber = invoiceNum;
   }
   
   public void setSalesAmount(double salesAm)
   {
      salesAmount = salesAm;
      salesTax = salesAmount * .05;//sets salesTax when salesAmount is set
   }
   
   public int getInvoiceNumber()
   {
      return invoiceNumber;
   }
   
   public double getSalesAmount()
   {
      return salesAmount;
   }
   
   public double getSalesTax()
   {
      return salesTax;
   }
   
   public double getTotalAmount()//used in displayDetails()
   {
      return (salesAmount + salesTax);
   }
   
   public void displayDetails()
   {
      //creates format for monetary values
      DecimalFormat cashFormat = new DecimalFormat("###,###,###,###,###.00");
      
      System.out.println("Invoice number: " + getInvoiceNumber());
      //formated to display commas and two decimal values
      System.out.printf("Sales amount: $%s\n", cashFormat.format(getSalesAmount()));
      System.out.printf("Sales tax:    $%s\n", cashFormat.format(getSalesTax()));
      System.out.printf("Total amount: $%s\n", cashFormat.format(getTotalAmount()));
   }
}