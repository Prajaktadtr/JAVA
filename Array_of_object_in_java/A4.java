/*2. Construct a Complex class with consist property int real, float img .
Add two Complex objects to form the third resultant one.
e.g.
 Complex c1=new Complex(2,0.45);
 Complex c2=new Complex(3,0.75);
Complex c3=new Complex();
 c3=c1+c2;*/

import java.lang.*;
import java.util.*;
class complex
{

    int real;
    int img;
    complex(){}

complex(int a,int b)
{
    this.real=a;
    this.img=b;
}
complex addcomp(complex C1,complex C2)
{
    complex C3=new complex();
    C3.real=C1.real+C2.real;
    C3.img=C1.img+C2.img;
    return C3;
}
}
class A4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        complex C1=new complex(2,45);
        System.out.println("complex number 1:"+C1.real+"+i"+C1.img);
        complex C2=new complex(3,75);
        System.out.println("complex no 2 :"+C2.real+"+i"+C2.img);

        complex C3=new complex();
        
        C3=C3.addcomp(C1,C2);
        System.out.println("sum of complex number :"+C3.real+"+i"+C3.img);


    }
}

