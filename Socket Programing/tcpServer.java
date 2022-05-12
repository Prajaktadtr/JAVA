import java.awt.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
class tcpServer extends JFrame implements Runnable,ActionListener
{
       TextArea msgArea;
       Thread recieveThread;
       TextField msgText;
       Button sendButton;
       DatagramSocket ds;
       int cport=1024,sport=4444;
	   DataInputStream d1;
	   DataOutputStream d2;
	   BufferedReader bf;
       tcpServer() throws Exception
       {
                 setTitle("Server");
                 msgArea=new TextArea(50,50);
                 msgText=new TextField(30);
                 sendButton=new Button("send");

                setLayout(new FlowLayout(FlowLayout.CENTER));
                add(msgArea);
                add(msgText);
                add(sendButton);

               sendButton.addActionListener(this);
               setBounds(10,10,900,900);
               setVisible(true);
               
               recieveThread=new Thread(this);
               recieveThread.start();
      }
      public void actionPerformed(ActionEvent e)
      {
                   try
                  {
                               String messageToClient=msgText.getText();
                               //InetAddress ia= InetAddress.getByName("192.168.1.49");
							   //String add="192.168.1.48";
                               msgArea.append("Server says:"+messageToClient+"\n");
										//System.out.println("Client says: "+msg);
										
										//d2.writeUTF(messageToClient);
										//System.out.println("Enter data to send to the client: ");
										//String msg1=bf.readLine();
										d2.writeUTF(messageToClient);
                                                                                String messageToServer=d1.readUTF();
							 msgArea.append("Client says:"+messageToServer+"\n");
                    }
					catch(Exception e1)
				   {
				   }
           }
          public void run()
          {
					try
					{
						     ServerSocket s=new ServerSocket(5000);
							 Socket s2=s.accept();
							 d1=new DataInputStream(s2.getInputStream());
							 d2=new DataOutputStream(s2.getOutputStream());
							 //bf=new BufferedReader(new InputStreamReader(System.in));
							 //msgArea.append("Client:"+data+"\n");
							 
					}
					catch(Exception e)
					{
					}
         }
       public static void main(String args[]) throws Exception
       {
              new tcpServer();
       }
}

