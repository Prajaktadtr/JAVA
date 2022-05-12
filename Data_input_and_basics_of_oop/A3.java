//write a complete oop to read a no to check prime
import java.lang.*;
import java.util.*;

class A3
{
    int n;
    public  A3(int n)
    {
        this.n=n;
    }
    public int prime()
    {//process for finding prime no
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
    
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        A3 a=new A3(n);
        System.out.println(+a.prime());
    }
}