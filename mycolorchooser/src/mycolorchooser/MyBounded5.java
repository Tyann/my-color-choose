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

abstract class MyBounded5 extends MyShape5
{
   private boolean filled;

   public MyBounded5()
   {
      super();
      setFilled(false);
   }

   public MyBounded5(int x1, int y1, int x2, int y2, boolean f)
   {
      super(x1, y1, x2, y2);
      setFilled(f);
   }

   public MyBounded5(int x1, int y1, int x2, int y2, Color c, boolean f)
   {
      super.setAll(x1, y1, x2, y2, c);
      setFilled(f);
   }

   public void setFilled(boolean f)
   {
      filled = f;
   }

   public boolean getFilled()
   {
      return filled;
   }

   public int getUpperLeftX()
   {
      return Math.min(getX1(), getX2());
   }

   public int getUpperLeftY()
   {
      return Math.min(getY1(), getY2());
   }

   public int getWidth()
   {
      return Math.abs(getX1() - getX2());
   }

   public int getHeight()
   {
      return Math.abs(getY1() - getY2());
   }
}



