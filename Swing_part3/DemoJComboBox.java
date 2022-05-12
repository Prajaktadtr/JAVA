/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Demonstrating JComboBox 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Axiom Director
 */
public class DemoJComboBox extends JFrame implements ActionListener{
    
    JComboBox jcb;
    Container cp;
    
    public DemoJComboBox(String title)
    {
        super(title);
        
        cp=getContentPane();
        cp.setLayout(null);
       this.setSize(1200, 1200);
        cp.setBackground(Color.cyan);
     
        Font f=new Font("arial",Font.BOLD,20);
        
        jcb=new JComboBox();
        jcb.setFont(f);
        jcb.setForeground(Color.red);
        jcb.addItem("Select Any City");
        jcb.addItem("Nagpur");
        jcb.addItem("Pune");
        jcb.addItem("Mumbai");
        jcb.addItem("Delhi");
        jcb.addActionListener(this);
        jcb.setBounds(100,200,400,30);
        cp.add(jcb);
        
          this.setVisible(true);
               // this.pack();
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jcb)
        {
            String str=jcb.getSelectedItem().toString();
            JOptionPane.showMessageDialog(this, "You Selected "+str);
        
        }
    }
    public static void main(String [] args)
    {
        new DemoJComboBox("Demo JComboBox");
    }
}
