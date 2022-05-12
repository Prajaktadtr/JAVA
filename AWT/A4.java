
/*Construct an AWT Frame with required UI and perform the following
1. Read a String to
 * Print Reverse
 * Find no of vowels and consonants
 * Change case of a String
 * Four digit no need to be convert to alphabets i.e. 1234 o/p One Two Three Four*/
 
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class A4 extends Frame implements ActionListener
{
    Label lb1,lb2;
    TextField tf1,tf2;
    Button bt1,bt2,bt3,bt4,bt5,bt6;

    public A4(String title)
    {
        super(title);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setBackground(Color.red);
        this.setVisible(true);
        Font f=new Font("arial",Font.BOLD,20);

        lb1=new Label("Enter a String");
        lb1.setFont(f);
        lb1.setForeground(Color.white);
        lb1.setBounds(100,200,300,30);
        this.add(lb1);

        tf1=new TextField();
        tf1.setFont(f);
        tf1.setForeground(Color.RED);
        tf1.setBounds(450,200,300,30);
        this.add(tf1);

        lb2=new Label("Result");
        lb2.setFont(f);
        lb2.setForeground(Color.white);
        lb2.setBounds(100,400,300,30);
        this.add(lb2);

        tf2=new TextField();
        tf2.setFont(f);
        tf2.setForeground(Color.RED);
        tf2.setBounds(450,400,300,30);
        this.add(tf2);
        

        bt1=new Button("Reverse of a string");
        bt2=new Button("No of vowels");
        bt3=new Button("Change case");
        bt4=new Button("Refreash");
        bt5=new Button("Exit");
        bt6=new Button("No of consonants");

        bt1.setFont(f);
        bt2.setFont(f);
        bt3.setFont(f);
        bt4.setFont(f);
        bt5.setFont(f);
        bt6.setFont(f);

        bt1.setBounds(100,600,200,30);
        bt2.setBounds(400,600,200,30);
        bt3.setBounds(100,800,200,30);
        bt4.setBounds(400,800,200,30);
        bt5.setBounds(700,800,200,30);
        bt6.setBounds(700,600,200,30);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);

        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        this.add(bt4);
        this.add(bt5);
        this.add(bt6);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            Scanner sc=new Scanner(System.in);
            String str=(tf1.getText().toString());//logic for reversing the string
            String rstr="";
            char ch;
           /* for(int i=str.length()-1;i>0;i--)
            {
                rstr+=str.charAt(i);
            }*/
            for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rstr= ch+rstr; //adds each character in front of the existing string
      }
            tf2.setText(rstr+""); 
        }
        else if(ae.getSource()==bt2)
        {
            String str=(tf1.getText().toString());
            int vc=0;//logic for counting no of vowels and consonants
             for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U')
                vc++;

            }
            tf2.setText(vc+"");
        }
        else if(ae.getSource()==bt3)
        {
            String str=(tf1.getText().toString());
            String cstr="";//logic for converting the case
             /*for(int i=0;i<=str.length();i++)
             {
                 int n=(int)str.charAt(i);
                 if(n>=65 && n<=96)
                 n+=32;
                 else if(n>=97 && n<=123)
                  n-=32;
                  cstr+=(char)n;
        
             }
            
             tf2.setText(cstr+"");*/
             for(int i=0;i<str.length();i++)
             {
                 int n=(int)str.charAt(i);
                 if(n>=65 && n<=96)
                 n+=32;
                 else if(n>=97 && n<=123)
                  n-=32;
                  cstr+=(char)n;
        
             }
            
             tf2.setText(cstr+"");
        }
        else if(ae.getSource()==bt4)
        {
            tf1.setText("");
            tf2.setText(null);

        }
        else if(ae.getSource()==bt5)
        {
            System.exit(1);//termination of application
        }
        else if(ae.getSource()==bt6)
        {
            String str=(tf1.getText().toString());
            int count=0;
            for (int i=0 ; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                   System.out.print("");
                }else if(ch != ' '){
                   count++;
                }
             }
             tf2.setText(count+"");

        }
    }
    public static void main(String args[])
    {
        new A4("String manipulation");
    }
}