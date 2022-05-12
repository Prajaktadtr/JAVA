/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package AWT;
import java.awt.*;
import AWT.*;
import java.awt.event.*;

// import demoawt.DemoAWT;

/**
 *
 * @author Axiom Director
 */
public class SecondFrame extends Frame implements ActionListener{
    Label lb1;
    Button bt1,bt2;
    
    public SecondFrame(String title)
    {
        super(title); 
        this.setLayout(null);
        this.setSize(800, 800);
        this.setBackground(Color.cyan);
        this.setVisible(true);
        Font f=new Font("arial",Font.BOLD,20);
        lb1=new Label("This is Second Frame ");
        lb1.setFont(f);
        lb1.setForeground(Color.red);
        lb1.setBounds(100, 200, 350, 30);
        this.add(lb1);
        
        bt1=new Button("Previous");
        bt1.setFont(f);
        bt1.setBounds(100,300,200,30);
        bt1.addActionListener(this);
        this.add(bt1);
        
        bt2=new Button("Exit");
        bt2.setFont(f);
        bt2.setBounds(350,300,200,30);
        bt2.addActionListener(this);
        this.add(bt2);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            new DemoAWT("First Frame");
        }
        else if(ae.getSource()==bt2)
        {
            System.exit(1); // Terminate an Appln
        }
    }
    
    
    
    
}
