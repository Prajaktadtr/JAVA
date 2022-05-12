//my first applet demo
import java.lang.*;
import java.applet.*; //applet is abstract class
import java.awt.*;
public class MyDemoApplet extends Applet
{
    public void paint(Graphics g)
    {
        this.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,200);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Axiom TechGuru Pvt. Ltd.",100,100);
        g.drawLine(50,50,400,400);
        g.drawRect(50,50,400,300);
    }
}