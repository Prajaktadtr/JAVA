/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package demomouseevents;

import java.applet.*;
import java.awt.*; // GUI components 
import java.awt.event.*; // Event Processor Library


/**
 *
 * @author Axiom Director
 */
public class DemoMouseEvents extends Applet implements MouseListener{

    /**
     * @param args the command line arguments
     */
    public void init()
    {
       addMouseListener(this); // Event Listener
       this.setBackground(Color.red);
              
    }
    
    
    public void paint(Graphics g)
    {
        // Applet logic to paint 
        //Font f=new Font("arial",Font.BOLD,20);
        //g.setFont(f);
        //g.setColor(Color.white);
        // g.drawString("Axiom TechGuru Pvt. Ltd.", 300, 300);
    }
    
    public void mouseEntered(MouseEvent me)
    {
        // Processor of Mouser EnteredEvent
        // repaint();
        this.setBackground(Color.cyan);
        
           
    }
     public void mouseExited(MouseEvent me)
    {
        // Processor of Mouser EnteredEvent
         this.setBackground(Color.yellow);
    }
      public void mousePressed(MouseEvent me)
    {
        // Processor of Mouser EnteredEvent
         this.setBackground(Color.blue);
    }
       public void mouseReleased(MouseEvent me)
    {
        // Processor of Mouser EnteredEvent
         this.setBackground(Color.green);
    }
        public void mouseClicked(MouseEvent me)
    {
        // Processor of Mouser EnteredEvent
         this.setBackground(Color.black);
    }
    
}
