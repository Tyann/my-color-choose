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

class DrawPanel5 extends JPanel
{
   private MyShape5 shape;
   private boolean fill;
   private int red;
   private int green;
   private int blue;

   public DrawPanel5(MyShape5 s)
   {
      shape = s;
   }

   public DrawPanel5()
   {
      shape = null;
   }

//draw colored rectangle
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
   
      if(shape != null)
         shape.draw(g);
   }

//handle mouse click event
   public void createShape(int x, int y, String type)
   {
      Color color = new Color(red, green, blue);
   
      if(type.equals("Rectangle"))
         shape = new MyRectangle5(x, y, x, y, color, fill);
      else if(type.equals("Line"))
         shape = new MyLine5(x, y, x, y, color);
      else
         shape = new MyOval5(x, y, x, y, color, fill);
   
      repaint();
   }

//handle mouse movement
   public void resizeShape(int x, int y)
   {
   //change x2 and y2 values
      shape.setX2(x);
      shape.setY2(y);
   
      repaint();
   }

//set fill property of shape
   public void setFill(boolean f)
   {
      fill = f;
   
   //only bounded shapes have fill variable
      if(shape instanceof MyBounded5)
         ((MyBounded5)shape).setFilled(f);
   
      repaint();
   }

//determines which shape is to be drawn
   public void setShape(String type)
   {
   //get information from last shape
      int x1 = shape.getX1();
      int y1 = shape.getY1();
      int x2 = shape.getX2();
      int y2 = shape.getY2();
   
      Color color = new Color(red, green, blue);
   
      if(type.equals("Rectangle"))
         shape = new MyRectangle5(x1, y1, x2, y2, color, fill);
      else if(type.equals("Line"))
         shape = new MyLine5(x1, y1, x2, y2, color);
      else
         shape = new MyOval5(x1, y1, x2, y2, color, fill);
   
      repaint();
   }

//set red
   public void setRed(int r)
   {
      red = r;
      shape.setColor(new Color(red, green, blue));
      repaint();
   }

//set green
   public void setGreen(int g)
   {
      green = g;
      shape.setColor(new Color(red, green, blue));
      repaint();
   }

//set blue
   public void setBlue(int b)
   {
      blue = b;
      shape.setColor(new Color(red, green, blue));
      repaint();
   }
}

