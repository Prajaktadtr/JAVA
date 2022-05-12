/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Demonstrating RadioButton 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Axiom Director
 */
public class DemoRadioButton extends JFrame implements ActionListener{
    Container cp;
    JRadioButton rb1,rb2,rb3;
    JLabel jlb1,jlb2,jlb3;
   
public   DemoRadioButton(String title)
{
    super(title);
    cp=getContentPane();
    cp.setLayout(null);
    this.setSize(800, 800);
    this.setVisible(true);
   ButtonGroup bg=new ButtonGroup();
    rb1=new JRadioButton("Red");
    rb2=new JRadioButton("Green");
    rb3=new JRadioButton("Blue");
    rb1.setBounds(100,200,200,30);
    rb2.setBounds(350,200,200,30);
    rb3.setBounds(550,200,200,30);
    rb1.addActionListener(this);
    rb2.addActionListener(this);
    rb3.addActionListener(this);
    bg.add(rb1);bg.add(rb2);bg.add(rb3);
    cp.add(rb1);cp.add(rb2);cp.add(rb3);
    
    // this.pack();
}
 
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==rb1)
    {
       // new DemoRadioButton("Demo RadioButton");
       jlb1=new JLabel(new ImageIcon("images//b.jpg"));
      jlb1.setBounds(200,500,300,300);
     cp.add(jlb1);
          cp.setBackground(Color.red);
         JOptionPane.showMessageDialog(this,"You Clicked "+rb1.getText().toString() );
        // JOptionPane("You Clicked red", this);
      
        
    }
    else if(ae.getSource()==rb2)
    {
       //  new DemoRadioButton("Demo RadioButton");
          jlb2=new JLabel(new ImageIcon("images//a.jpg"));
   jlb2.setBounds(200,500,300,300);
    cp.add(jlb2);
        cp.setBackground(Color.green);
          JOptionPane.showMessageDialog(this,"You Clicked "+rb2.getText().toString() );
    }
    else if(ae.getSource()==rb3)
    {
      //   new DemoRadioButton("Demo RadioButton");
          jlb3=new JLabel(new ImageIcon("images//c.jpg"));
    jlb3.setBounds(200,500,300,300);
    cp.add(jlb3);
        cp.setBackground(Color.blue);
         JOptionPane.showMessageDialog(this,"You Clicked "+rb3.getText().toString() );
    }
}

public static void main(String [] args)
{
    new DemoRadioButton("Demo RadioButton");
}


}
