/* Construct at least couple of dynamic animation where text, image, drawing area will have a dynamic
movement from left to right, top to bottom.*/

import java.lang.*;
import java.awt.*;
import java.applet.*;
public class A1 extends Applet implements Runnable{

    Thread t;
    int x,y;//co-ordinates for scrolling text
    Image img1,img2;
    public void init()
    {
        img1=this.getImage(getCodeBase(),"C.jpg");
        img2=this.getImage(getCodeBase(),"D.jpg");
        x=100;
        y=100;
        t=new Thread(this);
        
        
        t.start();//gives call to run
    
    }
    public void paint(Graphics g)
    {
        this.setBackground(Color.CYAN);
        Font f=new Font("arial",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Siya",x,200);
        g.drawString("AXIOM",400,y);
        g.fillOval(x, 400,100, 100);
        g.setColor(Color.ORANGE);
        g.fillOval(400,y,100,100);
        g.setColor(Color.yellow);
        g.fillOval(x,200,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(200,y,100,100);
        g.drawImage(img1,100,y,200,250,this);
        g.drawImage(img2,x,500,200,250, this);
        // g.drawImage(img, 10, 100, 30, 150, 20, 100, 40, 300, this);
        // g.drawImage(img, 10, y, 100, 100, this);
        
    


    }
    public void run()
    {
        //implementing threading logic
        try{
            while(true)
            {
                    x+=50;
                    y+=50;
                    if(x>900)
                    x=100;
                    if(y>900)
                    y=100;
                    Thread.sleep(500);
                    repaint();//gives call to paint
            }
            
        }catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}