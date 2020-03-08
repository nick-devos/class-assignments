//Chapter 11: Exercise 1a
//Fiction.java
//Programmer: Nick DeVos
//Date: 3/10/18

public class Fiction extends Book
{ 
   Fiction(String bkTitle)
   {
      super(bkTitle);
      setPrice();
   }
   
      @Override
   public void setPrice()
   {
      price = 24.99;
   }
}