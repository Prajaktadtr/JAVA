/*2. Generate a Arithmetic Application two read any two nos and perform all possible arithmetics like
addition, subtraction, multiplication, division, modulus, compare, refresh*/

import java.lang.*;
import java.awt.*;
import java.awt.event.*;


public class A2 extends Frame implements ActionListener
{
    Label lb1,lb2,lb3;
    TextField tf1,tf2,tf3;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;

    public A2(String title)
    {
        super(title);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setBackground(Color.RED);
        this.setVisible(true);
        Font f=new Font("arial",Font.BOLD,20);

        lb1=new Label("Enter first no");
        lb1.setFont(f);
        lb1.setForeground(Color.white);
        lb1.setBounds(100,200,300,30);
        this.add(lb1);

        tf1=new TextField();
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBounds(450,200,150,30);
        this.add(tf1);

        lb2=new Label("Enter second no");
        lb2.setFont(f);
        lb2.setForeground(Color.white);
        lb2.setBounds(100,300,300,30);
        this.add(lb2);

        tf2=new TextField();
        tf2.setFont(f);
        tf2.setForeground(Color.red);
        tf2.setBounds(450,300,150,30);
        this.add(tf2);

        
        lb3=new Label("Result");
        lb3.setFont(f);
        lb3.setForeground(Color.white);
        lb3.setBounds(100,400,300,30);
        this.add(lb3);

        tf3=new TextField();
        tf3.setFont(f);
        tf3.setForeground(Color.red);
        tf3.setBounds(450,400,150,30);
        this.add(tf3);

        bt1=new Button("Add +");
        bt2=new Button("Sub -");
        bt3=new Button("Mult *");
        bt4=new Button("Div /");
        bt5=new Button("Mod %");
        bt6=new Button("Refreash");
        bt7=new Button("Exit");

        bt1.setFont(f);
        bt2.setFont(f);
        bt3.setFont(f);
        bt4.setFont(f);
        bt5.setFont(f);
        bt6.setFont(f);
        bt7.setFont(f);

        bt1.setBounds(100,600,100,30);
        bt2.setBounds(300,600,100,30);
        bt3.setBounds(500,600,100,30);
        bt4.setBounds(700,600,100,30);
        bt5.setBounds(100,800,100,30);
        bt6.setBounds(300,800,100,30);
        bt7.setBounds(500,800,100,30);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);

        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        this.add(bt4);
        this.add(bt5);
        this.add(bt6);
        this.add(bt7);

 }
 public void actionPerformed(ActionEvent ae)
 {
     if(ae.getSource()==bt1)
     {
         int a=Integer.parseInt(tf1.getText().toString());
         int b=Integer.parseInt(tf2.getText().toString());
         int c=0;
         c=a+b;
         tf3.setText(c+"");
     }
     else if(ae.getSource()==bt2)
     {
        int a=Integer.parseInt(tf1.getText().toString());
        int b=Integer.parseInt(tf2.getText().toString());
        int c=0;
        c=a-b;
        tf3.setText(c+"");
     }
     else if(ae.getSource()==bt3)
     {
        int a=Integer.parseInt(tf1.getText().toString());
        int b=Integer.parseInt(tf2.getText().toString());
        int c=0;
        c=a*b;
        tf3.setText(c+"");
     }
     else if(ae.getSource()==bt4)
     {
        int a=Integer.parseInt(tf1.getText().toString());
        int b=Integer.parseInt(tf2.getText().toString());
        int c=0;
        c=a/b;
        tf3.setText(c+"");
     }
     else if(ae.getSource()==bt5)
     {
        int a=Integer.parseInt(tf1.getText().toString());
        int b=Integer.parseInt(tf2.getText().toString());
        int c=0;
        c=a%b;
        tf3.setText(c+"");
     }
     else if(ae.getSource()==bt6)
     {
         tf1.setText("");
         tf2.setText("");
         tf3.setText(null);
     }
     else if(ae.getSource()==bt7)
     {
         System.exit(1);
     }

        

    }
    public static void main(String []args)
    {
        new A2("Calculator");
    }
}
