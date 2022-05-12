/*write a complete oop to Read a four digit no to convert it into alphabets
i.p 1234
o.p One Two Three Four*/

import java.lang.*;
import java.util.*;
class A4
{
    int n;

    public A4(int n)
    {
        this.n=n;
    }

    void read()
    {
        int sum=0,r=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        n=sum;
        while(n>0)
        {
            r=n%10;
            switch(r)
            {
                case 0:
                System.out.println("zero");
                break;
                case 1:
                System.out.println("One");
                break;
                case 2:
                System.out.println("Two");
                break;
                case 3:
                System.out.println("Three");
                break;
                case 4:
                System.out.println("Four");
                break;
                case 5:
                System.out.println("Five");
                break;
                case 6:
                System.out.println("Six");
                break;
                case 7:
                System.out.println("Seven");
                break;
                case 8:
                System.out.println("Eight");
                break;
                case 9:
                System.out.println("Nine");
                break;
                default:
                break;
                


            }
            n=n/10;
        }

            
        // return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        A4 a=new A4(n);
        System.out.println("no is "+n);
        a.read();

    }

}