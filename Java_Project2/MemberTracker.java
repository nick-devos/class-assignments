//Project 2
//MemberTracker.java
//Programmer: Nick DeVos
//Date: 3/25/18

import java.util.Scanner;
import java.text.*;//needed for formatting cash price


public class MemberTracker
{
   //Global variable
   public static int memberID = 1;
   private static char nutritionChoice;
   private static char planChoice;
   private static int userEnteredID; //variable for look up
   private static final int MAX_MEMBER_COUNT = 999; //maximum member count
   private static Member[] members = new Member[MAX_MEMBER_COUNT]; //create an array of members the max size
   private static NutritionMember[] nutritionMembers = new NutritionMember[MAX_MEMBER_COUNT]; //create an array of members the max size
   private static DecimalFormat cashFormat = new DecimalFormat("###,###,###,###,###.00"); //formatting for monetary values

   public static void main(String[] args)
   {
      //Variables
      char userChoice;
      boolean stopProgram = false;
      String memberChosen;
      
      //Scanner object to allow input
      Scanner keyboard = new Scanner(System.in); //allow keyboard input from user
      
      
      for(int index = 0; index < MAX_MEMBER_COUNT; index++)
         members[index] = new Member(); //create memory locations for each member
         
      
      for(int ind = 0; ind < MAX_MEMBER_COUNT; ind++)
         nutritionMembers[ind] = new NutritionMember(); //create memory locations for each member
      
      while(stopProgram == false)
      {
         try
         {
            //display member menu
            System.out.println("Member menu:\n\t(E)nter member information,\n\t(W)eight information,\n\t(F)itness information,\n\t(D)isplay member information,\n\tE(x)it program");
            System.out.println("Please enter the letter of the option you would\nlike to choose found between the parentheses");
            userChoice = keyboard.next().charAt(0); //only allow first char entered to be used
         
            switch(userChoice)
            {
               case 'e':
               case 'E': System.out.println("New member ID number: " + memberID); //call enterNewMember() method for the first member, then the next when chosen again
                         enterNewMember(members[memberID - 1]);                   //since memberID is incremented by one at the end of the method
                      
                      
               break;
               case 'w':
               case 'W': System.out.println("Please enter the member ID of the desired member");
                         keyboard.nextLine();
                         memberChosen = keyboard.nextLine();
                         enterWeightInfo(members[Integer.parseInt(memberChosen)]);
                         displayWeightInfo(members[Integer.parseInt(memberChosen)],memberChosen);
               break;
               case 'f':
               case 'F': System.out.println("Please enter the member ID of the desired member");
                         keyboard.nextLine();
                         memberChosen = keyboard.nextLine();
                         displayFitnessInfo(members[Integer.parseInt(memberChosen)]);
               break;
               case 'd':
               case 'D': System.out.println("Enter the member ID for the member you would like to see information about.");
                         userEnteredID = keyboard.nextInt(); //get user input
                         determineDisplayType(members[(userEnteredID - 1)]);
               break;
               case 'x':
               case 'X': stopProgram = true; //stops the program by ending loop
               break;
            }
         }
         catch(Exception e)
         {
            System.out.println("\n***\n*** ERROR! Caused by user input! Please use correct input for each field!\n***\n");
         }
         
      }
   }
   
   public static Member enterNewMember(Member x)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter member's first name");
      x.setFirstName(input.nextLine());
      System.out.println("Please enter member's last name");
      x.setLastName(input.nextLine());
      System.out.println("Please enter member's phone number");
      x.setPhoneNumber(input.nextLine());
      System.out.println("Please enter member's age");
      x.setMemberAge(input.nextInt());
      input.nextLine();
      System.out.println("Please enter member's email address");
      x.setMemberEmail(input.nextLine());
      System.out.print("(G)ym\n(S)wimming\n(C)ombo - Gym + Swimming\nPlease enter desired plan's first letter >> ");
      planChoice = input.next().charAt(0);
      System.out.println("Would you like to add a nutrition plan? (Y/N)");
      nutritionChoice = input.next().charAt(0);
      x.setPlan(planChoice, nutritionChoice);
      if(nutritionChoice == 'y' || nutritionChoice == 'Y')
      {
         makeNutritionMember(nutritionMembers[memberID - 1]);//if the user wants to create a nutrition ID, call the method that does so
         x.setAlsoNutritionMember();
      }
      
      
      x.setMemberID(memberID);
      x.setEnrollmentDate();
      
