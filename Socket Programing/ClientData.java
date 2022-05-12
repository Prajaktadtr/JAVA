import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.*;
class ClientData extends JFrame implements Runnable,ActionListener
{
	File file;
	JLabel forFile,forMsg;
	JTextArea msgData,fileData;
	JScrollPane sp1,sp2;
	Thread recieveThread;
	TextField msgText;
	JButton sendButton,selectFile,sendFile;
	DatagramSocket ds;
	int cport=10,sport=11;
	ClientData(String title) throws Exception
	{
		super(title);

		//setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
        this.setSize(1360, 740);

		msgData=new JTextArea(15,30);
		fileData=new JTextArea(15,30);	
		msgText=new TextField(30);
		sendButton=new JButton();
		selectFile=new JButton();
		sendFile=new JButton();
		sp1=new JScrollPane(fileData);
		sp2= new JScrollPane(msgData);
		forFile=new JLabel("For File :");
		forMsg=new JLabel("For Text Message :");

		
        selectFile.setText("SELECT FILE");
        selectFile.setBounds(50, 50, 200, 30);
        sendFile.setText("SEND FILE");
        sendFile.setBounds(350, 50, 150, 30);

        sendButton.setText("SEND");
        sendButton.setBounds(50, 100, 100, 30);

		msgText.setBounds(250,100,200,30);

		forFile.setBounds(50,150,500,30);
		forMsg.setBounds(600,150,500,30);
		sp1.setBounds(50,200,500,500);
		sp2.setBounds(600,200,500,500);
		
		selectFile.addActionListener(this);
        sendButton.addActionListener(this);
        sendFile.addActionListener(this);

        

        // this.getContentPane().add(sp1);
        // this.getContentPane().add(sp2);

        this.add(forMsg);
        this.add(forFile);
        this.add(selectFile);
        this.add(sendButton);
        //this.add(sendFile);
		//this.add(msgData);
		//this.add(fileData);
		this.add(msgText);
		this.add(sp1);
		this.add(sp2);
		
		this.setVisible(true);

		ds=new DatagramSocket(cport);
		recieveThread=new Thread(this);
		recieveThread.start();
	}
	public void actionPerformed(ActionEvent evt)
		{try{
			DatagramPacket dp;
			String s,message="";
			if(evt.getSource()==selectFile)
			{
				// choose the file to send
				try
				{
					JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
					int returnValue = jfc.showOpenDialog(null);

					if (returnValue == JFileChooser.APPROVE_OPTION) 
					{
						File selectedFile = jfc.getSelectedFile();
						System.out.println(selectedFile.getAbsolutePath());

					//read all tha data inside the file
						FileReader fr=new FileReader(selectedFile.getAbsolutePath());
						// Create a buffer reader
						BufferedReader br=new BufferedReader(fr);
						message="";


						while((s=br.readLine())!=null)
						{
							//s+="\r";
							//fileData.append(s+System.lineSeparator());
							
							message=message+s+"\r"+"\n";  
							System.out.println(s);
						}
						//getting data from file
						//String message=fileData.getText();
					
						dp=new DatagramPacket(message.getBytes(),message.length(),InetAddress.getLocalHost(),sport);

						
							ds.send(dp);
							fileData.append("You:"+message+"\n");
						
						    // ds.send(dp);
							// fileData.append("You:"+message+"\n");
							// close file reader
						br.close();
						fr.close();
					}
				}catch(Exception e){}
			}
			if(evt.getSource()==sendButton)
			{
				//getting data from text field
				try
				{
					message="";
					message=msgText.getText();
					dp=new DatagramPacket(message.getBytes(),message.length(),InetAddress.getLocalHost(),sport);

					ds.send(dp);
					msgData.append("You:"+message+"\n");
				}
				catch(Exception e1)
				{}
			}
			
			}catch(Exception e){}
		}
public void run()
	{

		byte b[]=new byte[1000];
		while(true)
		{
			try
			{
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String data=new String(dp.getData(),0,dp.getLength());
			msgData.append("Server:"+data+"\n");
			}
			catch(Exception e)
			{}
		}

	}		
    public static void main(String args[]) throws Exception
        {
            new ClientData("Client");
        }


}
