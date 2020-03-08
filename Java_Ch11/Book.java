//Chapter 11: Exercise 1a
//Book.java
//Programmer: Nick DeVos
//Date: 3/10/18

public abstract class Book
{
   private String title;
   protected double price;
   public abstract void setPrice();
   
   Book(String bookTitle)
   {
      title = bookTitle;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public double getPrice()
   {
      return price;
   }
}