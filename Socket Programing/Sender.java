
//package nuwdabm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.*;


public class Sender extends  JFrame  implements ActionListener {

    
    public Sender() {
        initComponents();
    }
                         
    private void initComponents() {

        jLabel1 = new JLabel();
        text = new  JTextField();
        chooser = new  JButton();
        send = new  JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CHOOSE FILE TO SEND");
        jLabel1.setBounds(10, 10, 2000, 50);
        text.setEditable(false);
        text.setBounds(10,150 , 300, 30);

        chooser.setText("CHOOSER");
        chooser.setBounds(350, 150, 120, 30);
        chooser.addActionListener(this);
       

        send.setText("SEND");
        send.setBounds(350, 220, 100, 30);
        send.addActionListener(this);
         setSize(550,500);
        getContentPane().setLayout(null);
        this.add(jLabel1);
        this.add(text);
        this.add(chooser);
        this.add(send);
    } 
    
    @Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
    	if(evt.getSource()==chooser)
    	{
    		  JFileChooser filechooser = new JFileChooser();
    	        int returnval = filechooser.showOpenDialog(null);

    	        if (returnval == JFileChooser.APPROVE_OPTION) {
    	            file = filechooser.getSelectedFile();
    	            if (file != null) {
    	                
    	                text.setText(file.toString());
    	            }
    	        }
    	}
    	if(evt.getSource()==send)
    	{
    		 try {
    	            sos= new ServerSocket(1024);
    	            s= sos.accept();    	            
    	             System.out.println("connected....");
    	              fis=new FileInputStream(file);
    	               System.out.println("read file");
    	              long length=file.length();
    	              byte[] bytes = new byte[(int) length];
    	             bis=new BufferedInputStream(fis);
    	             out= new BufferedOutputStream(s.getOutputStream());    	                	                 
    	                 while((count = bis.read(bytes)) > 0)
    	                 {   	                    
    	                      out.write(bytes, 0, count);
    	                     	                         
    	                 }     	                       	                  	                  
    	                 out.flush();
    	                out.close();
    	                 fis.close();
    	                 bis.close();
    	                 s.close();
    	                 sos.close();    	               
    	                     	          
    	        } catch (IOException ex) {
    	            ex.printStackTrace();
    	        }
    	}
		
	}

   public static void main(String args[]) {
       
        
      
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Sender().setVisible(true);
            }
        });
    }
     private File file;
     private Socket s;
    private FileInputStream fis;
    private BufferedOutputStream out=null;
    private BufferedInputStream bis;
    private int count=0;
    private ServerSocket sos;                      
    private JButton chooser;
    private JLabel jLabel1;
    private JButton send;
    private JTextField text;
                    
	
}
