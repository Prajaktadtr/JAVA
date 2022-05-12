import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

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


 public class A1 extends Frame implements ActionListener
 {
     Label lb1,lb2,lb3,lb4;
     TextField tf1,tf2,tf3,tf4;
     Button bt1,bt2,bt3;


     public A1(String title)//constructor
     {
         super(title);
         this.setLayout(null);
         this.setSize(1000,1000);
         this.setBackground(Color.red);
         this.setVisible(true);
         Font f=new Font("algerian",Font.BOLD,20);

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

         

         lb2=new Label("Reverse of string");
         lb2.setFont(f);
         lb2.setForeground(Color.white);
         lb2.setBounds(100,400,300,30);
         this.add(lb2);

         tf2=new TextField();
         tf2.setFont(f);
         tf2.setForeground(Color.red);
         tf2.setBounds(450,400,300,30);
         this.add(tf2);

         lb3=new Label("No of vowels and consonants");
         lb3.setFont(f);
         lb3.setForeground(Color.white);
         lb3.setBounds(100,600,300,30);
         this.add(lb3);

         tf3=new TextField();
         tf3.setFont(f);
         tf3.setForeground(Color.RED);
         tf3.setBounds(450,600,300,30);
         this.add(tf3);

         

         lb4=new Label("Changed case");
         lb4.setFont(f);
         lb4.setForeground(Color.white);
         lb4.setBounds(100,800,300,30);
         this.add(lb4);

         tf4=new TextField();
         tf4.setFont(f);
         tf4.setForeground(Color.red);
         tf4.setBounds(450,800,300,30);
         this.add(tf4);


         bt1=new Button("RESULT");
         bt1.setFont(f);
         bt1.setBounds(100,900,200,30);
         bt1.addActionListener(this);
         this.add(bt1);
         bt2=new Button("Refreash");
         bt2.setFont(f);
         bt2.setBounds(400,900,200,30);
         bt2.addActionListener(this);
         this.add(bt2);

         bt3=new Button("Exit");
         bt3.setFont(f);
         bt3.setBounds(700,900,200,30);
         bt3.addActionListener(this);
         this.add(bt3);

         //bt1=new Button("RESULT");
         // bt1.setFont(f);
         //bt1.setBounds(100,800,200,30);
         //bt1.addActionListener(this);
         //this.add(bt1);
        }
 
        
    public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==bt1)
         {
             Scanner sc=new Scanner(System.in);
             String str=(tf1.getText().toString());//logic for reversing the string
             String rstr=sc.nextLine();
             for(int i=str.length()-1;i>0;i--)
             {
                 rstr+=str.charAt(i);
             }
             tf2.setText(rstr+"");


             int vc=0;//logic for counting no of vowels and consonants
             for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U')
                vc++;

            }

             tf3.setText(vc+"");

             String cstr="";//logic for converting the case
             for(int i=0;i<str.length();i++)
             {
                 int n=(int)str.charAt(i);
                 if(n>65 && n<97)
                 n+=32;
                 else if(n>97 && n<123)
                  n-=32;
                  cstr+=(char)n;
        
             }
             tf4.setText(cstr+"");


         }
         else if(ae.getSource()==bt2)
         {
             tf1.setText("");
             tf2.setText(null);
             tf3.setText(null);
             tf4.setText(null);
         }
         else if(ae.getSource()==bt3)
         {
             System.exit(1);//termination of application

         }
     }
     public static void main(String[] args)
     {
         new A1("string manipulation");
     }
    }

