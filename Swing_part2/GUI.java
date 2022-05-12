/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Create a GUI to read a No to find factorial 


 package java1.Swing_part2;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import mypk.Facto;
import java1.mypk.Facto;
/**
 *
 * @author Axiom Director
 */
public class GUI extends JFrame implements ActionListener {
    // Declaration of components 
    JLabel jlb1,jlb2,jlb3;
    JTextField jtf1,jtf2;
    JButton jbt1,jbt2;
    Container cp;
    public GUI(String title)
    {
        this.setSize(1200,1000);
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.cyan);
        
        Font f=new Font("arial",Font.BOLD,20);
        jlb1=new JLabel("Factorial ");
        jlb2=new JLabel("Enter a No");
        jlb3=new JLabel("Result");
        jtf1=new JTextField();
        jtf2=new JTextField();
        jbt1=new JButton("Facto");
        jbt2=new JButton("Refresh");
        jlb1.setFont(f);jlb2.setFont(f);jlb3.setFont(f);jtf1.setFont(f);jtf2.setFont(f);
        jbt1.setFont(f);jbt2.setFont(f);
        
        jlb1.setBounds(400,100,250,30);
        jlb2.setBounds(200,200,250,30);
        jtf1.setBounds(500,200,250,30);
        jlb3.setBounds(200,300,250,30);
        jtf2.setBounds(500,300,250,30);
        jbt1.setBounds(400,400,200,30);
        jbt2.setBounds(650,400,200,30);
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        cp.add(jlb1);cp.add(jlb2);cp.add(jlb3);cp.add(jtf1);cp.add(jtf2);cp.add(jbt1);cp.add(jbt2);
   this.setVisible(true);
   
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            int n=Integer.parseInt(jtf1.getText().toString());
            
            int f=Facto.findFacto(n); // call to find_Facto()
            
            jtf2.setText(f+"");
            
        }
        else if(ae.getSource()==jbt2)
        {
            jtf1.setText(null);
            jtf2.setText(null);
        }
    }
        
       
    public static void main(String [] args)
    {
        new GUI("Factorial");
        
    }
}