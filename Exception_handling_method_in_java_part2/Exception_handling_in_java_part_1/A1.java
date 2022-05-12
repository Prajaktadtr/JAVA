/*1. Read 3 nos from user by scanning value of 3 from user.
Compute sum,avg,max,min from them .
Handel all the possible exceptions raised... */

import java.lang.*;
import java.util.*;
class A1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int[] num;
       int number[]=new int[10];//array declaration
       
       
        System.out.println("enter a first no");
        int a=sc.nextInt();
        System.out.println("enter second no i ");
        int b=sc.nextInt();
        System.out.println("enter third no" );
        int c=sc.nextInt();
        System.out.println("first no is a :\n"+a+ "\nsecond no is b :"+b+ "\nthird no is c :"+c);
        int sum=0;
        try
        {
            sum=a+b+c;
            System.out.println("sum of three no is"+sum);
            float avg=0;
            avg=sum/3;
            System.out.println("\navg of three no is "+avg);
            if(a>b && a>c)
            {
                System.out.println(a+"is greater\n");
                
            }
            else if(b>a && b>c)
            {
                System.out.println(b+"is greater\n");
    
            }
            else if (c>a && c>b)
            {
                System.out.println(c+"is greater\n");
    
            }
            if(a<b && a<c)
            {
            System.out.println(a+"is min\n");
            }
            else if(b<a && b<c)
            {
                System.out.println(b+"is min\n");
    
            }
            else if(c<a && c<b)
            {
                System.out.println(c+"is min\n");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Warning: ArithmeticException");
        }
        catch(Exception e){
            System.out.println("Warning: Some Other exception");
         }
       System.out.println("Out of try-catch block...");
    
    }

}