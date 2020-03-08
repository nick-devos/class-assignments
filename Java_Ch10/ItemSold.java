//Chapter 10: Exercise #3
//ItemSold.java
//Programmer: Nick DeVos
//Date: 2/11/18

public class ItemSold
{
   private int invoiceNumber;
   private String description;
   private double price;
   
   public void setInvoiceNumber(int invNum)
   {
      invoiceNumber = invNum;
   }
   
   public void setDescription(String descript)
   {
      description = descript;
   }
   
   public void setPrice(double prc)
   {
      price = prc;
   }
   
   public int getInvoiceNumber()
   {
      return invoiceNumber;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public double getPrice()
   {
      return price;
   }
}