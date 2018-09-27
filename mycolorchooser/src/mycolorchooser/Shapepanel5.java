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

class ShapePanel5 extends JPanel
{
//one of the items will be used to draw shape
   private static final String[] shapeList = {"Rectangle",
                                            "Line",
                                            "Oval"};
   private JComboBox choose;
   private JCheckBox fill;

   public ShapePanel5()
   {
      choose = new JComboBox(shapeList);
      fill = new JCheckBox("Filled", false);
      add(choose);
      add(fill);
   }

   public JCheckBox getFill()
   {
      return fill;
   }

   public JComboBox getChooser()
   {
      return choose;
   }
}


