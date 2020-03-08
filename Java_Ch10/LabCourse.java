//Chapter 10: Exercise #8
//LabCourse.java
//Programmer: Nick DeVos
//Date: 2/18/18

public class LabCourse extends CollegeCourse
{  
   public LabCourse(String depart, int courseNum, int cred)
   {
      super(depart, courseNum, cred);
      fees = (cred * 120);
   }
   
   @Override
   public void display()
   {
      System.out.println("This course is a lab course!");
      super.display();
      System.out.println("Lab fee: $50");
   }
}