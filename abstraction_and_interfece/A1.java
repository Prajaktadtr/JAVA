/*1. Construct an Abstract Class Student and extend it to Result class to evaluate a mark sheet for a
Student */

import java.lang.*;
import java.util.*;

abstract class Student

{
    public abstract void f1();
    public void f2()
    {
    int a,b,c,d,e,t;
    double per;
    Scanner sc=new Scanner(System.in);
        System.out.println("enter first subject marks");
        a=sc.nextInt();
        System.out.println("enter second subject marks");
        b=sc.nextInt();
        System.out.println("enter third subject marks");
        c=sc.nextInt();
        System.out.println("enter fourth subject marks");
        d=sc.nextInt();
        System.out.println("enter fifth subject marks");
        e=sc.nextInt();
        t=a+b+c+d+e;
        per=t/5;
        System.out.println("result "+per);

        
    }

}
class Result extends Student
{
    public void f1()
    {
        System.out.println("over rided f1");
    }
}

class A1
{
    public static void main(String[] args)
    {
        Result r=new Result();
        r.f1();
        r.f2();

    }
}