/*Consider a String "Welcome to Axiom TechGuru Pvt. Ltd"
- Total no of sp. characters.*/
import java.lang.*;
import java.util.*;

class A6
{

  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    int Alphabates=0,num=0,space=0,Special=0;
     char ch;

    for(int i=0; i<str.length(); i++)
    {
      ch=str.charAt(i);
      if(ch>'A' && ch<='Z' || ch>='a' && ch<='z')
      {
       Alphabates++;
      }
      else if(ch>='0' && ch<='9')
      {
        num++;
      }
      else if(ch==' ')
      {
        space++;
      }
      else
      {
        Special++;
      }
    }

    System.out.println("special charecters: "+Special);
  }
  
}
 