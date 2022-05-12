// read a no from user to find even or odd
import java.lang.*;
import java.util.*;
class a2
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,even=0,odd=0;
        System.out.println("enter a number");
        a=sc.nextInt();
        System.out.println(+a+"is a number");
        if(a%2==0)
        {
        System.out.println(+a+"is even");

        }
        else
        {
System.out.println(+a+"is odd");
        }


    }
}