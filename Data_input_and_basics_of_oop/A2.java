//write a complete oop program to read a no to cheack armstrong
import java.lang.*;
import java.util.*;

class A2
{
    int n;
    public A2(int n)
    {
        this.n=n;
    }
    public int arm()
    {
      int sum=0,rem,c;
      c=n;
    while(n!=0)
   {
    rem=n%10;
    sum=sum+(rem*rem*rem);
    n=n/10;
  }
  if(c==sum)
 {
    System.out.println("given no is armstrong no");
// return 1;
 }
 else 
 {
    System.out.println("given no is not an armstrong no");
    // return 0;
 }
 return 0;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        int n=sc.nextInt();
        A2 a=new A2(n);
        System.out.println("no is "+n);
        System.out.println(+a.arm());
    }
}