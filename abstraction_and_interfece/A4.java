//Write an abstract methods to do the same to find area of Triangle.
import java.lang.*;
import java.util.*;

interface Triangle
{
    public abstract void f1();
    public abstract void f2();
    public abstract void f3();
    public abstract void f4();

}
class Area implements Triangle
{
    int l,b;
    double area;
    Scanner sc=new Scanner(System.in);
    public void f1()
    {
        System.out.println("enter  perpendicular length of triangle");
        l=sc.nextInt();
        System.out.println("length is :"+l);
    }
    public void f2()
    {
        System.out.println("enter base of triangle");
        b=sc.nextInt();
        System.out.println("base of a triangle "+b);
    }
    public void f3()
    {
        System.out.println("area of triangle is");

    }
    public void f4()
    {
        area=0.5*b*l;
        System.out.println("area of triangle    "+area);
    }

}
class A4
{
    public static void main(String[] args)
    {
        Area a=new Area();
        a.f1();
        a.f2();
        a.f3();
        a.f4();
    }
}