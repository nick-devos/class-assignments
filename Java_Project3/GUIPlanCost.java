//Project 3
//GUIPlanCost.java
//Programmer: Nick DeVos
//Date: 4/16/18

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIPlanCost extends JFrame implements ItemListener
{
   //create compnents
   FlowLayout flowLayout = new FlowLayout();
   JLabel label1 = new JLabel("Fitness Costs");
   JLabel label2 = new JLabel();
   JRadioButton radiobutton1 = new JRadioButton("Gym - $50.00");
   JRadioButton radiobutton2 = new JRadioButton("Swim - $50.00");
   JRadioButton radiobutton3 = new JRadioButton("Combo - $90.00");
   JCheckBox checkbox1 = new JCheckBox("Nutitional Plan - $10.00");
   
   final double GYM_COST = 50.00;
   final double SWIM_COST = 50.00;
   final double COMBO_COST = 90.00;
   final double NUTRITIONAL_COST = 10.00;
   
   //create button group
   ButtonGroup rButtonGroup = new ButtonGroup();
   
   public GUIPlanCost()
   {
      //call super
      super("Plan Cost");
      
      //form settings
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flowLayout);
      
      //add radio buttons to group
      rButtonGroup.add(radiobutton1);
      rButtonGroup.add(radiobutton2);
      rButtonGroup.add(radiobutton3);
      
      //add components to JFrame
      add(label1);
      add(radiobutton1);
      add(radiobutton2);
      add(radiobutton3);
      add(checkbox1);
      add(label2);
      
      label1.setFont(new Font("Arial", Font.ITALIC, 20));
      
      //register listeners
      radiobutton1.addItemListener(this);
      radiobutton2.addItemListener(this);
      radiobutton3.addItemListener(this);
      checkbox1.addItemListener(this);
   }
   
   //main method
   public static void planCost()
   {
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 200;
      
      //instantiate frame object
      GUIPlanCost frame = new GUIPlanCost();
      
      frame.setBounds(400,350,FRAME_WIDTH,FRAME_HEIGHT);
      frame.setVisible(true);
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      double totalPrice = 0;
      
      if(radiobutton1.isSelected())
      {
         totalPrice = GYM_COST;
         if(checkbox1.isSelected())
         {
            totalPrice += NUTRITIONAL_COST;
         }
      }
      else if(radiobutton2.isSelected())
      {
         totalPrice = SWIM_COST;
         if(checkbox1.isSelected())
         {
            totalPrice += NUTRITIONAL_COST;
         }
      }
      else if(radiobutton3.isSelected())
      {
         totalPrice = COMBO_COST;
         if(checkbox1.isSelected())
         {
            totalPrice += NUTRITIONAL_COST;
         }
      }
      
      label2.setText("Total amount due: $" + totalPrice);
   }
}