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

class MyRectangle5 extends MyBounded5
{
   public MyRectangle5()
   {
      super();
   }

   public MyRectangle5(int x1, int y1, int x2, int y2, boolean f)
   {
      super(x1, y1, x2, y2, f);
   }

   public MyRectangle5(int x1, int y1, int x2, int y2, Color c, boolean f)
   {
      super(x1, y1, x2, y2, c, f);
   }

   public void draw(Graphics g)
   {
      Color c = g.getColor();
      g.setColor(this.getColor());
      if(getFilled())
         g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      else
         g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      g.setColor(c);
   }

   public String toString()
   {
      return "Rectangle";
   }
}

