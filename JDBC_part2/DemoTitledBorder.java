//package JDBC_part2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package swingdemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
/**
 *
 * @author Axiom Director
 */
public class DemoTitledBorder extends JFrame{
    
    JLabel jlb1,jlb2,jlb3;
    JButton jbt1;
    Container cp;
    String cdate="System Date :";
    
    Calendar cc;
    public DemoTitledBorder(String Title)
    {
        // Setting properties of a Frame 
        super(Title);
        this.setSize(1200,800);
        cp=getContentPane();
        cp.setLayout(null);
        Color c=new Color(251,200,210);
        cp.setBackground(c);
        
        LineBorder lb=new LineBorder(Color.red,2);
       TitledBorder tb=new TitledBorder(lb,"Login Window");
       
       BevelBorder bb=new BevelBorder(BevelBorder.RAISED ,Color.white,Color.black);
       jlb1=new JLabel();
       jlb1.setBorder(tb);
       jlb1.setBounds(200, 100,800, 500);
       cp.add(jlb1);
       Font f=new Font("arial",Font.BOLD,20);
       jbt1=new JButton("SUBMIT");
       jbt1.setFont(f);
       jbt1.setForeground(Color.red);
       jbt1.setBounds(500, 300,200, 30);
       jbt1.setBorder(bb);
       cp.add(jbt1);
    
       cc=Calendar.getInstance();
       cdate+=" "+new String(""+cc.get(cc.DAY_OF_MONTH)+"-"+cc.get(cc.MONTH)+"-"+cc.get(cc.YEAR) );
       jlb2=new JLabel(cdate);
       jlb2.setFont(f);
       jlb2.setForeground(Color.red);
       jlb2.setBounds(600, 200,400, 30);
       
       cp.add(jlb2);
       
       this.show();
        
        
        
        
    }
    
    public static void main(String [] args)
    {
        DemoTitledBorder dtb=new DemoTitledBorder("Demo Title");
    }
    
}
