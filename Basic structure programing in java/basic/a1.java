// 1. Read any 3 nos from user to find sum, avg, max, min
import java.lang.*;
import java.util.*;

class a1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a first no");
        int a=sc.nextInt();
        System.out.println("enter second no i ");
        int b=sc.nextInt();
        System.out.println("enter third no" );
        int c=sc.nextInt();
        System.out.println("first no is a :\n"+a+ "\nsecond no is b :"+b+ "\nthird no is c :"+c);
        int sum=0;
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
// int count=0,s=0,num=0,min=0,max=0;
// while(count<3)
// {
//     num=sc.nextInt();
//     s+=num;
//     count++;
// }
// if(num>max)
// {
//     max=num;
// }
// if(num<min)
// {
//     min=num;
// }
// System.out.println("max is"+max);
// System.out.println("min is"+min);


    }
}
