import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;









public class AClient extends JFrame implements ActionListener
 {
JLabel jlb1,jlb2;
JTextField jtf1,jtf2;
JTextArea jta;
JButton jbt1,jbt2,jbt3;
Container cp;
File file;
Socket s;
FileInputStream fis;
BufferedInputStream bis;
BufferedOutputStream bos=null;
ServerSocket sos;
int count=0;
DatagramSocket ds;
DataInputStream d1;
DataOutput d2;

String ip="localhost";
InputStream in;
FileOutputStream out;


public AClient(String title)
{
    super(title);
    this.setSize(1000,1000);
    cp=getContentPane();
    cp.setBackground(Color.lightGray);
    cp.setLayout(null);
    Font f=new Font("arial",Font.BOLD,10);
    
    jlb1=new JLabel("Server");
   
    jtf1=new JTextField();
    
    jbt1=new JButton("Send");
    jbt2=new JButton("Choose_File");
    jbt3=new JButton("Accept");

    jta.setBounds(10,20,300,300);

    jbt1.setBounds(450,500,100,30);
    jbt2.setBounds(250,550,100,30);
    jbt3.setBounds(450,550,100,30);

    jbt1.addActionListener(this);
    jbt2.addActionListener(this);
    jbt3.addActionListener(this);

    jtf1.setBounds(50,500,300,30);

    cp.add(jlb1);
    cp.add(jtf1);
    cp.add(jbt1);
    cp.add(jbt2);
    cp.add(jbt3);

    this.setVisible(true);
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==jbt3)
{
    System.out.println("Click on Accept");
    try{
        ip=jta.getText();
        s=new Socket(ip,1024);
        System.out.println("connected....");
        int packet=s.getReceiveBufferSize();
        System.out.println("packet Size: "+packet);
        in=s.getInputStream();
        out=new FileOutputStream("");
        bos=new BufferedOutputStream(out);
        byte[] bytes=new byte[packet];
        while((count=in.read(bytes))>0)
        {
            bos.write(bytes,0,count);
            System.out.println("packet data: "+bytes);
        }
        JOptionPane.showMessageDialog(null,"Download Complete");
        bos.flush();
        bos.close();
        in.close();
        out.close();
        s.close();
        

    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
if(ae.getSource()==jbt1)
{
    try
    {
                 String messageToServer=jtf1.getText();
                 //InetAddress ia= InetAddress.getByName("192.168.1.49");
                 //String add="192.168.1.48";
                 ((Appendable) jtf1).append("Client says:"+messageToServer+"\n");
                             //System.out.println("Enter data to send to the server: ");
                             //String msg=bf.readLine();
                 d2.writeUTF(messageToServer);
     String messageToClient=d1.readUTF();
     ((Appendable) jtf1).append("Server says:"+messageToClient+"\n");
                             //System.out.println("Server says: ");
                             //System.out.println(messageTo		   
      }
catch(Exception e1)
{
}
}
if(ae.getSource()==jbt2)
{

}
}

public static void main(String args[])
{
    SwingUtilities.invokeLater(new Runnable() {
        public void run()
        {
            new AClient("AClient").setVisible(true);
        }
    });
}
 }
