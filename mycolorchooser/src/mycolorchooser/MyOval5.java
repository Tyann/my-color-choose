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

class MyOval5 extends MyBounded5
{
   public MyOval5()
   {
      super();
   }

   public MyOval5(int x1, int y1, int x2, int y2, boolean f)
   {
      super(x1, y1, x2, y2, f);
   }

   public MyOval5(int x1, int y1, int x2, int y2, Color c, boolean f)
   {
      super(x1, y1, x2, y2, c, f);
   }

   public void draw(Graphics g)
   {
      Color c = g.getColor();
      g.setColor(this.getColor());
      if(getFilled())
         g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      else
         g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      g.setColor(c);
   }

   public String toString()
   {
      return "Oval";
   }
}

