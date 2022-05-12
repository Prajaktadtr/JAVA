//Method to encrypt data decrypt data
import java.lang.*;
import java.util.*;

class MyEncryption
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        MyEncryption me=new MyEncryption();
        String estr=me.encry_decry(str);

        // String estr=me.encry_decry(str);
        System.out.println("original string   "+str+"encrypted string   "+estr);
        // str=me.encry_decry(estr);
        // System.out.println("encrypted string  "+estr+"original string  "+str);

    }
    //method to encrypt decrypt
    public String encry_decry(String str)
    {
        String estr="";
        for(int i=0;i<str.length();i++)
        {
            int n=str.charAt(i);
            if(n>=65 && n<78)
            n+=13;
            else if(n>78 && n<92)
            n-=13;
            else if(n>=97 && n<110)
            n+=13;
            else if(n>=48 && n<53)
            n+=5;
            else if(n>=53 && n<58)
            n-=5;
            estr+=(char)n;
        }
        return estr;
    }
}