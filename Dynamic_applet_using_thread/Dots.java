// This applet draws a dot at a random location in its display area every 200 milliseconds . Any dot that already exists are not erased.Therefore ,dot accumulate as the applet executes.
// The init() method starts a thread.The run() method contains the body of the thread.It executes an infinite loop that calls reapaint() method and then sleeps for 200 milliseconds .The paint() method selects a random location in the applet and displays a 2*2 solid rectangle at that posiiton.

import java.applet.*;
import java.awt.*;

public class Dots extends Applet implements Runnable {
Thread t;
public void init() {
// Start thread
t=new Thread(this);
t.start();
}
public void run()
{
try{
while(true)
{
// Request a repaint
repaint();
//Sleep before displaying next dot
Thread.sleep(200);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
public void update(Graphics g)
{
// pick a random point in the applet
Dimension d=getSize();
int x=(int) (Math.random()*d.width);
int y=(int)(Math.random()*d.height);
// Draw a dot at that location
g.fillRect(x,y,4,4);
}
}

