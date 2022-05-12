/* Construct a ball which will appear at random dynamic x,y....(use Math.radom()) method to generate
dynamic x,y refer the codes given with the session*/

import java.applet.*;
import java.awt.*;

public class A2 extends Applet implements Runnable{

    Thread t;
    public void init()
    {
        //start thread
        t=new Thread(this);
        t.start();

    }
    public void run()
    {
        try{
            while(true)
            {
                //request a repaint
                repaint();
                //sleep before displaying next ball
                Thread.sleep(200);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void update(Graphics g)
    {
        Dimension d=getSize();
        int x=(int)(Math.random()*d.width);
        int y=(int)(Math.random()*d.height);
        //draw a ball at that location
        //  g.setBackground(Color.yellow);
        g.setColor(Color.red);
         g.fillOval(x,20,50,50);
        g.setColor((Color.GREEN));
        g.fillOval(x,y,50,50);
        g.setColor(Color.yellow);
        g.fillOval(x,y,50,50);
        // g.setColor(Color.PINK);
        // g.fillOval(x,y,50,50);
    }
}
