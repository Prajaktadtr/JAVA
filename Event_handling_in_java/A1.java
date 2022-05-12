/*1. Create an Applet which will change its background color as per mouse event triggered and prompt the
user regarding the Event.
Means if user triggered moseEntered event then background color will be blue and it print msg "Mouse
Entered Event is triggered"*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// import javax.swing.event.MouseInputListener;

// import org.w3c.dom.events.MouseEvent;

// public class A1 extends Applet implements MouseListener
public class A1 extends Applet implements MouseListener
{
    public void init()
    {
        addMouseListener(this);//event Listener
        this.setBackground(Color.cyan);
    }
    public void paint(Graphics g)
    {
        //comment
    }
    public void mouseEntered(MouseEvent me)
    {
        this.setBackground(Color.red);
    }
    public void mousePressed(MouseEvent me)
    {
        this.setBackground(Color.yellow);
    }
    public void mouseReleased(MouseEvent me)
    {
        this.setBackground(Color.PINK);
    }
    public void mouseClicked(MouseEvent me)
    {
        this.setBackground(Color.GREEN);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
