
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Constructing First Swing Based Front End Application 
// Read any Two Nos and Perform all possible Arithmetics with them 

// package demoswing;

import java.awt.*; // AWT Components
import java.awt.event.*; // Event Handeling 
import javax.swing.*; // SWING library
/**
 *
 * @author Axiom Director
 */
public class DemoSWing extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    // Declare GUI components 
    JLabel jlb1,jlb2,jlb3,jlb4;
    JTextField jtf1,jtf2,jtf3;
    JButton jbt1,jbt2,jbt3,jbt4,jbt5;
    Container cp;
    // Define Constructor 
    public DemoSWing(String title)
    {
        // initialise Frame properties 
        super(title); // Sets a Title of frame
        this.setSize(1200, 800); // Sets a Size of a JFrame 
        cp=getContentPane();
        cp.setLayout(null); // nullify the default layout - flow
        cp.setBackground(Color.cyan); // sets a Background color to cyan
        Font f=new Font("arial",Font.BOLD,20);

        // Initialise GUI Components 
        // initialise labels
         jlb1=new JLabel("Arithmetic Application");
         jlb2=new JLabel("Enter First No");
         jlb3=new JLabel("Enter Second No");
         jlb4=new JLabel("Result");
       
         // initialise TextField
         jtf1=new JTextField();
         jtf2=new JTextField();
         jtf3=new JTextField();
         // Initialise Buttons 
         jbt1=new JButton("Add");
         jbt2=new JButton("Sub");
         jbt3=new JButton("Mul");
         jbt4=new JButton("Div");
         jbt5=new JButton("Refresh");
         // Set font of all components 
         jlb1.setFont(f);jlb2.setFont(f);jlb3.setFont(f);jlb4.setFont(f);
         jtf1.setFont(f);jtf2.setFont(f);jtf3.setFont(f);
         jbt1.setFont(f);jbt2.setFont(f);jbt3.setFont(f);jbt4.setFont(f);jbt5.setFont(f);
         // Set a foreground Color
         jlb1.setForeground(Color.red);jlb2.setForeground(Color.red);
         jlb3.setForeground(Color.red);jlb4.setForeground(Color.red);
         jtf1.setForeground(Color.red);jtf2.setForeground(Color.red);jtf3.setForeground(Color.red);
         jbt1.setForeground(Color.red);jbt2.setForeground(Color.red);jbt3.setForeground(Color.red);
         jbt4.setForeground(Color.red);jbt5.setForeground(Color.red);
         // Sets Bounds of componets 
         jlb1.setBounds(400, 100, 250, 30);
         jlb2.setBounds(200, 150, 250, 30);jtf1.setBounds(500,150, 150,30);
         jlb3.setBounds(200, 200, 250, 30);jtf2.setBounds(500,200, 150,30);
         jlb4.setBounds(200, 250, 250, 30);jtf3.setBounds(500,250, 150,30);
         jbt1.setBounds(200, 300, 150, 30);jbt2.setBounds(400, 300, 150, 30);
         jbt3.setBounds(600, 300, 150, 30);jbt4.setBounds(800, 300, 150, 30);
         jbt5.setBounds(1000, 300, 150, 30);
        cp.add(jlb1);cp.add(jlb2);cp.add(jlb3);cp.add(jlb4);
        cp.add(jtf1);cp.add(jtf2);cp.add(jtf3);
        jbt1.addActionListener(this);jbt2.addActionListener(this);
        jbt3.addActionListener(this);jbt4.addActionListener(this);
        jbt5.addActionListener(this);
        
        
        cp.add(jbt1);cp.add(jbt2);cp.add(jbt3);cp.add(jbt4);cp.add(jbt5);
        
      
        
        this.setVisible(true); // makes a frame visible 
    }
    
    // Process Button Events 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            int a=Integer.parseInt(jtf1.getText().toString());
            int b=Integer.parseInt(jtf2.getText().toString());
            int c=a+b;
            jtf3.setText(c+"");
        }
        else if(ae.getSource()==jbt2)
        {
            int a=Integer.parseInt(jtf1.getText().toString());
            int b=Integer.parseInt(jtf2.getText().toString());
            int c=a-b;
            jtf3.setText(c+"");
        }
        else if(ae.getSource()==jbt3)
        {
            int a=Integer.parseInt(jtf1.getText().toString());
            int b=Integer.parseInt(jtf2.getText().toString());
            int c=a*b;
            jtf3.setText(c+"");
        }
        else if(ae.getSource()==jbt4)
        {
            int a=Integer.parseInt(jtf1.getText().toString());
            int b=Integer.parseInt(jtf2.getText().toString());
            int c=a/b;
            jtf3.setText(c+"");
        }
        else if(ae.getSource()==jbt5)
        {
            jtf1.setText(null);jtf2.setText(null);jtf3.setText(null);
            
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new DemoSWing("Demo Swing");
    }
    
}
