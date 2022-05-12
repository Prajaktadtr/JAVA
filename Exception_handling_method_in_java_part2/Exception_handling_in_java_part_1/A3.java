//3. Read a four digit no to convert it into alphabet by handling all possible exceptions.
import java.lang.*;
import java.util.*;
class A3
{
    int n;

    public A3(int n)
    {
        this.n=n;
    }

    void read()
    {
        int sum=0,r=0;
        try{
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
    }catch (ArithmeticException e) { 
        /* This block will only execute if any Arithmetic exception 
         * occurs in try block
         */
        System.out.println("You should not divide a number by zero");
     }
     catch (Exception e) {
        /* This is a generic Exception handler which means it can handle
         * all the exceptions. This will execute if the exception is not
         * handled by previous catch blocks.
         */
        System.out.println("Exception occurred");
     }
     System.out.println("I'm out of try-catch block in Java.");

            
        // return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        A3 a=new A3(n);
        System.out.println("no is "+n);
        a.read();

    }

}