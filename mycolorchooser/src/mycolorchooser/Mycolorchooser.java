/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycolorchooser;

/**
 *
 * @author YannErv
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

class MyColorChooser5 extends JPanel
{
   private JSlider redSlider;
   private JSlider blueSlider;
   private JSlider greenSlider;

   private JTextField redDisplay;
   private JTextField blueDisplay;
   private JTextField greenDisplay;

   private JLabel redLabel;
   private JLabel blueLabel;
   private JLabel greenLabel;

   private Color color;

//set up GUI
   public MyColorChooser5()
   {
      redLabel = new JLabel("Red: ");
      redSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
      redDisplay = new JTextField("0", 4);
   
      greenLabel = new JLabel("Green: ");
      greenSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
      greenDisplay = new JTextField("0", 4);
   
      blueLabel = new JLabel("Blue: ");
      blueSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
      blueDisplay = new JTextField("0", 4);
   
      setLayout(new GridLayout(3, 3));
   
      add(redLabel);
      add(redSlider);
      add(redDisplay);
   
      add(greenLabel);
      add(greenSlider);
      add(greenDisplay);
   
      add(blueLabel);
      add(blueSlider);
      add(blueDisplay);
   
      redSlider.addChangeListener(new ChangeHandler());
      greenSlider.addChangeListener(new ChangeHandler());
      blueSlider.addChangeListener(new ChangeHandler());
   
      redDisplay.addActionListener(new ActionHandler());
      greenDisplay.addActionListener(new ActionHandler());
      blueDisplay.addActionListener(new ActionHandler());
   
      color = Color.black;
   }

//set slider and text field values
   public void setColor(Color c)
   {
      color = c;
   
      redSlider.setValue(c.getRed());
      redDisplay.setText(String.valueOf(c.getRed()));
   
      greenSlider.setValue(c.getGreen());
      greenDisplay.setText(String.valueOf(c.getGreen()));
   
      blueSlider.setValue(c.getBlue());
      blueDisplay.setText(String.valueOf(c.getBlue()));
   }

//get color
   public Color getColor()
   {
      return color;
   }

//get red slider
   public JSlider getRedSlider()
   {
      return redSlider;
   }

//get green slider
   public JSlider getGreenSlider()
   {
      return greenSlider;
   }

//get blue slider
   public JSlider getBlueSlider()
   {
      return blueSlider;
   }

//get red text field
   public JTextField getRedDisplay()
   {
      return redDisplay;
   }

//get green text field
   public JTextField getGreenDisplay()
   {
      return greenDisplay;
   }

//get blue text field
   public JTextField getBlueDisplay()
   {
      return blueDisplay;
   }

//inner class to handle slider events
   private class ChangeHandler implements ChangeListener
   {
   //handle change in slider value
      public void stateChanged(ChangeEvent event)
      {
         int red = redSlider.getValue();
         int green = greenSlider.getValue();
         int blue = blueSlider.getValue();
      
         color = new Color(red, green, blue);
      
         redDisplay.setText(String.valueOf(red));
         greenDisplay.setText(String.valueOf(green));
         blueDisplay.setText(String.valueOf(blue));
      }
   }

//inner class to handle action events
   private class ActionHandler implements ActionListener
   {
   //handle text field input
      public void actionPerformed(ActionEvent event)
      {
         int red = Integer.parseInt(redDisplay.getText());
         int green = Integer.parseInt(greenDisplay.getText());
         int blue = Integer.parseInt(blueDisplay.getText());
      
         color = new Color(red, green, blue);
      
         redSlider.setValue(red);
         greenSlider.setValue(green);
         blueSlider.setValue(blue);
      }
   }
}



