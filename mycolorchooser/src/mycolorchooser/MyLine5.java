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

class MyLine5 extends MyShape5
{
   public MyLine5()
   {
      super();
   }

   public MyLine5(int x1, int y1, int x2, int y2)
   {
      super(x1, y1, x2, y2);
   }

   public MyLine5(int x1, int y1, int x2, int y2, Color c)
   {
      super(x1, y1, x2, y2, c);
   }

   public void draw(Graphics g)
   {
   //get previous color
      Color c = g.getColor();
      g.setColor(this.getColor());
      g.drawLine(getX1(), getY1(), getX2(), getY2());
   //reset previous color
      g.setColor(c);
   }

   public String toString()
   {
      return "Line";
   }
}

