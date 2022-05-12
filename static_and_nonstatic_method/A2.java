/*write a static program to read a no and print digital sum
i.p 1234 , o.p - 10*/

import java.lang.*;
import java.util.*;

class A2
{
    public static int dsum(int n)
    {
int i,sum=0;
while(n>0)
{
    i=n%10;
    sum=sum+i;
    n=n/10;
}

return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        System.out.println("no is"+n+"digital sum of a number is"+dsum(n));
    }
}
