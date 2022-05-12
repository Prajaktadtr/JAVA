/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Dealing with images 



package Swing_part2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import Swing_part2.*;
// import Swing_part2.images.*;

//import Swing_part2.MyFrame2;

/**
 *
 * @author Axiom Director
 */
public class DemoSwing2 extends JFrame  implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JLabel jlb1,jlb2;
    Container cp;
    JButton jbt1; // navigating to another frame 
    
    // Define Constructor
    public DemoSwing2(String title)
    {
        super(title);
        this.setSize(1200, 1000); // Sets a Size of a Frame 
        cp=getContentPane();
        cp.setLayout(null); // nullify the layout
        cp.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,20);
        // initialise Lable
        jlb1=new JLabel(new ImageIcon("Swing_part2/images/c.jpg"));
        jlb2=new JLabel(new ImageIcon("Swing_part2/images/d.jpg"));
        // set Bounds of it
        jlb1.setBounds(50, 50, 300, 300);
        jlb2.setBounds(50, 400, 400, 400);
        
        jbt1=new JButton("Next");
        jbt1.setFont(f);
        jbt1.addActionListener(this);
        jbt1.setBounds(100, 900, 150, 30);
        
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jbt1);
        
        
        this.setVisible(true); // makes the frame visible 
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            new MyFrame2("My Frame2");
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new DemoSwing2("Demo Swing-2");
    }
    
}
