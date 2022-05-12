/*3. Prove an Expression
D=5*A+3*B+7*C */

import java.lang.*;
 import java.util.*;
 
 class A //defination of class
{
    int a;
    public A(int a)
    {
        this.a=a;
    }
    public int getA()
    {
        return this.a;
    }
     
 }

 class B extends A //defination of B class
 {
     int b;
   
     public B(int a,int b)
     {
     super(a);
     this.b=b;
     }
     
 
 public int getB()
 {
     return this.b;
 }
}


class C extends B
{
    int c;
    public C(int a, int b, int c)
    {
        super(a,b);
        this.c=c;
    }
    public int getC()
    {
        return this.c;
    }
}

class D extends C
{
    int d;
    public D(int a,int b,int c,int d)
    {
        super(a,b,c);
        this.d=d;
    }
    public int getC()
    {
        return this.c;
    }
    public String toString()
    {
        return "a :"+getA()+"b :"+getB()+"c :"+getC()+"d :"+this.d;
    }
    public int sum()
    {
        int u;
        // d=a+b+c;
       if(d==5*a+3*b+7*c)
       {
           System.out.println("L.H.S=R.H.S  hence proved");
       }
       else
       {
           System.out.println("L.H.S!=R.H.S");


       }
       return 0;
    
    }
}
class A3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first no");
        int a=sc.nextInt();
        System.out.println("enter a second no");
        int b=sc.nextInt();
        System.out.println("enter a third no");
        int c=sc.nextInt();
        System.out.println("enter a fourth no");
        int d=sc.nextInt();
        

        D obj=new D(a,b,c,d);
        obj.sum();
    }
}