
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Reciver extends javax.swing.JFrame implements ActionListener{

  
    public Reciver() {
        initi();
    }

   
    @SuppressWarnings("unchecked")
                     
    private void initi() {

        jLabel1 = new JLabel();
        accept = new  JButton();
        text = new  JTextField();
        ipinfo=new JLabel("PUT IP ADDRESS OF SERVER");
        
        ipinfo.setBounds(80, 100, 1000, 30);
        text.setBounds(100, 150, 150, 30);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CLICK ON BUTTON TO ACCEPT FILE");
        jLabel1.setBounds(10, 10, 2000, 50);

        accept.setText("ACCEPT");
        accept.setBounds(100, 200, 150, 30);
        
        accept.addActionListener((ActionListener)this);
        
     
        setSize(350,300);
        getContentPane().setLayout(null);
        this.add(jLabel1);
        this.add(accept);
        this.add(text);
        this.add(ipinfo);
        
       
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==accept)
    	{
    		System.out.println("click on accept");
		try
        {
			ip=text.getText();
            s= new Socket(ip,1024);
            System.out.println("connected...");
            int packet=s.getReceiveBufferSize();
            System.out.println("packet Size: "+packet);
            in= s.getInputStream();
            out=new FileOutputStream("D:\\lucky.txt");
            bos= new BufferedOutputStream(out);
            byte[] bytes = new byte[packet];
            while((count = in.read(bytes)) > 0)
            {
                bos.write(bytes, 0, count);
                System.out.println("packest data: "+bytes);
            }
            JOptionPane.showMessageDialog(null, "Download Complete");
            bos.flush();
            bos.close();
            in.close();
            out.close();
            s.close();
            
        }catch(Exception ex){}
    	}
	}

  
    public static void main(String args[]) {
      
              SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Reciver().setVisible(true);
            }
        });
    }
    
    
     private String ip="localhost";
    private Socket s=null;
    private File file=null;
    private InputStream in=null;
    private FileOutputStream out;
    private BufferedOutputStream bos=null;
    private int count=0;
    private JTextField text;               
    private JButton accept;
    private JLabel jLabel1;
    
    private JLabel ipinfo;
	
               
}
