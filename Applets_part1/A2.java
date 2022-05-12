/*2. Create a Filled Rectangle inside of it consist a filled circle to have your name in center.
Select suitable font, color*/

import java.applet.*;
import java.awt.*;

public class  A2 extends Applet
{
    public void paint(Graphics g)
    {
        this.setBackground(Color.white);
        Font f=new Font("arial",Font.BOLD,35);
        g.setFont(f);
        g.setColor(Color.gray);
        g.fillRect(100,100,700,700);
        g.setColor(Color.yellow);
        g.fillArc(250, 200, 400,400, 0, 360);
        g.setColor(Color.MAGENTA);
        g.drawString("PRAJAKTA",300,410);
    }
}