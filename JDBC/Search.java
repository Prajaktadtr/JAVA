/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Axiom Director
 */
public class Search extends JFrame implements ActionListener{
      JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7;
    JComboBox jcb1;
    JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6;
    JButton jbt1,jbt2;
     
    
    
    Container cp;
        Connection con=null; // Establishes Connectivity
        Statement st=null; // Executes Query on Establish Connection 
        ResultSet rs=null; 
        public Search(String title)
    {
        super(title);
        this.setSize(1200, 1200);
        cp=getContentPane();
        cp.setBackground(Color.cyan);
        cp.setLayout(null);
        Font f=new Font("arial",Font.BOLD,20);
        jlb1=new JLabel("Search Demo");
        jlb2=new JLabel("Item Name ");
        jlb3=new JLabel("Unit Price");
        jlb4=new JLabel("Quantity");
        jlb5=new JLabel("Price");
        jlb6=new JLabel("Discount ");
        jlb7=new JLabel("Net Price ");
        // Initialise Combo for Items 
        jcb1=new JComboBox();
        jcb1.addItem("Select Serial No ");
       try
        {
       Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb18may", "root","" );
        JOptionPane.showMessageDialog(this, "Connection Established");
        st=con.createStatement();
         String qry="select srno from  item_bill";
         rs= st.executeQuery(qry);
         while(rs.next())
         {
               jcb1.addItem(rs.getString(1));
         }
         rs.close();
                
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
    
        // Initialise Text Fields
        jtf1=new JTextField();jtf2=new JTextField();jtf3=new JTextField();jtf4=new JTextField();jtf5=new JTextField();jtf6=new JTextField();
        // Initialise Buttons 
       jbt1=new JButton("Update");jbt2=new JButton("Delete");
// Set the font 
        jlb1.setFont(f);jlb2.setFont(f);jlb3.setFont(f);jlb4.setFont(f);jlb5.setFont(f);jlb6.setFont(f);jlb7.setFont(f);
        jcb1.setFont(f);jtf1.setFont(f);jtf2.setFont(f);jtf3.setFont(f);jtf4.setFont(f);jtf5.setFont(f);jtf6.setFont(f);
       jbt1.setFont(f);jbt2.setFont(f);
        // Set the fore-Color
        jlb1.setForeground(Color.red);jlb2.setForeground(Color.red);jlb3.setForeground(Color.red);
        jlb4.setForeground(Color.red);jlb5.setForeground(Color.red);jlb6.setForeground(Color.red);jlb7.setForeground(Color.red);
        jcb1.setForeground(Color.red);
        jtf1.setForeground(Color.red);jtf2.setForeground(Color.red);jtf3.setForeground(Color.red);jtf4.setForeground(Color.red);jtf5.setForeground(Color.red);jtf6.setForeground(Color.red);
       jbt1.setForeground(Color.red);jbt2.setForeground(Color.red);
        
    // Set the bounds 
        jlb1.setBounds(600,50,300,30);
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
         jlb7.setBounds(350,400,300,30);
         jtf6.setBounds(700, 400, 300, 30);
       jbt1.setBounds(500, 500, 200, 30);
       jbt2.setBounds(750, 500, 200, 30);
// Add ActionListener
        jcb1.addActionListener(this);
       jbt1.addActionListener(this);
       jbt2.addActionListener(this);
// Add all Components to Cp
        cp.add(jlb1);cp.add(jlb2);cp.add(jlb3);cp.add(jlb4);cp.add(jlb5);cp.add(jlb6);cp.add(jlb7);
        cp.add(jcb1);cp.add(jtf1);cp.add(jtf2);cp.add(jtf3);cp.add(jtf4);cp.add(jtf5);cp.add(jtf6);
        cp.add(jbt1);cp.add(jbt2);
        
        
        
    this.setVisible(true);
    }
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==jcb1)
            {
                String sr=jcb1.getSelectedItem().toString();
                int sn=Integer.parseInt(sr);
                 try
        {
       Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb18may", "root","" );
        JOptionPane.showMessageDialog(this, "Connection Established");
        st=con.createStatement();
         String qry="select * from  item_bill where srno="+sn+" ";
         rs= st.executeQuery(qry);
         if(rs.next())
         {
               jtf1.setText(rs.getString(2));
               jtf2.setText(rs.getString(3));
               jtf3.setText(rs.getString(4));
               jtf4.setText(rs.getString(5));
               jtf5.setText(rs.getString(6));
               jtf6.setText(rs.getString(7));
         }
         rs.close();
                
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
        
        public static void main(String [] args)
        {
            new Search("Search Demo");
        }
                    
}
