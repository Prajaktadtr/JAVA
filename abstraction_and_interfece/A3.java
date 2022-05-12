/*3. Create an Interface Shape which will have abstract method for area, diameter, and circumference.
Construct a class Circle and implement an Interface Shape in it find out area, diameter, and
circumference on given radius.*/
import java.lang.*;
import java.util.*;

interface Shape{
    public abstract void f1();
    public abstract void f2();
    public abstract void f3();
    public abstract void f4();

}
class Circle implements Shape
{
    int r,d;
    double area,circumference;
    Scanner sc=new Scanner(System.in);
    public void f1()
    {
        System.out.println("enter radius of a circle");
        r=sc.nextInt();
        System.out.println("radius of a circle "+r);
        
    }
    public void f2()
    {
        d=2*r;
        System.out.println("diameter of a circle  "+d);
    }
    public void f3()

    {
        circumference=2*3.14*r;
        System.out.println("circumference of a circle "+circumference);
       

    }
    public void f4()
    {
        area=3.14*(r*r);
    
        System.out.println("area of circle "+area);
    }
}
class A3
{
    public static void main(String[] args)
    {
        Circle c=new Circle();
        c.f1();
        c.f2();
        c.f3();
        c.f4();

    }
}