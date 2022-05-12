//a method for reversing a given string
import java.lang.*;
import java.util.*;

class RevString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        RevString rs=new RevString();
        String rstr=rs.reverse(str);
        System.out.println("original string   "+str+"reverse string  "+rstr);

    
    }
    //non static method to reversing a string
    public String reverse(String str)
    {
        String rstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rstr+=str.charAt(i);
            
        }
        return rstr;
    }//end of method
}//end of class

