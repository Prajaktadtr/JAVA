//package JDBC;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.*;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Axiom Director
 */
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Console Application to Perform JDBC 


/**
 *
 * @author Axiom Director
 */
public class TestJDBC {
    
    public static void main(String [] args)
    {
        try
        {
        Connection con=null; // Establishes Connectivity
        Statement st=null; // Executes Query on Establish Connection 
        ResultSet rs=null; // Holds the result of executed Query
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name :");
        String nm=br.readLine();
        System.out.println("Enter Roll No :");
        int rn=Integer.parseInt(br.readLine());
        System.out.println("Enter Marks Obtained :");
        int mark=Integer.parseInt(br.readLine());
    
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testaxiom", "root","");
        System.out.println("Connection Established to server");
        st=con.createStatement();
       String qry="insert into stud_marks(name,roll_no,marks) values('"+nm+"',"+rn+","+mark+")";
        st.execute(qry);  // Executes void query
        System.out.println("Data Inserted");
      
        // Code to Fetch the data from Data Base
        String qry1="select * from stud_marks";
        rs=st.executeQuery(qry1); // Executes a Query which returns result
        System.out.println("List of Students ");
        System.out.println("Sr no     Name       Roll_no       Marks ");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"         "+rs.getInt(3)+"         "+rs.getInt(4) );
        }
        rs.close();
 
        st.close(); // Close the Statement 
        con.close(); // Close the Connection 
            
        }
         catch(IOException ioe) // Catches IO Exception 
        {
            ioe.printStackTrace();
        }
        catch(SQLException sql) // Catches SQLException 
        {
            sql.printStackTrace();
        }
        catch(Exception exc) // Catches General Exceptions 
        {
            exc.printStackTrace();
        }
    }
    

}
    
    
    

