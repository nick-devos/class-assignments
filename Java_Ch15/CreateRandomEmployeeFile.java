//Chapter 15: Exercise 9a
//CreateRandomEmployeeFile.java
//Programmer: Nick DeVos
//Date: 4/22/18

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class CreateRandomEmployeeFile extends JFrame implements ActionListener
{
   //create container
   Container content = getContentPane();  //layout of contentPane, default is border
   
   //create panel
   JPanel panel = new JPanel();
   
   //components
   JLabel label1 = new JLabel("Employee ID: ");
   JLabel label2 = new JLabel("First name: ");
   JLabel label3 = new JLabel("Last name: ");
   JLabel label4 = new JLabel("Hourly pay rate: ");
   JLabel blankLabel = new JLabel();
   JButton button = new JButton("Save Entry");
   JTextField textbox1 = new JTextField();
   JTextField textbox2 = new JTextField();
   JTextField textbox3 = new JTextField();
   JTextField textbox4 = new JTextField();
   
   public CreateRandomEmployeeFile()
   {
      super("Employee Info");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //content pane
      panel.setLayout(new GridLayout(5, 2, 8, 8));
      
      //add components to panel
      panel.add(label1);
      panel.add(textbox1);
      panel.add(label2);
      panel.add(textbox2);
      panel.add(label3);
      panel.add(textbox3);
      panel.add(label4);
      panel.add(textbox4);
      panel.add(blankLabel);
      panel.add(button);
      
      //add panel to content pane
      content.add(panel);
      
      //register listener
      button.addActionListener(this);
   }
   
   public static void main(String[] args)
   {
      //size for container
      final int WIDTH = 300;
      final int HEIGHT = 300;
      
      CreateRandomEmployeeFile frame = new CreateRandomEmployeeFile();
      
      //size and position of frame
      frame.setBounds(500, 400, WIDTH, HEIGHT);
      frame.setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent a)
   {
      //get input
      String empID = textbox1.getText().trim();
      String firstName = textbox2.getText().trim();
      String lastName = textbox3.getText().trim();
      String payRate = textbox4.getText().trim();
      
      String filename = "EmployeeInfo.txt";
      Path currentPath = Paths.get(filename);
      Path fullpathFile = currentPath.toAbsolutePath();
      
      String delimiter = ", ";
      String dataLine = "";
      
      try
      {
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(fullpathFile, CREATE, APPEND));
         
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
         dataLine = empID + delimiter + firstName + delimiter + lastName + delimiter + payRate;
         System.out.println("Entry Added: " + dataLine);
            
         writer.write(dataLine, 0, dataLine.length());
         writer.newLine();
         
         writer.close();
         
         textbox1.setText("");
         textbox2.setText("");
         textbox3.setText("");
         textbox4.setText("");
         textbox1.requestFocus();
         
      }//end try
      
      catch(Exception ex)
      {
         System.out.println("There was an error: " + ex);
      }
   }
}