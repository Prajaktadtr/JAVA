/*3. Construct a Login Window
 Title - User Authentication Window
have a suitable image
 Use JPasswordField for password
and verify the id and password and prompt message accordingly */

 package Swing_part2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A5 extends JFrame implements ActionListener
{
    JLabel jlb1,jlb2,jlb3,jlb4;
    JTextField jtf1,jtf2;
    JPasswordField jp1;
    JButton jbt1;
    Container cp;

    public A5(String title)
    {
        super (title);
        this.setSize(1000,1000);
        cp=getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.LIGHT_GRAY);
        // JFrame fr=new JFrame("title");

        jlb3=new JLabel(new ImageIcon("Swing_part2/images/l.jpg"));
        jlb3.setBounds(100,600,800,200);//bounds of image
//image in Swing_part2 saved as  a name of c.png

        Font f=new Font("arial",Font.BOLD,40);
        jlb1=new JLabel("Username");
        jlb2=new JLabel("Password");

        jtf1=new JTextField();
        
        jp1=new JPasswordField();

        jbt1=new JButton("Login");

        jlb1.setBounds(200,100,250,50);
        jlb2.setBounds(200,200,250,50);
        jtf2.setBounds(200,600,400,50);
       

        jtf1.setBounds(500,100,250,50);

        jp1.setBounds(500,200,250,50);

        jbt1.setBounds(300,500,100,50);

        jbt1.addActionListener(this);
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jlb3);//added image
        cp.add(jtf2);

        cp.add(jtf1);
        cp.add(jp1);
        cp.add(jbt1);

        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {

      // if(ae.getSource()==jbt1)
       //{
       /*String data="Username"+jtf1.getText();
        data+=",Passward :";
          new String(jp1.getPassword());
        jtf2.setText(data);
        //  JOptionPane.showMessageDialog(this, "your passwaord is", jlb1.getText().toString());
     
    }*/
    //String data=(jtf1.getText().toString());
    // data +="Password:";
    // new String(jp1.getPassword());
    // jp1.setText(data);
    // JOptionPane.showMessageDialog(this,"your username is", jtf1.getText().toString());
    }
    
    public static void main(String[] args)
    {
        new A5("User Authentication Window");
    }
}