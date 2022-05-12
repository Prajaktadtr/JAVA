//This applet displays a counter in its center. The counter begins at 0 and is incremented every second. The init() method initializes the counter and starts a thread.The run() method contains the body of the thread. It executes an infinite loop that calls the repaint() method,sleeps for one second, and increments the counter.The paint() method displays the current value of the counter as a string in the center of the applet.

import java.applet.*;
import java.awt.*;

public class Counter extends Applet implements Runnable
{
int counter;
Thread t;
public void init()
{
// initializing counter 
counter=0;
// start thread
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
// sleep before displaying next count 
Thread.sleep(1000);
//increment counter
++counter;
}
}
catch(InterruptedException e)
	{
	e.printStackTrace();
	}
}
public void paint(Graphics g){
//set font
g.setFont(new Font("serif",Font.BOLD,36));
//Get Font metrics
FontMetrics fm=g.getFontMetrics();
// Display counter
String str=" "+counter;
Dimension d=getSize();
int x=d.width/2-fm.stringWidth(str)/2;
g.drawString(str,x,d.height/2);
}
}
