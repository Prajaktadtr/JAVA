//1. Create an Applet to design a smiley on the browser and print your name with suitable font.
import java.applet.*;
import java.awt.*;

public class A1 extends Applet
{
    public void paint(Graphics g)
    {
    this.setBackground(Color.yellow);
    Font f=new Font("Arial",Font.BOLD,51);
    g.setFont(f);
    g.setColor(Color.PINK);
    g.drawArc(50,200,300,300,0,360);
    g.fillOval(130,270,40,40);
    g.fillOval(250,270,40,40);
    g.drawOval(178,340,40,40);
    // g.drawArc(180, 420, 80,20, 30, -210);
    g.fillArc(160,400,100,50,0,-180);
    // g.fillArc(x, y, width, height, startAngle, arcAngle);
    g.setColor(Color.red);
    g.drawString("PRAJAKTA",50,100);
}

}