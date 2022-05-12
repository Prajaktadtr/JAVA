/*Consider a String "Welcome to Axiom TechGuru Pvt. Ltd"
Compute - total no of characters in a String
- Total no of vowels
- Total No of Consonants*/
import java.lang.*;
import java.util.*;


class A5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        A5 vc=new A5();
        System.out.println("no of vowels"+vc.vcounter(str));
        System.out.println("no of consonents"+(str.length()-vc.vcounter(str)));

    }
    public int vcounter(String str)
    {
            int vc=0;
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U')
                vc++;

            }
            return vc;
       
    }
}