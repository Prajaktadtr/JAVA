/*1. Construct a class Abc with a as an integer property.
Create an array of object with 10 subscripts.
Initialize the value of each object and compute total, average, max, min from array properties.*/
import java.lang.*;
import java.util.*;

class Abc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("enter array subscripts :");
            num[i]=sc.nextInt();

        }
        for(int i=0;i<10;i++)
        {
            System.out.println("array subscripts are num["+i+"]"+num[i]);

        }
        int total=0;
        int max=0;
        int min=99999;
        for(int i=0;i<10;i++)
        {
            total+=num[i];
            if(max<num[i])
            max=num[i];
            if(min>num[i])
            min=num[i];

        } 
        System.out.println("sum of array subscripts is "+total);
        System.out.println("average of array of subscript "+(double)total/10);
        System.out.println("minimum of array subscripts is "+min);
        System.out.println("maximum array subscript "+max);

    }
}
