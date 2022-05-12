/*1. Create a Console Application to read student details like name, surname, roll no, marks obtained in 5
various subjects.
Compute total, per, result, grade
* Display inserted all Student details
Store at least 5 records of student’s marksheet in a stu_details table */
import java.lang.*;
import java.io.*;
import java.sql.*;
// Console Application to Perform JDBC 

public class A1 {
    
    public static void main(String [] args){
    {
        try
        {
        Connection con=null; // Establishes Connectivity
        Statement st=null; // Executes Query on Establish Connection 
        ResultSet rs=null; // Holds the result of executed Query
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name :");
        String nm=br.readLine();
        System.out.println("Enter Roll :");
        int rn=Integer.parseInt(br.readLine());
        System.out.println("Enter  subject1 marks :");
        int sub1=Integer.parseInt(br.readLine());
        System.out.println("Enter  subject2 marks :");
        int sub2=Integer.parseInt(br.readLine());
        System.out.println("Enter  subject3 marks :");
        int sub3=Integer.parseInt(br.readLine());
        System.out.println("Enter  subject4 marks :");
        int sub4=Integer.parseInt(br.readLine());
        System.out.println("Enter  subject5 marks :");
        int sub5=Integer.parseInt(br.readLine());
            int total=sub1+sub2+sub3+sub4+sub5;
            float per=total/5;
        // System.out.println("Enter Marks Obtained :");
        // int mark=Integer.parseInt(br.readLine());
    
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siya", "root","");
        System.out.println("Connection Established to server");
        st=con.createStatement();
       String qry="insert into stu(stu_name,Roll_no,sub1,sub2,sub3,sub4,sub5,total,per) values('"+nm+"',"+rn+","+sub1+","+sub2+","+sub3+","+sub4+","+sub5+","+total+","+per+")";
        st.execute(qry);  // Executes void query
        System.out.println("Data Inserted");
      
        // Code to Fetch the data from Data Base
        String qry1="select * from stu";
        rs=st.executeQuery(qry1); // Executes a Query which returns result
        System.out.println("List of Students ");
        System.out.println("Sr_no     Name       Roll_no       sub1      sub2    sub3    sub4    sub5    total   per ");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"         "+rs.getInt(3)+"      "+rs.getInt(4)+"    "+rs.getInt(5)+"    "+rs.getInt(6)+"    "+rs.getInt(7)+"    "+rs.getInt(8)+"      "+rs.getInt(9 ));
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
}


