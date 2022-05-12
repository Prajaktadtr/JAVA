/*2. Modify console application to generate Frame based GUI to compute marksheet and save data to
table*/
 
/*3. Create an Item Bill console application to read item name, unit price, quantity to compute price, disc,
netprice to store and display at least 10 items bill*/

import java.lang.*;
import java.io.*;
import java.sql.*;

public class A3
{

    public static void main(String []args)
    {
        try{
            Connection con=null;//establish connectivity
            Statement st=null;//execute query on establish connection
            ResultSet rs=null;//holds the result of the executed query

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter item name ");
            String nm=br.readLine();
            
            System.out.println("enter price of each item :");
            int pr=Integer.parseInt(br.readLine());

            System.out.println("quantity");
            int q=Integer.parseInt(br.readLine());

            int total=pr*q;
            float dis=total*0.05f;
            float netp=total-dis;


            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siya", "root","");
        System.out.println("Connection Established to server");
        st=con.createStatement();
        String qry="insert into bill(item_name,price,quantity,total,dis,netp)values('"+nm+"',"+pr+","+q+","+total+","+dis+","+netp+")";
        st.execute(qry);
        System.out.println("Data Inserted");
        
        //code to fetch the data from Data Base
        String qry1="select * from bill";
        rs=st.executeQuery(qry1);//Executes a query which returns result
        System.out.println("list of items");
        System.out.println("Sr_no   item_bill   price   quantity    total   dis   netp");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"        "+rs.getString(2)+"         "+rs.getInt(3)+"          "+rs.getInt(4)+"           "+rs.getInt(5)+"           "+rs.getString(6)+"         "+rs.getInt(7));

        }
        rs.close();

        st.close();//close the statement
        con.close();//close the connection


        }catch(IOException ioe)
        {
            ioe.printStackTrace();
        }catch(SQLException sql)
        {
            sql.printStackTrace();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}