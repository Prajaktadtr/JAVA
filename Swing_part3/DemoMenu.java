/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Menu Creation in Swing 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Axiom Director
 */
public class DemoMenu extends JFrame implements ActionListener{
    JMenuBar jmb;
    JMenu jm1,jm2,jm3;
    JMenuItem jmi1,jmi2,jmi3;
    
    Container cp;
    public DemoMenu(String title)
    {
        super(title);
        this.setSize(800, 800);
        
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.cyan);
        
        jmb=new JMenuBar();
        jmb.setBounds(100, 200, 400, 50);
        cp.add(jmb);
        jm1=new JMenu("Admin");
        jm2=new JMenu("User");
        jm3=new JMenu("Cleark");
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmi1=new JMenuItem("Admin Login");
         jmi2=new JMenuItem("User Login");
          jmi3=new JMenuItem("Cleark Login");
          jmi1.addActionListener(this);
          jmi2.addActionListener(this);
          jmi3.addActionListener(this);
          
          jm1.add(jmi1);
          jm2.add(jmi2);
          jm3.add(jmi3);
        
        
        
        
    
    
    this.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jmi1)
        {
            JOptionPane.showMessageDialog(this, "You Clicked"+jmi1.getText().toString());
        }
        else if(ae.getSource()==jmi2)
        {
            JOptionPane.showMessageDialog(this, "You Clicked"+jmi2.getText().toString());
        }
        else if(ae.getSource()==jmi3)
        {
            JOptionPane.showMessageDialog(this, "You Clicked"+jmi3.getText().toString());
        }
        
    }
    
    public static void main(String [] args)
    {
        new DemoMenu("Demonstrating Menus ");
    }
    
}

