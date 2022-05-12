/*2. Modify console application to generate Frame based GUI to compute marksheet and save data to
table*/ 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class A2 extends JFrame implements ActionListener
{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10;
    JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9;
    JButton jbt1,jbt2,jbt3,jbt4;
    Container cp;
    JTable jt=null;
    Connection con=null;//establish connectivity
    Statement st=null;//executes Query on Established Connection
    ResultSet rs=null;//holds the result of executed query

    int sub1,sub2,sub3,sub4,sub5,total;
    float per;
    //global declation of variable


    public A2(String title)
    {
        super(title);
        this.setSize(1200,1000);
        cp=getContentPane();
        cp.setBackground(Color.white);
        cp.setLayout(null);
        Font f=new Font("arial",Font.BOLD,20);
        jlb1=new JLabel("RESULT");
        jlb2=new JLabel("Name");
        jlb3=new JLabel("Roll No");
        jlb4=new JLabel("sub1");
        jlb5=new JLabel("sub2");
        jlb6=new JLabel("sub3");
        jlb7=new JLabel("sub4");
        jlb8=new JLabel("sub5");
        jlb9=new JLabel("Total");
        jlb10=new JLabel("percent");


         // Initialise Text Fields
         jtf1=new JTextField();jtf2=new JTextField();jtf3=new JTextField();jtf4=new JTextField();jtf5=new JTextField();jtf6=new JTextField();jtf7=new JTextField();jtf8=new JTextField();jtf9=new JTextField();
         // Initialise Buttons 
         jbt1=new JButton("Result");jbt2=new JButton("SAVE");jbt3=new JButton("Refresh");jbt4=new JButton("View");

         // Set the font 
        jlb1.setFont(f);jlb2.setFont(f);jlb3.setFont(f);jlb4.setFont(f);jlb5.setFont(f);jlb6.setFont(f);jlb7.setFont(f);jlb8.setFont(f);jlb9.setFont(f);jlb10.setFont(f);jtf1.setFont(f);jtf2.setFont(f);jtf3.setFont(f);jtf4.setFont(f);jtf5.setFont(f);jtf6.setFont(f);jtf7.setFont(f);jtf8.setFont(f);jtf9.setFont(f);
        jbt1.setFont(f);jbt2.setFont(f);jbt3.setFont(f);jbt4.setFont(f);
        // Set the fore-Color
        jlb1.setForeground(Color.red);jlb2.setForeground(Color.DARK_GRAY);jlb3.setForeground(Color.DARK_GRAY);
        jlb4.setForeground(Color.DARK_GRAY);jlb5.setForeground(Color.DARK_GRAY);jlb6.setForeground(Color.DARK_GRAY);
        jlb7.setForeground(Color.DARK_GRAY);jlb8.setForeground(Color.DARK_GRAY);jlb9.setForeground(Color.darkGray);jlb10.setForeground(Color.DARK_GRAY);
        
        jtf1.setForeground(Color.DARK_GRAY);jtf2.setForeground(Color.DARK_GRAY);jtf3.setForeground(Color.DARK_GRAY);jtf4.setForeground(Color.DARK_GRAY);jtf5.setForeground(Color.DARK_GRAY);jtf5.setForeground(Color.DARK_GRAY);jtf5.setForeground(Color.darkGray);jtf5.setForeground(Color.darkGray);jtf5.setForeground(Color.DARK_GRAY);
        jbt1.setForeground(Color.red);jbt2.setForeground(Color.red);jbt3.setForeground(Color.red);jbt4.setForeground(Color.red);

        //set the bounds
        jlb1.setBounds(500,50,100,30);
        jlb2.setBounds(200,100 , 100, 30);
        jlb2.setBounds(200,150,100,30);
        jlb3.setBounds(200,200,100,30);
        jlb4.setBounds(200,250,100,30);
        jlb5.setBounds(200,300,100,30);
        jlb6.setBounds(200,350,100,30);
        jlb7.setBounds(200,400,100,30);
        jlb8.setBounds(200,450,100,30);
        jlb9.setBounds(200,500,100,30);
        jlb10.setBounds(200,550,100,30);

        jtf1.setBounds(400,150,200,30);
        jtf2.setBounds(400,200,200,30);
        jtf3.setBounds(400,250,100,30);
        jtf4.setBounds(400,300,100,30);
        jtf5.setBounds(400,350,100,30);
        jtf6.setBounds(400,400,100,30);
        jtf7.setBounds(400,450,100,30);
        jtf8.setBounds(400,500,100,30);
        jtf9.setBounds(400,550,100,30);
        // jtf10.setBounds(400,250,100,30);
        jbt1.setBounds(300, 700, 150, 30);
        jbt2.setBounds(500, 700, 150, 30);
        jbt3.setBounds(700, 700, 150, 30);
        jbt4.setBounds(900, 700, 150, 30);
         // Add ActionListener
       
         jbt1.addActionListener(this);
         jbt2.addActionListener(this);
         jbt3.addActionListener(this);
         jbt4.addActionListener(this);
         //add all components to cp
         cp.add(jlb1);cp.add(jlb2);cp.add(jlb3);cp.add(jlb4);cp.add(jlb5);cp.add(jlb6);cp.add(jlb7);cp.add(jlb8);cp.add(jlb9);cp.add(jlb10);
         cp.add(jtf1);cp.add(jtf2);cp.add(jtf3);cp.add(jtf4);cp.add(jtf5);cp.add(jtf6);cp.add(jtf7);cp.add(jtf8);cp.add(jtf9);
        cp.add(jbt1);cp.add(jbt2);cp.add(jbt3);cp.add(jbt4);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            sub1=Integer.parseInt(jtf3.getText().toString());
            sub2=Integer.parseInt(jtf4.getText().toString());
            sub3=Integer.parseInt(jtf5.getText().toString());
            sub4=Integer.parseInt(jtf6.getText().toString());
            sub5=Integer.parseInt(jtf7.getText().toString());

            total=sub1+sub2+sub3+sub4+sub5;
            jtf8.setText(total+"");

            per=total/5;
            jtf9.setText(per+"");



        }
        else if(ae.getSource()==jbt2)
        {
          
         // Process SAVE  button
        try
        {
       Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siya", "root","" );
        JOptionPane.showMessageDialog(this, "Connection Established");
        String inm=jtf1.getText().toString();
        int rn=Integer.parseInt(jtf2.getText().toString());
        st=con.createStatement();
         String qry="insert into marksheet(stu_name,Roll_no,sub1,sub2,sub3,sub4,sub5,total,per) values('"+inm+"',"+rn+","+sub1+","+sub2+","+sub3+","+sub4+","+sub5+","+total+","+per+")";
         st.execute(qry);
        JOptionPane.showMessageDialog(this, "Data Inserted");
        st.close();
        con.close();
        }
        catch(SQLException sql)
        {
            sql.printStackTrace();
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
          
        

    }else if(ae.getSource()==jbt3)
    {
        // Process Referesh Button 
        // jcb1.setSelectedIndex(0);
        jtf1.setText(null);
        jtf2.setText(null);
        jtf3.setText(null);
        jtf4.setText(null);
        jtf5.setText(null);
        jtf6.setText(null);
        jtf7.setText(null);
        jtf8.setText(null);
        jtf9.setText(null);
        // jtf10.setText(null);


    }
    else if(ae.getSource()==jbt4)
    {
      // Process VIEW  button
        try
        {
            Font f=new Font("arial",Font.BOLD,20);
          Statement st1;
          ResultSet rs1;
       Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siya", "root","" );
        JOptionPane.showMessageDialog(this, "Connection Established");
        // String inm=jcb1.getSelectedItem().toString();
        st=con.createStatement();
        st1=con.createStatement();
        String qry="select * from marksheet";
         rs=st.executeQuery(qry);
       // JOptionPane.showMessageDialog(this, "Data Inserted");
         rs1=st1.executeQuery("Select count(*) from  marksheet");
		rs1.next();
		int rows=rs1.getInt(1);
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();
		String [][] data=new String [rows+1][cols];
		String [] head=new String[cols];
		int x=0;
		for(int y=0;y<cols;y++)
		{
		head[y]=rsmd.getColumnName(y+1);
		}
		x++;
		while(rs.next())
		{
		 for(int y=0;y<cols;y++)
		 {
			data[x][y]=rs.getString(y+1);
		 }
		   x++;
		}
		jt=new JTable(data,head);
		jt.sizeColumnsToFit(21);
		jt.setRowHeight(30);
		jt.setAutoResizeMode(0);
		jt.setEnabled(false);
                                            jt.setFont(f);
                                            jt.setForeground(Color.red);
                                           
                             JScrollPane jsp=new JScrollPane(jt);
                             jsp.setBounds(600, 350, 500, 300);
                
                
               // jt.setBounds(300, 500, 600, 600);
                                             cp.add(jsp);
		rs1.close();
		rs.close();
		st1.close();
		st.close();
                                con.close();
            
 
     }
        catch(SQLException sql)
        {
            sql.printStackTrace();
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
        
    }
    
    
    
    }
    
    
    public static void main(String[] args) {
        new A2("Result");

    }
    
}



