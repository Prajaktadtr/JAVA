//2. Construct an Abstract Class Item and extend it to Bill class to evaluate an Item Bill
import java.lang.*;
import java.util.*;

abstract class Item
{
    public abstract void f1();
    public void f2()
    {
        int i,a,b,prize,num;
        System.out.println("enter no of items");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("enter prize of items");
        prize=sc.nextInt();
        b=num*prize;
        System.out.println("bill  "+b);
    


    }
}
class Bill extends Item
{
    public void f1()
    {
        System.out.println("bill");
    }

}
class A2
{
    public static void main(String[] args)
    {
        Bill b=new Bill();
        b.f1();
        b.f2();
    }
}