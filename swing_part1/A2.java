/*Construct a Swing based GUI for the following
* Read a No to find its digital sum*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//swing library


public class A2 extends JFrame implements ActionListener
{
    JLabel jlb1,jlb2,jlb3;
    JTextField jtf1,jtf2;
    JButton jbt1,jbt2;
    Container cp;

    public A2(String title)
    {
        super(title);
        this.setSize(1000,1000);
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,20);

        jlb1=new JLabel("Digital sum");
        jlb2=new JLabel("Enter number");
        jlb3=new JLabel("Result");

        jtf1=new JTextField();
        jtf2=new JTextField();
        // jtf3=new JTextField();

        jbt1=new JButton("Digi sum");
        jbt2=new JButton("Refreash");

        jlb1.setFont(f); jlb2.setFont(f); jlb3.setFont(f);

        jtf1.setFont(f); jtf2.setFont(f); 

        jbt1.setFont(f); jbt2.setFont(f);

        jlb1.setForeground(Color.red);
        jlb2.setForeground(Color.red);
        jlb3.setForeground(Color.red);

        jtf1.setForeground(Color.red);
        jtf2.setForeground(Color.red);

        jbt1.setForeground(Color.red);
        jbt2.setForeground(Color.red);

        jlb1.setBounds(400,100,250,30);
        jlb2.setBounds(200,150,250,30);
        jlb3.setBounds(200,200,250,30);

        jtf1.setBounds(500,150,150,30);
        jtf2.setBounds(500,200,150,30);

        jbt1.setBounds(200,300,150,30);
        jbt2.setBounds(400,300,150,30);

        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jlb3);

        cp.add(jtf1);
        cp.add(jtf2);

        jbt1.addActionListener(this);
        jbt2.addActionListener(this);

        cp.add(jbt1);
        cp.add(jbt2);

        this.setVisible(true);
     }
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==jbt1)
         {
             int n=Integer.parseInt(jtf1.getText().toString());
            int sum=0;
            while(n>0)
            {
                sum=sum+n%10;
                n=n/10;
            }
            jtf2.setText(sum+"");
         }
         else if(ae.getSource()==jbt2)
         {
             jtf1.setText(null);
             jtf2.setText(null);
         }
     }

     public static void main(String[] args)
     {
         new A2("Digital sum");

     }
}