
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// This is second Frame 

package Swing_part2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import Swing_part2.DemoSwing2;

/**
 *
 * @author Axiom Director
 */
 public class MyFrame2 extends JFrame implements ActionListener{
    // Declaration of components 
    JLabel jlb1;
    JButton jbt1;
    Container cp;
    
    // Define Constructor 
    public  MyFrame2(String title)
    {
        super(title);
        this.setSize(1200,1200);
        cp=getContentPane();
        cp.setLayout(null);
        Color c1=new Color(250,250,150);
        cp.setBackground(c1);
        Font f=new Font("arial",Font.BOLD,20);
        
        jlb1=new JLabel(new ImageIcon("Swing_part2/images/e.jpg"));
        jbt1=new JButton("Prev");
        jbt1.setFont(f);
        jlb1.setBounds(100,100,400,400);
        jbt1.setBounds(400,500,150,30);
        jbt1.addActionListener(this);
        cp.add(jlb1);
        cp.add(jbt1);
        
        
        this.setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            new DemoSwing2("Demo Swing-2");
        }
        
    }
    
    public static void main(String [] args)
    {
        MyFrame2 mf2=new MyFrame2("My Frame2");
    }
    
}