      memberID++; //Ready memberID for next new member (each new member gets the next available memberID)
      return x;
   }
   
   public static void makeNutritionMember(NutritionMember e)//instantiates new NutritionMember and sets the NutritionID
   {
      e.setNutritionID(memberID);
      System.out.println("Nutrition ID: " + e.getNutritionID() + "\n");
   }
   
   public static Member displayMemberInfo(Member z)//first option of overloaded displayMemberInfo() method
   {
      z.getCompanyInfo();
      System.out.println("\nMember ID: " + z.getMemberID());
      System.out.println("Name: " + z.getFirstName() + " " + z.getLastName());
      System.out.println("Phone Number: " + z.getPhoneNumber());
      System.out.println("Email: " + z.getMemberEmail());
      System.out.println("Age: " + z.getMemberAge());
      System.out.println("Date of Enrollment: " + z.getEnrollmentDate());
      System.out.println("\nType of Plan: " + z.getPlanEnrolled());
      System.out.printf("Plan Price: $%s\n\n", cashFormat.format(z.getPlanPrice()));
      
      return z;
   }
   
   public static Member displayMemberInfo(Member z, NutritionMember d)//second option of overloaded displayMemberInfo() method
   {                                                                  //used if the member is also a nutrition member
      z.getCompanyInfo();
      System.out.println("\nNutrition Member ID: " + d.getNutritionID());
      System.out.println("Member ID: " + z.getMemberID());
      System.out.println("Name: " + z.getFirstName() + " " + z.getLastName());
      System.out.println("Phone Number: " + z.getPhoneNumber());
      System.out.println("Email: " + z.getMemberEmail());
      System.out.println("Age: " + z.getMemberAge());
      System.out.println("Date of Enrollment: " + z.getEnrollmentDate());
      System.out.println("\nType of Plan: " + z.getPlanEnrolled());
      System.out.printf("Plan Price: $%s\n\n", cashFormat.format(z.getPlanPrice()));
      
      return z;
   }
   
   public static Member determineDisplayType(Member f)
   {
      if(f.getAlsoNutritionMember() == true)
      {
         displayMemberInfo(members[userEnteredID - 1], nutritionMembers[userEnteredID -1]); //index for user is one less than memberID
      }
      else
      {
         displayMemberInfo(members[userEnteredID - 1]);
      }
      
      return f;
   }
   
   public static Member enterWeightInfo(Member q)
   {
      Scanner input = new Scanner(System.in);
      
      q.setStartingMonth();
      q.setTrackedWeights();
      
      return q;
   }
   
   public static Member displayWeightInfo(Member e, String memID)
   {
      e.avgWeight = e.addedWeights / e.count;//average weight calculation
      
      System.out.println("Member ID: " + memID);
      System.out.println("\nStarting weight in " + e.monthList[e.startingMonth] + ": " + e.trackedWeights[e.startingMonth]);
      e.month = e.startingMonth + 1;
      if(e.month > 12)//if month is greater than "DEC" reset to "JAN"
         e.month = 1;
      while(e.count > 1)
      {
         if(e.month > 12)//if month is greater than "DEC" reset to "JAN"
         e.month = 1;
         
         System.out.println("\nWeight in " + e.monthList[e.month] + ": " + e.trackedWeights[e.month] + "   ");
         if(e.month > 1)
            if(e.trackedWeights[e.month] > e.trackedWeights[e.month - 1])//determine pounds gained/lost from previous month
               System.out.println((e.trackedWeights[e.month] - e.trackedWeights[e.month - 1]) + " pounds gained!");
            else if(e.trackedWeights[e.month] < e.trackedWeights[e.month - 1])
               System.out.println((e.trackedWeights[e.month - 1] - e.trackedWeights[e.month]) + " pounds lost!");
            else
               System.out.println("No change from previous month");
         else if(e.month == 1)//if month is "JAN" refer back to "DEC"
            if(e.trackedWeights[e.month] > e.trackedWeights[12])
               System.out.println((e.trackedWeights[e.month] - e.trackedWeights[12]) + " pounds gained!");
            else if(e.trackedWeights[e.month] < e.trackedWeights[12])
               System.out.println((e.trackedWeights[12] - e.trackedWeights[e.month]) + " pounds lost!");
            else
               System.out.println("No change from previous month");
         
         e.count--;
         e.month++;
      }
      System.out.println("\nAverage Weight: " + e.avgWeight + "\n");
      
      return e;
   }
   
   public static Member displayFitnessInfo(Member h)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please choose the number of the activity performed\n(1)Weight lifting, (2)Bicycling, (3)Rowing");
      h.actChoice = keyboard.nextInt();
      System.out.println("Please choose the number of minutes performed\n(1)30 Minutes, (2)45 Minutes, (3)60 Minutes");
      h.timeChoice = keyboard.nextInt();
      
      //user input is used to look up Strings in two-dimensional array
      System.out.println("Activity performed: " + h.getFitnessType(h.actChoice));
      System.out.println("Amount of time: " + h.getFitnessTime(h.timeChoice) + " minutes");
      System.out.println("Calories burned: " + h.getCaloriesBurned(h.actChoice, h.timeChoice) + "\n");
      
      return h;
   }
}