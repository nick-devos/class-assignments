//Project 3
//GUIMemberInfo.java
//Programmer: Nick DeVos
//Date: 4/16/18

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class GUIMemberInfo extends JFrame implements ActionListener
{
   //create compnents
   FlowLayout flowLayout = new FlowLayout();
   JTextField textbox1 = new JTextField("\t\t\t");
   JTextField textbox2 = new JTextField("\t\t\t");
   JTextField textbox3 = new JTextField("\t\t\t");
   JTextField textbox4 = new JTextField("\t");
   JLabel label1 = new JLabel("Member ID");
   JLabel label2 = new JLabel("Member Name");
   JLabel label3 = new JLabel("Member Address");
   JLabel label4 = new JLabel("Age");
   JButton button1 = new JButton("Save to File");
   
   public GUIMemberInfo()
   {
      //call super
      super("Member Info");
      
      //form settings
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flowLayout);
      
      //add components to JFrame
      add(label1);
      add(textbox1);
      add(label2);
      add(textbox2);
      add(label3);
      add(textbox3);
      add(label4);
      add(textbox4);
      add(button1);
      
      //register listeners
      button1.addActionListener(this);
   }
   
   //main method
   public static void main(String[] args)
   {
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 200;
      
      //instantiate frame object
      GUIMemberInfo frame = new GUIMemberInfo();
      
      frame.setBounds(400,200,FRAME_WIDTH,FRAME_HEIGHT);
      frame.setVisible(true);
   }
   
   //override the ActionListener method
   @Override
   public void actionPerformed(ActionEvent e)
   {
      //get input
      String memID = textbox1.getText().trim();
      String name = textbox2.getText().trim();
      String address = textbox3.getText().trim();
      String age = textbox4.getText().trim();
      
      String filename = "MemberInfo.txt";
      Path currentPath = Paths.get(filename);
      Path fullpathFile = currentPath.toAbsolutePath();
      System.out.println("File location: " + fullpathFile.toString());
      
      String delimiter = ", ";
      String dataLine = "";
      String quit = "Y";
      
      try
      {
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(fullpathFile, CREATE));
         
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
         dataLine = memID + delimiter + name + delimiter + address + delimiter + age;
            
         writer.write(dataLine, 0, dataLine.length());
         writer.newLine();
         
         writer.close();
         
      }//end try
      
      catch(Exception ex)
      {
         System.out.println("There was an error: " + ex);
      }
      
      //calls the method to run the GUIPlanCost class
      GUIPlanCost.planCost();
   }
}