//Project 2
//NutritionMember.java
//Programmer: Nick DeVos
//Date: 3/25/18

public class NutritionMember extends Member
{
   private String nutritionID;
   
   public void setNutritionID(int mID)
   {
      nutritionID = ("N" + mID);
   }
   
   public String getNutritionID()
   {
      return nutritionID;
   }
}