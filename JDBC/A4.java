//4. Modify the above code to GUI based Item Bill


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package demojdbc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *-
 * @author Axiom Director
 */
public class A4 extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6;
    JComboBox jcb1;
    JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
    JButton jbt1,jbt2,jbt3,jbt4;
    JTable jt=null;
    Container cp;
        Connection con=null; // Establishes Connectivity
        Statement st=null; // Executes Query on Establish Connection 
        ResultSet rs=null; // Holds the result of executed Query
    // Global declaration of var
    int up,qty,pr;
    float dis,netp;
    
    public A4(String title)
    {
        super(title);
        this.setSize(1200, 1200);
        cp=getContentPane();
        cp.setBackground(Color.lightGray);
        cp.setLayout(null);
        Font f=new Font("arial",Font.BOLD,20);
        jlb1=new JLabel("ITEM BILl");
        jlb2=new JLabel("Unit Price");
        jlb3=new JLabel("Quantity");
        jlb4=new JLabel("Price");
        jlb5=new JLabel("Discount ");
        jlb6=new JLabel("Net Price ");
        // Initialise Combo for Items 
        jcb1=new JComboBox();
        jcb1.addItem("Select Any Item Below");
        jcb1.addItem("Pen");
        jcb1.addItem("NoteBook");    
        jcb1.addItem("Thinking in Java");
        // Initialise Text Fields
        jtf1=new JTextField();jtf2=new JTextField();jtf3=new JTextField();jtf4=new JTextField();jtf5=new JTextField();
        // Initialise Buttons 
        jbt1=new JButton("Calc");jbt2=new JButton("SAVE");jbt3=new JButton("Refresh");jbt4=new JButton("View");
// Set the font 
        jlb1.setFont(f);jlb2.setFont(f);jlb3.setFont(f);jlb4.setFont(f);jlb5.setFont(f);jlb6.setFont(f);
        jcb1.setFont(f);jtf1.setFont(f);jtf2.setFont(f);jtf3.setFont(f);jtf4.setFont(f);jtf5.setFont(f);
        jbt1.setFont(f);jbt2.setFont(f);jbt3.setFont(f);jbt4.setFont(f);
        // Set the fore-Color
        jlb1.setForeground(Color.red);jlb2.setForeground(Color.red);jlb3.setForeground(Color.red);
        jlb4.setForeground(Color.red);jlb5.setForeground(Color.red);jlb6.setForeground(Color.red);
        jcb1.setForeground(Color.red);
        jtf1.setForeground(Color.red);jtf2.setForeground(Color.red);jtf3.setForeground(Color.red);jtf4.setForeground(Color.red);jtf5.setForeground(Color.red);
        jbt1.setForeground(Color.red);jbt2.setForeground(Color.red);jbt3.setForeground(Color.red);jbt4.setForeground(Color.red);
    // Set the bounds 
        jlb1.setBounds(300,50,300,30);
        jcb1.setBounds(500,100,300, 30);
        jlb2.setBounds(350,150,300,30);
        jtf1.setBounds(700, 150, 300, 30);
        jlb3.setBounds(350,200,300,30);
        jtf2.setBounds(700, 200, 300, 30);
        jlb4.setBounds(350,250,300,30);
        jtf3.setBounds(700, 250, 300, 30);
        jlb5.setBounds(350,300,300,30);
        jtf4.setBounds(700, 300, 300, 30);
        jlb6.setBounds(350,350,300,30);
        jtf5.setBounds(700, 350, 300, 30);
        jbt1.setBounds(300, 400, 150, 30);
        jbt2.setBounds(500, 400, 150, 30);
        jbt3.setBounds(700, 400, 150, 30);
        jbt4.setBounds(900, 400, 150, 30);
  // Add ActionListener
        jcb1.addActionListener(this);
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);
        jbt4.addActionListener(this);
        
// Add all Components to Cp
        cp.add(jlb1);cp.add(jlb2);cp.add(jlb3);cp.add(jlb4);cp.add(jlb5);cp.add(jlb6);
        cp.add(jcb1);cp.add(jtf1);cp.add(jtf2);cp.add(jtf3);cp.add(jtf4);cp.add(jtf5);
        cp.add(jbt1);cp.add(jbt2);cp.add(jbt3);cp.add(jbt4);
        
        
        
    this.setVisible(true);
    }
    
    // Process Event 
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==jcb1)
    { // Process combo Event 
        if(jcb1.getSelectedItem().toString().equals("Pen"))
            jtf1.setText("25");
        else if(jcb1.getSelectedItem().toString().equals("NoteBook"))
            jtf1.setText("50");
        else if(jcb1.getSelectedItem().toString().equals("Thinking in Java"))
            jtf1.setText("250");
    }
    else if(ae.getSource()==jbt1)
    {
        // Process Calc Button 
        up=Integer.parseInt(jtf1.getText().toString());
        qty=Integer.parseInt(jtf2.getText().toString());
        pr=up*qty;
        jtf3.setText(pr+"");
        dis=(float) pr*.05f;
        jtf4.setText(dis+"");
        netp=(float) pr-dis;
        jtf5.setText(netp+"");
        
    }
    else if(ae.getSource()==jbt2)
    {
         // Process SAVE  button
        try
        {
       Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","" );
        JOptionPane.showMessageDialog(this, "Connection Established");
        String inm=jcb1.getSelectedItem().toString();
        st=con.createStatement();
         String qry="insert into item_bill(name,unit_pr,qty,tot_price,disc,net_pr) values('"+inm+"',"+up+","+qty+","+pr+","+dis+","+netp+")";
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
        
    }
    else if(ae.getSource()==jbt3)
    {
        // Process Referesh Button 
        jcb1.setSelectedIndex(0);
        jtf1.setText(null);
        jtf2.setText(null);
        jtf3.setText(null);
        jtf4.setText(null);
        jtf5.setText(null);
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
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","" );
        JOptionPane.showMessageDialog(this, "Connection Established");
        // String inm=jcb1.getSelectedItem().toString();
        st=con.createStatement();
        st1=con.createStatement();
        String qry="select * from item_bill";
         rs=st.executeQuery(qry);
       // JOptionPane.showMessageDialog(this, "Data Inserted");
         rs1=st1.executeQuery("Select count(*) from  item_bill");
		rs1.next();
		int rows=rs1.getInt(1);
		// rs2=st2.executeQuery("Select * from ItemMaster order by cname");
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
                             jsp.setBounds(300, 450, 800, 300);
                
                
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
        // TODO code application logic here
    new A4("A4");
    }
    
}


