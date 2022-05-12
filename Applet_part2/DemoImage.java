/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axiom Director
 */
// Demonstrating Image on Applet 
import java.applet.*;
import java.awt.*;


public class DemoImage extends Applet  {
    Image img;
    public void init()
    {
        img=this.getImage(getCodeBase(),"a.jpeg");
    }
    
    public void paint(Graphics g)
    {
    
        g.drawImage(img, 100,100, 200,200,this);
    }
}
