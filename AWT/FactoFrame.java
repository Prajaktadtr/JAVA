/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package demoawt;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Axiom Director
 */
public class FactoFrame extends Frame implements ActionListener{
    Label lb1,lb2;
    TextField tf1,tf2;
    Button bt1,bt2,bt3;
    
    public FactoFrame(String title)
    {
        super(title);
        this.setLayout(null);
        this.setSize(900,800);
        this.setBackground(Color.cyan);
        this.setVisible(true);
        Font f=new Font("arial",Font.BOLD,20); 
        
        lb1=new Label("Enter a No :");
        lb1.setFont(f);
        lb1.setForeground(Color.red);
        lb1.setBounds(100,200,300,30);
        this.add(lb1);
        tf1=new TextField();
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBounds(450,200,150,30);
        this.add(tf1);
        lb2=new Label("Result");
        lb2.setFont(f);
        lb2.setForeground(Color.red);
        lb2.setBounds(100,300,300,30);
        this.add(lb2);
        tf2=new TextField();
        tf2.setFont(f);
        tf2.setForeground(Color.red);
        tf2.setBounds(450,300,150,30);
        this.add(tf2);
        bt1=new Button("Facto");
        bt2=new Button("Refresh");
        bt3=new Button("Exit");
        bt1.setFont(f);
        bt2.setFont(f);
        bt3.setFont(f);
        bt1.setBounds(100,400,200,30);
        bt2.setBounds(350,400,200,30);
        bt3.setBounds(600,400, 200,30);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            int n=Integer.parseInt(tf1.getText().toString());
            int f=1;
            while(n>0)
            {
                f*=n;
                n--;
            }
            tf2.setText(f+"");
            
        }
        else if(ae.getSource()==bt2)
        {
            tf1.setText("");
            tf2.setText(null);
        }
        else if(ae.getSource()==bt3)
        {
            System.exit(1);
        }
        
        
        
        
    }
    
    
    public static void main(String [] args)
    {
        new FactoFrame("Facto Frame");
    }
    
    
}
