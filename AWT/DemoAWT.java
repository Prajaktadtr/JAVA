/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Demonstrating GUI building using AWT components 
 package AWT;

import java.awt.*;
import AWT.*;
import java.awt.event.*;
/**
 *
 * @author Axiom Director
 */
public class DemoAWT extends Frame implements ActionListener
{

    // Declaration of AWT components 
    Label lb1;
    TextField tf1;
    Button bt1,bt2,bt3;
    
    public DemoAWT(String title)
    {
        super(title); // Sets a title to a frame 
        this.setLayout(null); // Sets Default LayoutManager to null
        this.setSize(800,800); // Sets a Size of AWT frame
        this.setBackground(Color.cyan); // sets Background Colour to cyan
        this.setVisible(true); // make the frame visible 
        Font f=new Font("arial",Font.BOLD,20);
        
        // Initialise AWT components 
        lb1=new Label("Wel Come to Axiom TechGuru Pvt. Ltd");
        lb1.setFont(f);
        lb1.setForeground(Color.red);
        lb1.setBounds(100,200, 450, 30);
        this.add(lb1);
        tf1=new TextField();
        tf1.setFont(f);
        tf1.setBounds(100,300,300,30);
        this.add(tf1);
        bt1=new Button("Click Me");
        bt1.setFont(f);
        bt1.setBounds(320,400,200,30);
        bt1.addActionListener(this);
        this.add(bt1);
        
        bt2=new Button("Exit");
        bt2.setFont(f);
        bt2.setBounds(550,400,200,30);
        bt2.addActionListener(this);
        this.add(bt2);
             
         bt3=new Button("Next");
        bt3.setFont(f);
        bt3.setBounds(100,400,200,30);
        bt3.addActionListener(this);
        this.add(bt3);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            String str=tf1.getText().toString();
            lb1.setText(str+" Hello! Wel Come ");
            
        }
        else if(ae.getSource()==bt2)
        {
            System.exit(1); // Terminate the application 
        }
        else if(ae.getSource()==bt3)
        {
          new SecondFrame("Second Frame");
        }

        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DemoAWT dm=new DemoAWT("Demo AWT");
    }
    
}
