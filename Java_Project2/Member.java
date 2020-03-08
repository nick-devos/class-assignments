//Project 1
//Member.java
//Programmer: Nick DeVos
//Date: 3/25/18

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Member implements FitnessCompany
{
   Scanner input = new Scanner(System.in);
   private boolean alsoNutritionMember = false;
   private int memberID;
   private String firstName;
   private String lastName;
   private String memberEmail;
   private String phoneNumber;
   private String address;
   private int memberAge;
   private double planPrice;
   private String planEnrolled;
   private String enrollmentDate;
   protected final String[] monthList = {"Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
   protected double[] trackedWeights = new double[13];
   protected int month, startingMonth;
   protected double addedWeights = 0;
   protected int count = 0;
   protected double avgWeight;
   private String[][] fitnessChart = { {              "",  "30",  "45",  "60"},
                                       {"Weight Lifting", "200", "300", "400"},
                                       {     "Bicycling", "150", "225", "300"},
                                       {        "Rowing", "225", "340", "450"} };
   protected int actChoice, timeChoice;
   
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
   
   public void setMemberID(int memID)
   {
      memberID = memID;
   }
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   public void setPhoneNumber(String phoneNum)
   {
      phoneNumber = phoneNum;
   }
   
   public void setMemberEmail(String memEmail)
   {
      memberEmail = memEmail;
   }
   
   public void setMemberAge(int memAge)
   {
      memberAge = memAge;
   }
   
   public void setAddress(String add)
   {
      address = add;
   }
   
   public void setEnrollmentDate()
   {
      LocalDate localDate = LocalDate.now();
      enrollmentDate = dtf.format(localDate);
   }
   
   public int getMemberID()
   {
      return memberID;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
   
   public String getMemberEmail()
   {
      return memberEmail;
   }
   
   public int getMemberAge()
   {
      return memberAge;
   }
   
   public String getEnrollmentDate()
   {
      return enrollmentDate;
   }
   
   public String getAddress()
   {
      return address;
   }
   
   public void setStartingMonth()//keep track of first month tracking weight
   {      
      System.out.println("Please enter the starting month for weight tracking\nusing numbers 1-12(Ex. JAN = 1, FEB = 2, etc.)");
      month = input.nextInt();
      input.nextLine();
      if(month < 1)//minimum of 1 ("JAN")
         month = 1;
      else if(month > 12)//maximum of 12 ("DEC")
         month = 12;
         
      startingMonth = month;
   }
   
   public void setTrackedWeights()
   {
      boolean addMonth = true;
      char choice;
      while(count < 2)//first two weights
      {
         if(month > 12)//if month is greater than "DEC" reset to "JAN"
            month = 1;
         System.out.println("Please enter weight for " + monthList[month]);
         trackedWeights[month] = input.nextInt();
         input.nextLine();
         
         addedWeights = addedWeights + trackedWeights[month];
         
         month++;
         count++;
      }
      while(addMonth == true)//enter third weight then asks the user if they want to continue
      {
         if(month > 12)//if month is greater than "DEC" reset to "JAN"
            month = 1;
         System.out.println("Please enter weight for " + monthList[month]);
         trackedWeights[month] = input.nextInt();
         input.nextLine();
         
         addedWeights = addedWeights + trackedWeights[month];
         
         month++;
         count++;
         System.out.println("Would you like to continue adding weights/months? (Y/N)");
         choice = input.next().charAt(0);
         if(choice == 'y' || choice == 'Y')
            addMonth = true;
         else if(choice == 'n' || choice == 'N')
            addMonth = false;
         else{
               System.out.println("Value entered was invalid! Exiting weight entry");
               addMonth = false;//anything other than a 'y' ends the entries
             }
      }
   }
   
   public String getFitnessType(int row)
   {
      return fitnessChart[row][0];
   }
   
   public String getFitnessTime(int column)
   {
      return fitnessChart[0][column];
   }
   
   public String getCaloriesBurned(int row, int column)
   {
      return fitnessChart[row][column];
   }
   
   public void getCompanyInfo()
   {
      System.out.println("Company: " + COMPANY_NAME);
      System.out.println("Address: " + ADDRESS);
      System.out.println("Phone:   " + PHONE_NUMBER);
      System.out.println("URL:     " + URL);
   }
   
   public double getPlanPrice()
   {
      return planPrice;
   }
   
   public String getPlanEnrolled()
   {
      return planEnrolled;
   }
   
   public void setPlan(char plan, char nutrition)
   {
      switch(plan)
      {
         case 'G':
         case 'g': planPrice = GYM_PRICE;
                   planEnrolled = "Gym";
                   if(nutrition == 'y' || nutrition == 'Y')
                      planPrice += NUTRITION_PRICE;
            break;
         case 's':
         case 'S': planPrice = SWIM_PRICE;
                   planEnrolled = "Swimming";
                   if(nutrition == 'y' || nutrition == 'Y')
                      planPrice += NUTRITION_PRICE;
            break;
         case 'c':
         case 'C': planPrice = COMBO_PRICE;
                   planEnrolled = "Combo - Gym & Swimming";
                   if(nutrition == 'y' || nutrition == 'Y')
                      planPrice += NUTRITION_PRICE;
            break;
         default: planEnrolled = "VALID PLAN NOT SELECTED!";
      }
   }
   
   public void setAlsoNutritionMember()
   {
      alsoNutritionMember = true;
   }
   
   public boolean getAlsoNutritionMember()
   {
      return alsoNutritionMember;
   }
}