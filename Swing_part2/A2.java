/*2. Create a GUI (presentation layer) and separate application layer and perform the following
 * Read a No to print reverse and find digital sum
 */
 package java1.Swing_part2;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java1.mypk.Dsum;
 import java1.mypk.Rev;

 public class A2 extends JFrame implements ActionListener
 {
     JLabel jlb1,jlb2;
     JTextField jtf1,jtf2;
     JButton jbt1,jbt2,jbt3;
     Container cp;
     public A2(String title)
     {
         super(title);
        this.setSize(1000,1000);
        // cp=getContentpane();
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.cyan);

        Font f=new Font("arial",Font.BOLD,40);
        jlb1=new JLabel("Enter Number");
        jlb2=new JLabel("Result");

        jtf1=new JTextField();
        jtf2=new JTextField();
        
        jbt1=new JButton("Reverse");
        jbt2=new JButton("Digi sum");
        jbt3=new JButton("Refreash");

        jlb1.setBounds(100,100,250,50);
        jlb2.setBounds(100,300,250,50);

        jtf1.setBounds(500,100,250,50);
        jtf2.setBounds(500,300,250,50);

        jbt1.setBounds(400,400,200,30);
        jbt2.setBounds(650,400,200,30);
        jbt3.setBounds(400,600,200,30);

        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);
        
        cp.add(jlb1);
        cp.add(jlb2);
        
        cp.add(jtf1);
        cp.add(jtf2);

        cp.add(jbt1);
        cp.add(jbt2);
        cp.add(jbt3);


        this.setVisible(true);


     }

     public void actionPerformed(ActionEvent  ae)
     {
         if(ae.getSource()==jbt1)
         {
             int n=Integer.parseInt(jtf1.getText().toString());
              int f=Rev.rev(n);//call  to find reverse
              jtf2.setText(f+"");




         }
         else if(ae.getSource()==jbt2)
         {
             int n=Integer.parseInt(jtf1.getText().toString());
             int sum=Dsum.dsum(n);
             jtf2.setText(sum+"");

         }
         else if(ae.getSource()==jbt3)
         {
             jtf1.setText(null);
             jtf2.setText(null);
         }
     }
     public static void main(String[] args)
     {
         new A2("Reverse a no and Digital sum");
     }
 }
