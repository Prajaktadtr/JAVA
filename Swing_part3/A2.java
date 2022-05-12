/*2. Radio Button Consist actor names on the selection of sp. actor/actress name their image need
to be appear*/

package Swing_part3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class A2 extends JFrame implements ActionListener
{
    Container cp;
    JRadioButton rb1,rb2,rb3,rb4;
    JLabel jlb1,jlb2,jlb3,jlb4;

    public A2(String title)
    {
        super(title);
        cp=getContentPane();
        cp.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);

        ButtonGroup bg=new ButtonGroup();
        rb1=new JRadioButton("Mahesh Ghattamaneni");
        rb2=new JRadioButton("Ram Pothineni");
        rb3=new JRadioButton("Priti Zinta");
        rb4=new JRadioButton("Alia Bhatt");

        rb1.setBounds(100,200,200,30);
        rb2.setBounds(500,200,200,30);
        rb3.setBounds(100,400,200,30);
        rb4.setBounds(500,400,200,30);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);


        cp.add(rb1);cp.add(rb2);cp.add(rb3);cp.add(rb4);


    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rb1)
        {
            jlb1=new JLabel(new ImageIcon("Swing_part3/images/a.jpg"));
            jlb1.setBounds(100,500,300,400);
            cp.add(jlb1);
            cp.setBackground(Color.LIGHT_GRAY);
            JOptionPane.showMessageDialog(this,"You Clicked "+rb1.getText().toString());

        }
        else if(ae.getSource()==rb2)
        {
            jlb2=new JLabel(new ImageIcon("Swing_part3/images/b.jpg"));
            jlb2.setBounds(400,500,200,200);
            cp.add(jlb2);
            cp.setBackground(Color.red);
            JOptionPane.showMessageDialog(this,"You Clicked "+rb2.getText().toString());
        }
        else if(ae.getSource()==rb3)
        {
            jlb3=new JLabel(new ImageIcon("Swing_part3/images/c.jpg"));
            jlb3.setBounds(700,500,200,200);
            cp.add(jlb3);
            cp.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"You Clicked "+rb3.getText().toString());
        }
        else if(ae.getSource()==rb4)
        {
            jlb4=new JLabel(new ImageIcon("Swing_part3/images/d.jpg"));
            jlb4.setBounds(400,700,200,200);
            cp.add(jlb4);
            cp.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this,"You Clicked "+rb4.getText().toString());
        }
    }
    public static void main(String[] args)
    {
        new A2("RadioButton assignment");
    }
}