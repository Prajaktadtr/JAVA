//1.construct a class Abc with a as a integer property.
//create an array object with 10 subscripts
//Initialize the value of each object and compute total, avrage, max,min from array properties

import java.lang.*;
import java.util.*;
class Abc{

    int a[];//integer array a private data

    Abc(){}//default constructor
    
    
    public Abc(int a[])//parameterized constructor
    {
        this.a=a;
    }

    public  String toString()
    {
      return "int value"+this.a;
    }
public Abc calc(Abc p)
{
    Abc r=new Abc();
    int total=0;
    int max=0;
    int min=99999;
    for(int i=0;i<10;i++)
    {
        total+=a[i];
        if(max<a[i])
        max=a[i];
        if(min>a[i])
        min=a[i];
    }
    System.out.println("sum of array subscripts is "+total);
        System.out.println("average of array of subscript "+(double)total/10);
        System.out.println("minimum of array subscripts is "+min);
        System.out.println("maximum array subscript "+max);
    return r;

}
}
class A1{
    public static void main(String[] args)
    {
        Abc a1=new Abc();
        System.out.println("a1 object :"+a1);

    } 
}