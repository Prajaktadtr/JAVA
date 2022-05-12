// This example shows a solid circle that moves from left to right across the applet display area. The flicker should be noticeable

import java.applet.*;
import java.awt.*;
public class NoDoubleBuffer extends Applet implements Runnable
{
int x=0;
Thread t;
public void init()
{
// start thread
t=new Thread(this);
t.start();
}
public void run(){
try{
while(true)
{
// Request a repaint
repaint();
// sleep before update
Thread.sleep(100);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
public void paint(Graphics g)
{
// Draw filled circle
Dimension d=getSize();
g.fillOval(x,d.height/4,50,50);
//increment x
x+=5;
if(x+50>d.width)
x=0;
}
}


