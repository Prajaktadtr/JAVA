/*Create a GUI (presentation layer) and separate application layer and perform the following
* Read a String to print reverse, Change case of it, check no of vowels and consonants*/
package Swing_part2;
import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
//  import mypk.*;
 

 public class A3 extends JFrame implements ActionListener
 {
     JLabel jlb1,jlb2;
     JTextField jtf1,jtf2;
     JButton jbt1,jbt2,jbt3,jbt4,jbt5;
     Container cp;
     public A3(String title)
     {
         super(title);
        this.setSize(1000,1000);
        // cp=getContentpane();
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.pink);

        Font f=new Font("arial",Font.BOLD,20);
        jlb1=new JLabel("Enter a String");
        jlb2=new JLabel("Result");

        jtf1=new JTextField();
        jtf2=new JTextField();
        
        jbt1=new JButton("Reverse String");
        jbt2=new JButton("Change Case");
        jbt3=new JButton("No of Vowels");
        jbt4=new JButton("No of Consonnents");
        jbt5=new JButton("Refreash");

        jlb1.setBounds(200,100,250,30);
        jlb2.setBounds(200,200,250,30);

        jtf1.setBounds(500,100,250,30);
        jtf2.setBounds(500,200,250,30);

        jbt1.setBounds(400,400,200,30);
        jbt2.setBounds(650,400,200,30);
        jbt3.setBounds(400,600,200,30);
        jbt4.setBounds(650,600,200,30);
        jbt5.setBounds(400,800,200,30);


        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);
        jbt4.addActionListener(this);
        jbt5.addActionListener(this);
        
        cp.add(jlb1);
        cp.add(jlb2);
        
        cp.add(jtf1);
        cp.add(jtf2);

        cp.add(jbt1);
        cp.add(jbt2);
        cp.add(jbt3);
        cp.add(jbt4);
        cp.add(jbt5);



        this.setVisible(true);


     }

     public void actionPerformed(ActionEvent  ae)
     {
         if(ae.getSource()==jbt1)
         {
            //  int n=Integer.parseInt(jtf1.getText());
            String str=(jtf1.getText().toString());//logic for reversing the string
            String rstr="";
            char ch;
            for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rstr= ch+rstr; //adds each character in front of the existing string
      }
            jtf2.setText(rstr+""); 


         }
         else if(ae.getSource()==jbt2)
         {
            String str=(jtf1.getText().toString());
            String cstr="";//logic for converting the case
             for(int i=0;i<str.length();i++)
             {
                 int n=(int)str.charAt(i);
                 if(n>=65 && n<=96)
                 n+=32;
                 else if(n>=97 && n<=123)
                  n-=32;
                  cstr+=(char)n;
             }

        jtf2.setText(cstr+"");

         }
         else if(ae.getSource()==jbt3)
         {
            String str=(jtf1.getText().toString());
            int vc=0;//logic for counting no of vowels and consonants
             for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U')
                vc++;

            }
            jtf2.setText(vc+"");
         }
         else if(ae.getSource()==jbt4)
         {
            String str=(jtf1.getText().toString());
            int count=0;
            for (int i=0 ; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                   System.out.print("");
                }
                else if(ch != ' ')
                {
                   count++;
                }
             }
             jtf2.setText(count+"");

         }
         else if(ae.getSource()==jbt5)
         {
            jtf1.setText(null);
            jtf2.setText(null);
         }
     }
     public static void main(String[] args)
     {
         new A3("String Manupulation");
     }
 }
