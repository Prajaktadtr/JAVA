//develop a static method to* read a no check prime
import java.lang.*;
import java.util.*;

class A3
{
    public static int prime(int n)
    {
        //process for finding prime no
        int i=0,flag=0,j;
        i=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"is not a prime no");

        }
        else
        {
            for(j=2;j<=i;j++)
            {
                if(n%j==0)
                {
                System.out.println(n+"is not a prime number");
                flag=1;
                break;
                }

            }
            if(flag==0)
            {
                System.out.println(n+"number is prime");
            }

        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a nmber");
        int n=sc.nextInt();
        System.out.println(prime(n));
    }
}


