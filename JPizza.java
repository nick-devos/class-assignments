//Chapter 14: Exercise 6
//JPizza.java
//Programmer: Nick DeVos
//Date: 4/8/18

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPizza extends JFrame implements ItemListener, ActionListener
{
   //create compnents
   FlowLayout flowLayout = new FlowLayout();
   JLabel label = new JLabel("Please choose your pizza size");
   JLabel label2 = new JLabel("Which toppings would you like? ($1 each)");
   JLabel label3 = new JLabel("");
   JRadioButton small = new JRadioButton("Small ($7)");
   JRadioButton medium = new JRadioButton("Medium ($9)");
   JRadioButton large = new JRadioButton("Large ($11)");
   JRadioButton extraLarge = new JRadioButton("Extra-Large ($14)");
   JCheckBox pepperoni = new JCheckBox("Pepperoni");
   JCheckBox chicken = new JCheckBox("Chicken");
   JCheckBox bacon = new JCheckBox("Bacon");
   JCheckBox ham = new JCheckBox("Ham");
   JCheckBox mushrooms = new JCheckBox("Mushrooms");
   JButton orderButton = new JButton("Place Order");
   private String pizzaSize = "";
   private double pizzaPrice;
   
   //create button group
   ButtonGroup rButtonGroup = new ButtonGroup();

   public JPizza()
   {
      //call super
      super("Pizza Order");
         
      //form settings
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flowLayout);
      
      //add radio buttons to group
      rButtonGroup.add(small);
      rButtonGroup.add(medium);
      rButtonGroup.add(large);
      rButtonGroup.add(extraLarge);
         
      //add components to JFrame
      add(label);
      add(small);
      add(medium);
      add(large);
      add(extraLarge);
      add(label2);
      add(pepperoni);
      add(chicken);
      add(bacon);
      add(ham);
      add(mushrooms);
      add(orderButton);
      add(label3);
      
      //set font for label
      label.setFont(new Font("Arial", Font.ITALIC, 24));
      label2.setFont(new Font("Arial", Font.ITALIC, 22));
      
      //register listeners
      small.addItemListener(this);
      medium.addItemListener(this);
      large.addItemListener(this);
      extraLarge.addItemListener(this);
      orderButton.addActionListener(this);
   }
      
   //main method
   public static void main(String[] args)
   {
      final int FRAME_WIDTH = 425;
      final int FRAME_HEIGHT = 225;
      
      //instantiate frame object
      JPizza frame = new JPizza();
      
      //set attributes
      frame.setBounds(500, 400, FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
   }
   
   //override the ItemListener
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      //determine the source
      Object source = e.getItem();
      
      if(source == small)
      {
         pizzaSize = "small";
      }
      else if(source == medium)
      {
         pizzaSize = "medium";
      }
      else if(source == large)
      {
         pizzaSize = "large";
      }
      else if(source == extraLarge)
      {
         pizzaSize = "extraLarge";
      }
      else
      {
         pizzaSize = "error";
      }
   }
   
   //overrider the ActionListener
   @Override
   public void actionPerformed(ActionEvent a)
   {
      switch(pizzaSize)
      {
         case "small": pizzaPrice = 7;
            break;
         case "medium": pizzaPrice = 9;
            break;
         case "large": pizzaPrice = 11;
            break;
         case "extraLarge": pizzaPrice = 14;
            break;
      }
      
      if(pepperoni.isSelected())
      {
         pizzaPrice += 1;
      }
      if(chicken.isSelected())
      {
         pizzaPrice += 1;
      }
      if(bacon.isSelected())
      {
         pizzaPrice += 1;
      }
      if(ham.isSelected())
      {
         pizzaPrice += 1;
      }
      if(mushrooms.isSelected())
      {
         pizzaPrice += 1;
      }
      
      label3.setText("Your order total is: $" + pizzaPrice);
   }
}