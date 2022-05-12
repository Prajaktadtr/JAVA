/*Develop static methods for the following
* read a no to print reverse
i.p - 1234 , o.p -4321&*/

import java.lang.*;
import java.util.*;

class A1
{
    public static int rev(int n)
    {
//process for finding reverse of a number
int reverse=0,rem=0;
while(n!=0)
{
    rem=n%10;
    reverse=reverse*10+rem;
    n=n/10;

}
System.out.println("reverse of a no is"+reverse);
 return reverse;

    }

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a no:");
    int n=sc.nextInt();
    System.out.println("no is"+n+"reverse of no is"+rev(n));
}

}



