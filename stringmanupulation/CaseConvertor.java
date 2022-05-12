//method to convert case
import java.lang.*;
import java.util.*;

class CaseConvertor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        CaseConvertor cc =new CaseConvertor();
        String cstr = cc.changeCase(str);
        System.out.println("oringinal String"+str+"change case string"+cstr);

    }
    public String changeCase(String str)
    {
        String cstr="";
        for (int i=0;i<str.length();i++)
        {
            int n=(int)str.charAt(i);
            if(n>65 && n<97)
            n+=32;
            else if(n>97 && n<123)
            n-=32;
            cstr+=(char)n;

        }//end of loop
        return cstr;
    }
}