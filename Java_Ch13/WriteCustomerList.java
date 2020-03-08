//Chapter 13: Exercise 5a
//WriteCustomerList.java
//Programmer: Nick DeVos
//Date: 4/2/18

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class WriteCustomerList
{
   public static void main(String[] args)
   {
      //input fields
      int idNum;
      String firstName, lastName;
      double balanceOwed;
      
      Scanner input = new Scanner(System.in);
      
      String filename = "CustomerList.txt";
      Path currentPath = Paths.get(filename);
      Path fullpathFile = currentPath.toAbsolutePath();
      System.out.println("File location: " + fullpathFile.toString());
      
      String delimiter = ",";
      String dataLine = "";
      String quit = "Y";
      
      try
      {
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(fullpathFile, CREATE));
         
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
         
         while(quit.equals("Y"))
         {
            System.out.println("Enter customer ID");
            idNum = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter customer's first name");
            firstName = input.nextLine();
            
            System.out.println("Enter customer's last name");
            lastName = input.nextLine();
            
            System.out.println("Enter customer's balanced owed");
            balanceOwed = input.nextDouble();
            input.nextLine();
            
            dataLine = idNum + delimiter + firstName + delimiter + lastName + delimiter + balanceOwed;
            
            writer.write(dataLine, 0, dataLine.length());
            writer.newLine();
            
            System.out.println("Do you want to enter another customer?");
            quit = input.nextLine().toUpperCase();
         }//end loop
         
         writer.close();
         
      }//end try
      
      catch(Exception ex)
      {
         System.out.println("There was an error: " + ex);
      }
   }//end main
}//end class