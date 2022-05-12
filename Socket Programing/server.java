import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Server extends JFrame implements Runnable,addActionListener
{
JLabel jlb1,jlb2;
File file;
JTextArea jta1,jta2;
Thread recieveThread;
TextField jtf1;
JButton jbt1,jbt2,jbt3;
DatagramSocket ds;
Container cp;
JScrollPane sp1,sp2;
int cport=10,sport=11;


Server(String title) throws Exception
{
    super(title);
    this.setSize(1000,1000);
    cp=getContentPane();
    cp.setBackground(Color.LIGHT_GRAY);
    cp.setLayout(null);
    Font f=new Font("arial",Font.BOLD,20);

    jlb1=new JLabel("For File :");
    jlb2=new JLabel("For Text Messages :");
    

    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    

}
}