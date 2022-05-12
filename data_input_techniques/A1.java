/*4. Read Student name, roll no, marks obtained in 5 various subjects to find total, percentage using
buffered reader*/

import java.lang.*;
import java.io.*; //bufferedreader

class A1
{
    public static void main(String[] args)
    {
        try
        {
            InputStreamReader ip=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ip);
            System.out.println("enter student name");
            String nm=br.readLine();
            System.out.println("enter roll no");
            int Roll=Integer.parseInt(br.readLine());
            System.out.println("enter marks obtained in marathi");
            int a=Integer.parseInt(br.readLine());
            System.out.println("enter marks in hindi");
            int b=Integer.parseInt(br.readLine());
            System.out.println("enter marks in english");
            int c=Integer.parseInt(br.readLine());
            System.out.println("enter marks in math");
            int d=Integer.parseInt(br.readLine());
            System.out.println("enter marks in science");
            int e=Integer.parseInt(br.readLine());
            float total;
            total=a+b+c+d+e;
            float per;
            per= (total/500)*100;
            System.out.println("name of a student is"+nm+ "roll no of a student is"+Roll);
            System.out.println("marks in marathi"+a);
            System.out.println("marks in hindi"+b);
            System.out.println("marks in english"+c);
            System.out.println("marks in math"+d);
            System.out.println("marks in science"+e);
            System.out.println("total is "+total);
            System.out.println("percentage is "+per);


        }//end of try 
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
    }//end of main
}//end of class

