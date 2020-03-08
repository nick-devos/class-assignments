//Chapter 10: Exercise #3
//DemoItemsAndPets.java
//Programmer: Nick DeVos
//Date: 2/11/18

import java.util.Scanner;

public class DemoItemsAndPets
{
   public static void main(String[] args)
   {
   char boolAnswer;
   
   //instantiating two of each object
   ItemSold item1 = new ItemSold();
   ItemSold item2 = new ItemSold();
   PetSold pet1 = new PetSold();
   PetSold pet2 = new PetSold();
   
   Scanner input = new Scanner(System.in);
   
   //item 1, using parent class, cannot use child class
   System.out.print("Enter invoice number for item 1 >> ");
   item1.setInvoiceNumber(input.nextInt());
   input.nextLine();
   System.out.print("Enter description for item 1 >> ");
   item1.setDescription(input.nextLine());
   System.out.print("Enter price for item 1 >> ");
   item1.setPrice(input.nextDouble());
   System.out.println();
   
   //item 2, using parent class, cannot use child class
   System.out.print("Enter invoice number for item 2 >> ");
   item2.setInvoiceNumber(input.nextInt());
   input.nextLine();
   System.out.print("Enter description for item 2 >> ");
   item2.setDescription(input.nextLine());
   System.out.print("Enter price for item 2 >> ");
   item2.setPrice(input.nextDouble());
   System.out.println();
   
   //pet 1, using child class and parent class
   System.out.print("Enter invoice number for pet 1 >> ");
   pet1.setInvoiceNumber(input.nextInt());
   input.nextLine();
   System.out.print("Enter description for pet 1 >> ");
   pet1.setDescription(input.nextLine());
   System.out.print("Enter price for pet 1 >> ");
   pet1.setPrice(input.nextDouble());
   input.nextLine();
   //boolean variables being set in pet(sub) class
   System.out.print("Is the pet 1 vaccinated? (Y/N) >> ");
   boolAnswer = input.next().charAt(0);
   if(boolAnswer == 'Y' || boolAnswer == 'y')
      pet1.setVaccinated(true);
   else
      pet1.setVaccinated(false);
   System.out.print("Is the pet 1 neutered? (Y/N) >> ");
   boolAnswer = input.next().charAt(0);
   if(boolAnswer == 'Y' || boolAnswer == 'y')
      pet1.setNeutered(true);
   else
      pet1.setNeutered(false);
   System.out.print("Is the pet 1 housebroken? (Y/N) >> ");
   boolAnswer = input.next().charAt(0);
   if(boolAnswer == 'Y' || boolAnswer == 'y')
      pet1.setHousebroken(true);
   else
      pet1.setHousebroken(false);
   
   System.out.println();
   
   //pet 2, using child class and parent class
   System.out.print("Enter invoice number for pet 2 >> ");
   pet2.setInvoiceNumber(input.nextInt());
   input.nextLine();
   System.out.print("Enter description for pet 2 >> ");
   pet2.setDescription(input.nextLine());
   System.out.print("Enter price for pet 2 >> ");
   pet2.setPrice(input.nextDouble());
   //boolean variables being set in pet(sub) class
   System.out.print("Is the pet 2 vaccinated? (Y/N) >> ");
   boolAnswer = input.next().charAt(0);
   if(boolAnswer == 'Y' || boolAnswer == 'y')
      pet2.setVaccinated(true);
   else
      pet2.setVaccinated(false);
   System.out.print("Is the pet 2 neutered? (Y/N) >> ");
   boolAnswer = input.next().charAt(0);
   if(boolAnswer == 'Y' || boolAnswer == 'y')
      pet2.setNeutered(true);
   else
      pet2.setNeutered(false);
   System.out.print("Is the pet 2 housebroken? (Y/N) >> ");
   boolAnswer = input.next().charAt(0);
   if(boolAnswer == 'Y' || boolAnswer == 'y')
      pet2.setHousebroken(true);
   else
      pet2.setHousebroken(false);
   
   System.out.println();
   
   //item class can only use methods within item class, cannot use pet class 
   System.out.println("Invoice number: " + item1.getInvoiceNumber());
   System.out.println("Item 1: " + item1.getDescription());
   System.out.printf("Price: $%.2f\n", item1.getPrice());
   System.out.println();
   
   //item class can only use methods within item class, cannot use pet class
   System.out.println("Invoice number: " + item2.getInvoiceNumber());
   System.out.println("Item 2: " + item2.getDescription());
   System.out.printf("Price: $%.2f\n", item2.getPrice());
   System.out.println();
   
   //using pet(child) class object to call methods from item(parent) class
   System.out.println("Invoice number: " + pet1.getInvoiceNumber());
   System.out.println("Pet 1: " + pet1.getDescription());
   System.out.printf("Price: $%.2f\n", pet1.getPrice());
   //using pet class methods
   System.out.println("Vaccinated? " + pet1.getVaccinated());
   System.out.println("Neutered? " + pet1.getNeutered());
   System.out.println("Housebroken? " + pet1.getHousebroken() + "\n");
   
   //using pet(child) class object to call methods from item(parent) class
   System.out.println("Invoice number: " + pet2.getInvoiceNumber());
   System.out.println("Pet 2: " + pet2.getDescription());
   System.out.printf("Price: $%.2f\n", pet2.getPrice());
   //using pet class methods
   System.out.println("Vaccinated? " + pet2.getVaccinated());
   System.out.println("Neutered? " + pet2.getNeutered());
   System.out.println("Housebroken? " + pet2.getHousebroken());
   }
}