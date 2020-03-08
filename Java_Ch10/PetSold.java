//Chapter 10: Exercise #3
//PetSold.java
//Programmer: Nick DeVos
//Date: 2/11/18

public class PetSold extends ItemSold
{
   boolean vaccinated, neutered, housebroken;
   
   public void setVaccinated(boolean vac)
   {
      vaccinated = vac;
   }
   
   public void setNeutered(boolean neut)
   {
      neutered = neut;
   }
   
   public void setHousebroken(boolean hbk)
   {
      housebroken = hbk;
   }
   
   public boolean getVaccinated()
   {
      return vaccinated;
   }
   
   public boolean getNeutered()
   {
      return neutered;
   }
   
   public boolean getHousebroken()
   {
      return housebroken;
   }
}