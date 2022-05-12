//3. Draw 3 filled circles of different color and in every circle Axiom need to printed in the circle.


import java.applet.*;
import java.awt.*;

public class A3 extends Applet{
    public void paint(Graphics g)
    {
        this.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,50);
        g.setFont(f);
        g.setColor(Color.yellow);
        // g.fillArc("AXIOM",225,315);
        g.fillArc(100,100,400,400,0,360);

        g.setColor(Color.GREEN);
        g.drawString("AXIOM",225,315);
       
        g.setColor(Color.RED);
        g.fillArc(510,100,400,400,0,360);

        g.setColor(Color.ORANGE);
        g.drawString("AXIOM",625,315);

        g.setColor(Color.pink);
        g.fillArc(910,100,400,400,0,360);

        g.setColor(Color.red);
        g.drawString("AXIOM", 1025, 315);

    }
}