//2. Process all the keyboard events to perform the same mentioned above
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class A2 extends Applet implements KeyListener
{

    public void init()
    {
        addKeyListener(this);
        requestFocus();
        setBackground(Color.cyan);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        setBackground(Color.ORANGE);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        setBackground(Color.yellow);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        setBackground(Color.red);
        // TODO Auto-generated method stub
        
    }

}