//Chapter 13: Exercise 5b
//DisplaySavedCustomerList.java
//Programmer: Nick DeVos
//Date: 4/2/18

import java.nio.file.*;
import java.io.*;

public class DisplaySavedCustomerList
{
   public static void main(String[] args)
   {
      String filename = "CustomerList.txt";
      Path currentPath = Paths.get(filename);
      Path fullpathFile = currentPath.toAbsolutePath();
      
      InputStream streamData = null;
      
      String dataLine = "";
      
      try
      {
         streamData = Files.newInputStream(fullpathFile);
         
         BufferedReader buffReader = new BufferedReader(new InputStreamReader(streamData));
         
         dataLine = buffReader.readLine();
         
         while(dataLine != null)
         {
            System.out.println(dataLine);
            dataLine = buffReader.readLine();
         }//end loop
         
         streamData.close();
         
      }//end try
      
      catch(Exception ex)
      {
         System.out.println("There was an error: " + ex);
      }//end catch
   }//end main
}//end class