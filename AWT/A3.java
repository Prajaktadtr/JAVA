/*Construct an AWT Frame with required UI and perform the following
 Four digit no need to be convert to alphabets i.e. 1234 o/p One Two Three Four*/

 import java.lang.*;
 import java.awt.*;
 import java.awt.event.*;


 public class A3 extends Frame implements ActionListener
 {
     Label lb1,lb2;
     TextField tf1,tf2;
     Button bt1,bt2,bt3;

     public A3(String title)
     {
         super(title);
         this.setLayout(null);
         this.setSize(1000,1000);
        this.setBackground(Color.cyan);
        this.setVisible(true);
        Font f=new Font("arial",Font.BOLD,20);


        lb1=new Label("Enter a no :");
        lb1.setFont(f);
        lb1.setForeground(Color.red);
        lb1.setBounds(100,200,300,30);
        this.add(lb1);

        tf1=new TextField();
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBounds(450,200,150,30);
        this.add(tf1);

        lb2=new Label("Result");
        lb2.setFont(f);
        lb2.setForeground(Color.red);
        lb2.setBounds(100,300,150,30);
        this.add(lb2);

        tf2=new TextField();
        tf2.setFont(f);
        tf2.setForeground(Color.red);
        tf2.setBounds(450,300,400,30);
        this.add(tf2);

        bt1=new Button("Word");
        bt2=new Button("Refreash");
        bt3=new Button("Exit");

        bt1.setFont(f);
        bt2.setFont(f);
        bt3.setFont(f);

        bt1.setBounds(100,600,200,30);
        bt2.setBounds(350,600,200,30);
        bt3.setBounds(600,600,200,30);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);

        this.add(bt1);
        this.add(bt2);
        this.add(bt3);




     }
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==bt1)
         {
             int n=Integer.parseInt(tf1.getText().toString());
             int sum=0,r=0;
             while(n>0)
             {
                 r=n%10;
                 sum=sum*10+r;
                 n=n/10;
                 
             }
             n=sum;
             String a="";
             while(n>0)
             {
                 r=n%10;
                 switch(r)
                 {
                    case 0:
                    System.out.println("zero");
                    a+="Zero";
                    break;
                    case 1:
                    System.out.println("One");
                    a+="One";
                    break;
                    case 2:
                    System.out.println("Two");
                    a+="Two";
                    break;
                    case 3:
                    System.out.println("Three");
                    a+="Three";
                    break;
                    case 4:
                    System.out.println("Four");
                    a+="Four";
                    break;
                    case 5:
                    System.out.println("Five");
                    a+="Five";
                    break;
                    case 6:
                    System.out.println("Six");
                    a+="Six";
                    break;
                    case 7:
                    System.out.println("Seven");
                    a+="Seven";
                    break;
                    case 8:
                    System.out.println("Eight");
                    a+="Eight";
                    break;
                    case 9:
                    System.out.println("Nine");
                    a+="Nine";
                    break;
                    default:
                    break;
                    
    
                 }//end of switch 
                n=n/10;
                
                }//end of while
                tf2.setText(a+"");
                // tf2.getText();
             }//end of if
        //    String n;
        // tf2.getText();

         
         else if(ae.getSource()==bt2)
         {
             tf1.setText("");
             tf2.setText(null);

         }
         else if(ae.getSource()==bt3)
         {
             System.exit(1);
         }
     }
 public static void main(String[] args)
 {
     new A3("Conversion of number to digit");
 }
}
