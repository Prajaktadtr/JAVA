/*2. Create an array on n subscripts and find out sum,avg,max,min from them .
Handel all possible exception raised */

import java.lang.*;
import java.util.*;

class A2
{
    public static void main(String[] args)
    {
        int[] array={2,4,55,44,22,66,77};
        int i;
      System.out.println("maximum is  "+max(array));
      System.out.println("minimun is  "+min(array));
      System.out.println("sum is  "+sum(array));
      System.out.println("avg is "+avg(array));
    }
    
    //max
        
            public static int max(int[] x)
             {
                int temp=x[0];
            
                for(int i=0;i<x.length;i++)
                {
                    if(temp<x[i])
                    temp=x[i];

                }
                return temp;
            
            
            }
            
            

            

    //
    public static int min(int[] x)
    {
        int temp=x[0];
        
        for(int i=0;i<x.length;i++)
        {
            if(temp>x[i])
            temp=x[i];
        }
        return temp;
    }
    
     
    

    public static int sum(int[] x)
    {
        int total=0;
        
        for(int i=0;i<x.length;i++)
        {
            total+=x[i];
        }
        return total;

    }
//average
    public static int avg(int[] x)
    {
        int total=0;
    
        for(int i=0;i<x.length;i++)
        {
            total+=x[i];
        }
        return total/x.length;
    
    }
     
    
}