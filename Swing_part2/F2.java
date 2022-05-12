/*1. Create at least 4 frames, each consist different images and establish a navigation link among all the
frames so that user can easily able to navigate from one frame to another.*/

package Swing_part2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class F2 extends JFrame implements ActionListener
{
    JLabel jlb1;
    Container cp;
    JButton jbt1,jbt2,jbt3;

    public F2(String title)
    {
        super(title);
        this.setSize(1000, 1000);
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.PINK);
        Font f=new Font("arial",Font.BOLD,20);

        jlb1=new JLabel(new ImageIcon("Swing_part2/images/e.jpg"));
        
        jlb1.setBounds(100,100,300,300);
        cp.add(jlb1);

        jbt1=new JButton("Frame 2");
        jbt2=new JButton("Frame 1");
        jbt3=new JButton("Frame 4");

        jbt1.setFont(f);
        jbt2.setFont(f);
        jbt3.setFont(f);

        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);
        
        jbt1.setBounds(100,500,150,30);
        jbt2.setBounds(300,500,150,30);
        jbt3.setBounds(500,500,150,30);

        cp.add(jbt1);
        cp.add(jbt2);
        cp.add(jbt3);


        this.setVisible(true);










    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            new F1("Frame 2");
        }
        else if(ae.getSource()==jbt2)
        {
            new A1("Frame 1");
        }
        else if(ae.getSource()==jbt3)
        {
            new F3("Frame 4");
        }
    }
    public static void main(String[] args)
    {
        new F2("Frame 3");
    }
}