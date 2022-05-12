/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package demomouseevents;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Axiom Director
 */
public class ButtonEvents extends Applet implements ActionListener  {
    Label lb1; // promting msg
    Button bt1; // Event processor 
    public void init()
    {
        this.setLayout(null);
        this.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,20);
        lb1=new Label("Wel Come to Axiom TechGuru Pvt. Ltd");
        lb1.setFont(f);
        lb1.setBounds(100, 100, 450, 30);
        this.add(lb1);
        bt1=new Button("Click Me");
        bt1.setFont(f);
        bt1.addActionListener(this); // Listen the event of button
        bt1.setBounds(100, 300, 150, 30);
        this.add(bt1);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            lb1.setText("You Clicked a Button");
        }
        
    }
    
    
}
