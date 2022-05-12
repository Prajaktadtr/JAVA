import java.awt.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
class DC12_tcpClient extends JFrame implements Runnable,ActionListener
{
       TextArea msgArea;
       Thread recieveThread;
       TextField msgText;
       Button sendButton;
       DatagramSocket ds;
       DataInputStream d1;
       DataOutputStream d2;
       int cport=1024,sport=4444;
       DC12_tcpClient() throws Exception
       {
                 setTitle("Client");
                 msgArea=new TextArea(50,50);
                 msgText=new TextField(30);
                 sendButton=new Button("send");

                setLayout(new FlowLayout(FlowLayout.CENTER));
                add(msgArea);
                add(msgText);
                add(sendButton);

               sendButton.addActionListener(this);
               setBounds(10,10,200,200);
               setVisible(true);
               
               recieveThread=new Thread(this);
               recieveThread.start();
      }
      public void actionPerformed(ActionEvent e)
      {
                   try
                  {
                               String messageToServer=msgText.getText();
                               //InetAddress ia= InetAddress.getByName("192.168.1.49");
							   //String add="192.168.1.48";
                               msgArea.append("Client says:"+messageToServer+"\n");
										   //System.out.println("Enter data to send to the server: ");
										   //String msg=bf.readLine();
                               d2.writeUTF(messageToServer);
			       String messageToClient=d1.readUTF();
			       msgArea.append("Server says:"+messageToClient+"\n");
										   //System.out.println("Server says: ");
										   //System.out.println(messageTo		   
                    }
		    catch(Exception e1)
		    {
		    }
      }
          public void run()
          {
					try
					{
							Socket s1=new Socket("192.168.1.46",5000);
							System.out.println(s1.getInetAddress());
							d1=new DataInputStream(s1.getInputStream());
							d2=new DataOutputStream(s1.getOutputStream());
							//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
					}
					catch(Exception e)
					{
					}
         }
       public static void main(String args[]) throws Exception
       {
              new tcpClient();
       }
}

