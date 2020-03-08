//Chapter 11: Exercise 1a
//NonFiction.java
//Programmer: Nick DeVos
//Date: 3/10/18

public class NonFiction extends Book
{
   NonFiction(String bkTitle)
   {
      super(bkTitle);
      setPrice();
   }
   
   @Override
   public void setPrice()
   {
      price = 37.99;
   }
}