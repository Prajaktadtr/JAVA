/*Write a Complete OOP code for the following
1. Read a no to print reverse*/

import java.lang.*;
import java.util.*;

class A1
{
    int n;
    public A1(int n)
{
this.n=n;
}
public int rev()
{
    int reverse=0,rem=0;
    while(n!=0)
    {
        rem=n%10;
        reverse=reverse*10+rem;
        n=n/10;
    }
    System.out.println("reverse of a no is  "+reverse);
    return reverse;
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a no:");
    int n=sc.nextInt();
    A1 r=new A1(n);
    System.out.println("no is"+n+"reverse of a no is"+r.rev());
}
}