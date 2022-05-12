//create a bill for garments


package JDBC;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
// import java.sql.*;

public class A5 extends JFrame implements ActionListener{

    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7;
    JComboBox jcb1,jcb2;
    JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
    JButton jbt1,jbt2,jbt3,jbt4;
    JTable jt=null;
    Container cp;
   /* Connection con=null;//Establishes connectivity
    Statement st=null;//Execute query on establish connection
    ResultSet rs=null;//holds the result of extecuted query*/
    Connection con=null; // Establishes Connectivity
    Statement st=null; // Executes Query on Establish Connection 
    ResultSet rs=null; // Holds the result of executed Query
    //Global declartion of variable
    int up,qty,pr;
    float dis,netp;


    public A5(String title)
    {
        super(title);
        this.setSize(1200,1000);
        cp=getContentPane();
        cp.setBackground(Color.white);
        cp.setLayout(null);
        Font f=new Font("arial",Font.BOLD,20);

        jlb1=new JLabel("Bill");
        jlb2=new JLabel("Unit Price");
        jlb3=new JLabel("Quantity");
        jlb4=new JLabel("Price");
        jlb5=new JLabel("Discount");
        jlb6=new JLabel("NetPrice");
        jlb7=new JLabel(new ImageIcon("JDBC/img/i.jpg"));

    //initialise combo for Items
    jcb1=new JComboBox();
    jcb1.addItem("Select any garment below");
    jcb1.addItem("T-shirt");
    jcb1.addItem("Shirt");
    // jcb1.addItem("kurti");
    // jcb1.addItem("Jeans");

    jcb2=new JComboBox();
    jcb2.addItem("Select size");
    jcb2.addItem("S");
    jcb2.addItem("M");
    jcb2.addItem("L");
    jcb2.addItem("Xl");

    //initialize the text fields
    jtf1=new JTextField();
    jtf2=new JTextField();
    jtf3=new JTextField();
    jtf4=new JTextField();
    jtf5=new JTextField();
    //initialize the buttons
    jbt1=new JButton("Submit");
    jbt2=new JButton("Save");
    jbt3=new JButton("Refreash");
    jbt4=new JButton("View Bill");

    //set the fonts
    jlb1.setFont(f);jlb2.setFont(f);jlb3.setFont(f);jlb4.setFont(f);jlb5.setFont(f);jlb6.setFont(f);
    jtf1.setFont(f);jtf2.setFont(f);jtf3.setFont(f);jtf4.setFont(f);jtf5.setFont(f);
    jcb1.setFont(f);jcb2.setFont(f);
    jbt1.setFont(f);  jbt2.setFont(f);  jbt3.setFont(f);  jbt4.setFont(f);

    //set the foreGound color
    jlb1.setForeground(Color.red);jlb2.setForeground(Color.DARK_GRAY);jlb3.setForeground(Color.DARK_GRAY);jlb4.setForeground(Color.DARK_GRAY);jlb5.setForeground(Color.DARK_GRAY);jlb6.setForeground(Color.DARK_GRAY);
    jtf1.setForeground(Color.DARK_GRAY);jtf2.setForeground(Color.DARK_GRAY);jtf3.setForeground(Color.DARK_GRAY);jtf4.setForeground(Color.DARK_GRAY);jtf5.setForeground(Color.DARK_GRAY);
    jcb1.setForeground(Color.DARK_GRAY);jcb2.setForeground(Color.DARK_GRAY);
    jbt1.setForeground(Color.red);jbt2.setForeground(Color.red);jbt3.setForeground(Color.red);jbt4.setForeground(Color.red);


    //set the bounds
    jlb1.setBounds(550,50,100,30);
    jlb2.setBounds(100,200,100,30);
    jlb3.setBounds(100,250,100,30);
    jlb4.setBounds(100,300,100,30);
    jlb5.setBounds(100,350,100,30);
    jlb6.setBounds(100,400,100,30);
    jlb7.setBounds(500,200,300,300);


    jtf1.setBounds(300,200,100,30);
    jtf2.setBounds(300,250,100,30);
    jtf3.setBounds(300,300,100,30);
    jtf4.setBounds(300,350,100,30);
    jtf5.setBounds(300,400,100,30);

    jcb1.setBounds(300,100,350,30);
    jcb2.setBounds(700,100,150,30);


    jbt1.setBounds(300,500,150,30);
    jbt2.setBounds(500,500,150,30);
    jbt3.setBounds(700,500,150,30);
    jbt4.setBounds(900,500,150,30);

    jcb1.addActionListener(this);
    jcb2.addActionListener(this);

    jbt1.addActionListener(this);
    jbt2.addActionListener(this);
    jbt3.addActionListener(this);
    jbt4.addActionListener(this);

    cp.add(jlb1);cp.add(jlb2);cp.add(jlb3);cp.add(jlb4);cp.add(jlb5);cp.add(jlb6);cp.add(jlb7);
    cp.add(jtf1); cp.add(jtf2); cp.add(jtf3); cp.add(jtf4); cp.add(jtf5);
    cp.add(jcb1);cp.add(jcb2);
    cp.add(jbt1);cp.add(jbt2);cp.add(jbt3);cp.add(jbt4);

    this.setVisible(true);






    }
    public void actionPerformed(ActionEvent ae)
    {

        if(ae.getSource()==jcb1 )
        {
         //process the combo event
           if(jcb1.getSelectedItem().toString().equals("T-shirt") )
           {
             jtf1.setText("1000");
              jlb7.setIcon(new ImageIcon(getClass().getResource("img/1.png")));
            }
           else if(jcb1.getSelectedItem().toString().equals("Shirt"))
           {  
             jtf1.setText("1500");
             jlb7.setIcon(new ImageIcon(getClass().getResource("img/S.jpg")));
            }

        }
       else if(ae.getSource()==jbt1)
        {
        
            //process the submit button
            up=Integer.parseInt(jtf1.getText().toString());
        qty=Integer.parseInt(jtf2.getText().toString());
        pr=up*qty;
        jtf3.setText(pr+"");
        if(pr>=1000)
        {
        dis=(float) pr*.05f;
        jtf4.setText(dis+"");
        }else{
            dis=0;
            jtf4.setText(dis+"");
        }
        netp=(float) pr-dis;
        jtf5.setText(netp+"");

        }
        else if(ae.getSource()==jbt2)
        {
            //process the save button
            try
            {
           Class.forName("com.mysql.jdbc.Driver");
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siya", "root","" );
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siya", "root","" );
            JOptionPane.showMessageDialog(this, "Connection Established");
            String inm=jcb1.getSelectedItem().toString();
            st=con.createStatement();
             String qry="insert into gb(name,unit_pr,qty,tot_price,disc,net_pr) values('"+inm+"',"+up+","+qty+","+pr+","+dis+","+netp+")";
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
            jcb2.setSelectedIndex(0);
            jtf1.setText(null);
            jtf2.setText(null);
            jtf3.setText(null);
            jtf4.setText(null);
            jtf5.setText(null);
            jlb7.setIcon(new ImageIcon(getClass().getResource("img/i.jpg")));
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
            String qry="select * from gb";
             rs=st.executeQuery(qry);
           // JOptionPane.showMessageDialog(this, "Data Inserted");
             rs1=st1.executeQuery("Select count(*) from  gb");
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
                                                jt.setForeground(Color.DARK_GRAY);
                                               
                                 JScrollPane jsp=new JScrollPane(jt);
                                 jsp.setBounds(300, 650, 800, 300);
                    
                    
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
        new A5("Garment Bill");
        }
        
    
    
    
    
    
    
}