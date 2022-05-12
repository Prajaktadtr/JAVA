//package JDBC_part2;


import java.awt.Button;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class First extends JFrame implements ActionListener,WindowConstants
{
	Container cp;
	JLabel jla[];
	JComboBox jcp;
	JButton ok,cancle;
	String s1,s2,year;
	int h;
	Calendar cc;
//default constructor
	First()
	{
			super("MAIN SCREEN");
			setSize(800,800);
			Color c=new Color(251,200,210);
			Color c1=new Color(250,220,220);
			cp=getContentPane();
			cp.setLayout(null);
			cp.setBackground(c);
			LineBorder lb=new LineBorder(Color.red,2);
			TitledBorder tb=new TitledBorder(lb,"Main Menu");
			BevelBorder bb=new BevelBorder(BevelBorder.RAISED ,Color.white,Color.black);
			Font f1=new Font("Arial",Font.BOLD,20);
			Font f2=new Font("Arial",Font.BOLD,15);
			//date
			cc=Calendar.getInstance();
			s1=new String(""+cc.get(cc.DAY_OF_MONTH)+"-"+cc.get(cc.MONTH)+"-"+cc.get(cc.YEAR) );
			jla=new JLabel[8];
			jcp=new JComboBox();
			jcp.setBounds(340,210,300,30);
			jcp.addItem("AGARWAL BROTHERS 2001-2002");
			jcp.addItem("AGARWAL BROTHERS 2000-2001");
			jcp.addItem("AGARWAL BROTHERS 1999-2000");
			jcp.setFont(f2);
			jcp.setBackground(c1);

			ok=new JButton("OK");
			ok.setFont(f1);
			ok.setMnemonic('O');
			ok.setBorder(bb);
			ok.setBackground(c);
			ok.addActionListener(this);
			ok.setBounds(250,300,130,40);

			cancle=new JButton("CANCLE");
			cancle.setBounds(400,300,130,40);
			cancle.setMnemonic('C');
			cancle.setFont(f1);
			cancle.setBorder(bb);
			cancle.setBackground(c);
			cancle.addActionListener(this);

			//add the label in the JLabel
			String str[]={"*****MEDISOFT PRO(L)*****",".....THE COMPLETE AND COMPREHENSIVE BUSINESS MEDIINFO SYSTEM.....","SYSTEM DATE:-","SYSTEM TIME:-"," "," "," ","SELECT A COMPANY:-"};
			for(int label=0;label<str.length;label++)
			{
				jla[label]=new JLabel(str[label]);
				if(label==0)
				jla[0].setFont(f1);
				else
				jla[label].setFont(f2);
			  }
			 jla[5].setText(s1);
			 jla[6].setBorder(tb);
			 jla[7].setForeground(Color.black);
			 jla[7].setFont(f1);
			 jla[0].setBounds(220,7,450,70);
			 jla[1].setBounds(100,57,850,70);
			 jla[2].setBounds(100,500,150,50);
			 jla[3].setBounds(420,500,150,50);
			 jla[4].setBounds(550,500,100,50);
			 jla[5].setBounds(225,500,250,50);
			 jla[6].setBounds(70,155,650,250);
			 jla[7].setBounds(100,200,300,50);

			//add the label in the container
			for(int label =0;label<8;label++)
			{
				cp.add(jla[label]);
			}
			cp.add(jcp);
			cp.add(ok);
			cp.add(cancle);
			jcp.setEditable(false);

			//timer class use for display current time
			Timer t=new Timer(1000,new TimerListener());
			t.setInitialDelay(0);
			t.start();

			//key listener
			addKeyListener(new KeyAdapter()
			{
			  public void keyPressed(KeyEvent e)
				{
				  if(e.getKeyCode()==10)
					{
						if(ok.hasFocus())//ok button
						{
							year=(String)jcp.getSelectedItem();
							// new Pass(year);
						}//end of ok button

						if(cancle.hasFocus())//cancle
						{
							System.exit(0);
						}//close button close
					}
					repaint();

				}//end of keypress method
			}//end of keylistener method
			);//end of keyListener method breaket

		  setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		  setResizable(false);
		  setVisible(true);
          }//first method end

	  //create timerclass
	  class TimerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
			{
				cc=Calendar.getInstance();
				h= cc.get(cc.HOUR_OF_DAY);
				if(h>12)
				{
					h=h-12;
					s2=new String(""+h+":"+cc.get(cc.MINUTE)+":"+cc.get(cc.SECOND)+"PM");
					jla[4].setText(s2);
				}
				else
				{
					s2=new String(""+h+":"+cc.get(cc.MINUTE)+":"+cc.get(cc.SECOND)+"AM");
					jla[4].setText(s2);
				}
			}
		}//timerlistener end


	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ok)
		 {
		  year=(String)jcp.getSelectedItem();
		  // new Pass(year);
		 }
		 if(ae.getSource()==cancle)
		 {
			 System.exit(0);
		 }

   }//actionperformed end


public static void main(String as[])
	{
		First s=new First();

	}//main method end
  }//first class end























