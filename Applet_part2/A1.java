//3. Draw a Identity card of your consist name, address, mobile no, email id and profile pic 


import java.applet.*;
import java.awt.*;

public class A1 extends Applet
{
    Image img;
    public void init()
    {
        img=this.getImage(getCodeBase(),"p.jpg");
    }
    public void paint(Graphics g)
    {
        this.setBackground(Color.GRAY);
        Font f=new Font("Algerian",Font.BOLD,20);
        g.setFont(f);
        // g.setColor(Color.PINK);
        // g.drawArc(50,200,300,300,0,360);
        // g.fillOval(130,270,40,40);
        // g.fillOval(250,270,40,40);
        // g.drawOval(178,340,40,40);
        g.drawString("PRAJAKTA",100,100);
        g.setColor(Color.white);
        g.fillRect(10, 10, 500, 200);
        g.drawImage(img, 20,50,this);
        g.setColor(Color.darkGray);
        g.drawString("Name: Prajakta Deotare",150,80);
        g.drawString("Address: Kejaji road,seloo",150,110);
        g.drawString("Contact no: 1111111111", 150, 140);
        g.drawString("email id :prajakta@gmail.com",150 , 170);
        g.setColor(Color.red);
        g.drawString("IDENTITY CARD",60,40);



    }
}