/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapplet;
import java.applet.*;
import java.awt.*;

// Life Cycle of an Applet 
/**
 *
 * @author Axiom Director
 */
public class DemoApplet extends Applet{

    String str="";
    /**
     * @param args the command line arguments
     */
   public void init()
   {
       str+=" Applet Initialised ";
   }
   public void start()
   {
       str+=" Applet Started";
   }
   public void stop()
   {
       str+=" Applet Stop";
   }
   public void destroy()
   {
       str+=" Applet Destroyed";
   }
   
     
    
    public void paint(Graphics g)
   {
       this.setBackground(Color.cyan);
       g.drawString(str,100,100);
       
   }
    
}

