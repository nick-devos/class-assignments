//Project 2
//Grades.java
//Programmer: Nick DeVos
//Date: 11/5/17

public class Grades2
{
   private double testAvg, testOne, testTwo, testThree;
   private double labAvg, labOne, labTwo, labThree;
   private double projectAvg, projectOne, projectTwo, projectThree;
   private double finalExam;
   private String firstName;
   private String lastName;
   private String studentID;
   private double finalGrade;
   private boolean passFail;
   
   public void setGrades(double test1, double test2, double test3, double lab1, double lab2, double lab3, double project1, double project2, double project3, double finalEx)
   {
      testOne = test1;
      testTwo = test2;
      testThree = test3;
      labOne = lab1;
      labTwo = lab2;
      labThree = lab3;
      projectOne = project1;
      projectTwo = project2;
      projectThree = project3;
      finalExam = finalEx;
      testAvg = (testOne + testTwo + testThree) / 3;
      labAvg = (labOne + labTwo + labThree) / 3;
      projectAvg = (projectOne + projectTwo + projectThree) / 3;
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
   
   public double getFinalGrade()
   {
      finalGrade = ((testAvg * .3) + (labAvg * .3) + (projectAvg * .3) + (finalExam * .1));
      return finalGrade;
   }
   
   public boolean getPassFail()
   {
      passFail = (getFinalGrade() >= 60);
      return passFail;
   }
   
   public void displayInfo()
   {
      System.out.println("Welcome to Nick's grade averaging program!");
      System.out.println("Student:       " + getFirstName() + " " + getLastName());
      System.out.println("Student ID:    " + getStudentID());
      System.out.printf("  Test 1:      %.1f\n", testOne);
      System.out.printf("  Test 2:      %.1f\n", testTwo);
      System.out.printf("  Test 3:      %.1f\n", testThree);
      System.out.printf("Test Avg:      %.1f\n", getTestAvg());
      System.out.printf("  Lab 1:       %.1f\n", labOne);
      System.out.printf("  Lab 2:       %.1f\n", labTwo);
      System.out.printf("  Lab 3:       %.1f\n", labThree);
      System.out.printf("Lab Avg:       %.1f\n", getLabAvg());
      System.out.printf("  Project 1:   %.1f\n", projectOne);
      System.out.printf("  Project 2:   %.1f\n", projectTwo);
      System.out.printf("  Project 3:   %.1f\n", projectThree);
      System.out.printf("Project Avg:   %.1f\n", getProjectAvg());
      System.out.printf("Final Exam:    %.1f\n", getFinalExam());
      System.out.printf("Final Grade:   %.1f\n", getFinalGrade());
      System.out.println("Student passing? " + getPassFail());
      System.out.println("Thank you for using Nick's grade averaging program!");
   }
}