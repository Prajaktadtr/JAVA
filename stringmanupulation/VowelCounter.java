//method to find vowels and consonents
import java.lang.*;
import java.util.*;

class VowelCounter
{
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        VowelCounter vc=new VowelCounter();
        System.out.println("no of vowels "+vc.vcounter(str));
        System.out.println("no of consonents "+(str.length()-vc.vcounter(str)));

    }
    public int vcounter(String str)
    {
        int vc=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' ||ch=='O' || ch=='u' || ch=='U');
            vc++;
        }
        return vc;
    }//end of method 

}//end of class