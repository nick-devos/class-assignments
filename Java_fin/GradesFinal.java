//Project Final
//GradesFinal.java
//Programmer: Nick DeVos
//Date: 12/7/17

public class GradesFinal
{
   //variables
   private double[] tests = new double[3];
   private double[] labs = new double[3];
   private double[] projects = new double[3];
   private double labAvg, testAvg, projectAvg, finalExam;
   private String firstName;
   private String lastName;
   private String studentID;
   private double finalGrade;
   private boolean passFail;
   private char letterGrade;
   
   //setGrades() accepts arrays and finalEx for grade calculation and storage
   public void setGrades(double[] testGrades, double[] labGrades, double[] projectGrades, double finalEx)
   {
      tests = testGrades;
      labs = labGrades;
      projects = projectGrades;
      finalExam = finalEx;
      testAvg = (tests[0] + tests[1] + tests[2]) / 3;
      labAvg = (labs[0] + labs[1] + labs[2]) / 3;
      projectAvg = (projects[0] + projects[1] + projects[2]) / 3;
   }
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   public void setStudentID(String id)
   {
      studentID = id;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public String getStudentID()
   {
      return studentID;
   }
   
   public double getTestAvg()
   {
      return testAvg;
   }
   
   public double getLabAvg()
   {
      return labAvg;
   }
   
   public double getProjectAvg()
   {
      return projectAvg;
   }
   
   public double getFinalExam()
   {
      return finalExam;
   }
   
   //calculates final grade using averages
   public double getFinalGrade()
   {
      finalGrade = ((testAvg * .3) + (labAvg * .3) + (projectAvg * .3) + (finalExam * .1));
      return finalGrade;
   }
   
   //if statement determines letter grade
   public char getLetterGrade()
   {
      if(finalGrade >= 90)
         letterGrade = 'A';
      else if(finalGrade >= 80 && finalGrade < 90)
         letterGrade = 'B';
      else if(finalGrade >= 70 && finalGrade < 80)
         letterGrade = 'C';
      else if(finalGrade >= 60 && finalGrade < 70)
         letterGrade = 'D';
      else
         letterGrade = 'F';
         
      return letterGrade;
   }
   
   //determines whether student is passing or not
   public boolean getPassFail()
   {
      passFail = (getFinalGrade() >= 60);
      return passFail;
   }
   
   //displays student name, ID, grades, etc. 
   public void displayInfo()
   {
      System.out.println("Welcome to Nick's grade averaging program!");
      System.out.println("Student:       " + getFirstName() + " " + getLastName());
      System.out.println("Student ID:    " + getStudentID());
      System.out.printf("  Test 1:      %.1f\n", tests[0]);
      System.out.printf("  Test 2:      %.1f\n", tests[1]);
      System.out.printf("  Test 3:      %.1f\n", tests[2]);
      System.out.printf("Test Avg:      %.1f\n", getTestAvg());
      System.out.printf("  Lab 1:       %.1f\n", labs[0]);
      System.out.printf("  Lab 2:       %.1f\n", labs[1]);
      System.out.printf("  Lab 3:       %.1f\n", labs[2]);
      System.out.printf("Lab Avg:       %.1f\n", getLabAvg());
      System.out.printf("  Project 1:   %.1f\n", projects[0]);
      System.out.printf("  Project 2:   %.1f\n", projects[1]);
      System.out.printf("  Project 3:   %.1f\n", projects[2]);
      System.out.printf("Project Avg:   %.1f\n", getProjectAvg());
      System.out.printf("Final Exam:    %.1f\n", getFinalExam());
      System.out.printf("Final Grade:   %.1f\n", getFinalGrade());
      System.out.println("Letter Grade:  " + getLetterGrade());
      System.out.println("Student passing? " + getPassFail());
      System.out.println("Thank you for using Nick's grade averaging program!");
   }
}