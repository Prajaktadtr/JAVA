import java. net.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;








public class AServer extends JFrame implements ActionListener
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
BufferedOutputStream out=null;
ServerSocket sos;
int count=0;



public AServer(String title)
{
    super(title);
    this.setSize(600,600);
    cp=getContentPane();
    cp.setBackground(Color.lightGray);
    cp.setLayout(null);
    Font f=new Font("arial",Font.BOLD,10);
    
    jlb1=new JLabel("Server");
   
    jtf1=new JTextField();
    
    jbt1=new JButton("Send");
    jbt2=new JButton("Choose_File");
    jbt3=new JButton();

    jta.setBounds(10,20,300,300);

    jbt1.setBounds(450,500,100,30);
    jbt2.setBounds(500,550,100,30);

    jbt1.addActionListener(this);
    jbt2.addActionListener(this);

    jtf1.setBounds(50,500,300,30);

    cp.add(jlb1);
    cp.add(jtf1);
    cp.add(jbt1);
    cp.add(jbt2);

    this.setVisible(true);

}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==jbt2)
{
    JFileChooser filechooser=new JFileChooser();
    int returnval=filechooser.showOpenDialog(null);
    if(returnval==JFileChooser.APPROVE_OPTION)
    {
        file=filechooser.getSelectedFile();
        if(file!=null)
        {
            jta.setText(file.toString());

        }
    }
}
if(ae.getSource()==jbt1)
{
    try
    {
        sos=new ServerSocket(1024);
        s=sos.accept();
        System.out.println("connected......");
        fis=new FileInputStream("file");
        System.out.println("read file");
        long length=file.length();
        byte[] bytes=new byte[(int)length];
        bis=new BufferedInputStream(fis);
        out=new BufferedOutputStream(s.getOutputStream());
        while((count=bis.read(bytes))>0)
        {
            out.write(bytes,0,count);

        }
        out.flush();
        out.close();
        fis.close();
        bis.close();
        s.close();
        sos.close();

    }catch(IOException io)
    {
        io.printStackTrace();
    }
}
}
public static void main(String args[])
{

    SwingUtilities.invokeLater(new Runnable() 
    {

        public void run()
        {
            new AServer("AServer").setVisible(true);

        }
        
    });
}

}
    


