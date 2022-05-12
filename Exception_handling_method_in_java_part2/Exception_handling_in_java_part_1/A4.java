/*1. Read n nos from user by scanning value of n from user.
Compute sum,avg,max,min from them .
Handel all the possible exceptions raised... */
import java.lang.*;
import java.util.*;
class A4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int num[]=new int[20];
        int n;
        System.out.println("enter a value of n ");
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("enter array subscripts :");
            num[i]=sc.nextInt();
        // System.out.println(+num[i]);
        }
        for(int i=0; i<n; i++)
        {
            System.out.println("array subscripts are "+num[i]);

        }
        
        try
        {
            int total=0;
            int max=0;
            int min=99999;
            for(int i=0; i<n; i++)
            {
               total+=num[i]; 
               if(max<num[i])
                max=num[i];
             if(min>num[i])
                min=num[i];
            

            }
            System.out.println("sum of array subscripts is "+total);
            System.out.println("average of array subscripts is "+(double)total/num.length);
            System.out.println("minimum of array subscripts is "+min);
            System.out.println("maximum array subscript "+max);
            //  for(int i=0; i<=num.length; i++)
            // {
            //     if(max<num[i])
            //     max=num[i];

            // }
            

            // for(int i=0; i<num.length; i++)
            // {
            //     if(min>num[i])
            //     min=num[i];

            // }
            

        }
        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
             }
             catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
             }
             catch(Exception e){
            System.out.println("Warning: Some Other exception");
             }
           System.out.println("Out of try-catch block...");


    }
}