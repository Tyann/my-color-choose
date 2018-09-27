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

//create Pallet5 class which extends JFrame
public class Pallet5 extends JFrame
{
//create variables
   private DrawPanel5 drawPanel;
   private ShapePanel5 shapePanel;
   private boolean filled;
   private JComboBox choose;

//create Palet constructor
   public Pallet5()
   {
      super("Drawing Shapes");
   
   //create Color object
      MyColorChooser5 colorChooser = new MyColorChooser5();
   
   //define red color slider
      final JSlider red = colorChooser.getRedSlider();
      red.addChangeListener(
            new ChangeListener()
            {
               public void stateChanged(ChangeEvent event)
               {
                  drawPanel.setRed(red.getValue());
               }
            }
                     );
   
   //create red color text field
      final JTextField redField = colorChooser.getRedDisplay();
      redField.addActionListener(
            new ActionListener()
            {
                     //handle text field event
               public void actionPerformed(ActionEvent event)
               {
                  drawPanel.setRed(Integer.parseInt(redField.getText()));
               }
            }
                     );
                     
   //define green color slider
      final JSlider green = colorChooser.getGreenSlider();
      green.addChangeListener(
            new ChangeListener()
            {
               public void stateChanged(ChangeEvent event)
               {
                  drawPanel.setGreen(green.getValue());
               }
            }
                     );
   
   //create green color text field
      final JTextField greenField = colorChooser.getGreenDisplay();
      greenField.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent event)
               {
                  drawPanel.setGreen(Integer.parseInt(greenField.getText()));
               }
            }
                     );   
                     
   //define blue color slider
      final JSlider blue = colorChooser.getBlueSlider();
      blue.addChangeListener(
            new ChangeListener()
            {
               public void stateChanged(ChangeEvent event)
               {
                  drawPanel.setBlue(blue.getValue());
               }
            }
                     );
   
   //create blue color text field
      final JTextField blueField = colorChooser.getBlueDisplay();
      redField.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent event)
               {
                  drawPanel.setBlue(Integer.parseInt(blueField.getText()));
               }
            }
                     );     
                     
      drawPanel = new DrawPanel5(new MyRectangle5(25, 25, 150, 150, false));
      drawPanel.addMouseListener(
            new MouseAdapter()
            {
               public void mousePressed(MouseEvent event)
               {
                  drawPanel.createShape(event.getX(), event.getY(), (String)choose.getSelectedItem());
               }
            }
                           );
                           
      drawPanel.addMouseMotionListener(
            new MouseMotionAdapter()
            {
               public void mouseDraged(MouseEvent event)
               {
                  drawPanel.resizeShape(event.getX(), event.getY());
               }
            }
                                 );
                                 
      shapePanel = new ShapePanel5();
      JCheckBox fill = shapePanel.getFill();
      fill.addItemListener(
            new ItemListener()
            {
               public void itemStateChanged(ItemEvent event)
               {
                  if(event.getStateChange() == ItemEvent.SELECTED)
                     drawPanel.setFill(true);
                  else
                     drawPanel.setFill(false);
               }
            }
                     );
   
      choose = shapePanel.getChooser();
      choose.addItemListener(
            new ItemListener()
            {
               public void itemStateChanged(ItemEvent event)
               {
                  drawPanel.setShape((String)choose.getSelectedItem());
               }
            }
                      );
                      
      Container container = getContentPane();
      container.add(colorChooser ,BorderLayout.SOUTH);
      container.add(drawPanel ,BorderLayout.CENTER);
      container.add(shapePanel ,BorderLayout.NORTH);
   
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic('f');
      JMenuItem exitItem = new JMenuItem("Exit");
      exitItem.setMnemonic('e');
      fileMenu.add(exitItem);
      menuBar.add(fileMenu);
      exitItem.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent event)
               {
                  System.exit(0);
               }
            }
                           );
                           
      setJMenuBar(menuBar);
      setSize(300, 300);
      setVisible(true);
   }

//create main method
   public static void main(String args[])
   {
      Pallet5 application = new Pallet5();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}

