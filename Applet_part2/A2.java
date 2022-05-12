//4. Generate a circle filled with color to have your image in the center with your name.
import java.applet.*;
import java.awt.*;

public class A2 extends Applet
{
    Image img;
    public void init()
    {
        img=this.getImage(getCodeBase(),"p.jpg");
    
    }
    public void paint(Graphics g)
    {
        this.setBackground(Color.yellow);
        Font f=new Font("Arial",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.white);
        g.fillArc(250, 200,400,400,0,360);
        // g.fillArc(x, y, width, height, startAngle, arcAngle);
        g.drawImage(img,400,300,this);
        g.setColor(Color.RED);
        g.drawString("PRAJAKTA",400,500);
    }
}