/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package dynamicapplet;
import java.lang.*;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author Axiom Director
 */
public class DynamicApplet extends Applet implements Runnable {

    /**
     * @param args the command line arguments
     */
    Thread t;
    int x,y; // cordinates for scrolling text
        
    public void init()
    {
        x=100;
        y=100;
        t=new Thread(this);
        t.start(); // Gives a call to run
    }
    public void paint(Graphics g)
    {
        ;this.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Axiom", x, 200);
        g.drawString("TechGuru", 400, y);
        g.fillOval(x, 400, 100,100);
        g.setColor(Color.ORANGE);
         g.fillOval(200,y, 100,100);
        
        
    }
    
    public void run()
    {
        // Implementing Threading Logic 
        try
        {
            while(true)
            {
            x+=50;
            y+=50;
            
            if(x>600)
                x=100;
            if(y>600)
                y=100;
            
            Thread.sleep(500);
            repaint(); // gives a call to paint() again
            }
        }
        catch(InterruptedException irp)
        {
            irp.printStackTrace();
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
        
        
        
    }

   
}
