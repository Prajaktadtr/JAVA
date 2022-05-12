//5. Read n nos from command line to print array contents with subscripts as well as find sum,avg

import java.lang.*;

class A2
{
    public static void main(String[] args)
    {
        System.out.println("data feed from comand line");
        if(args.length==0)
        {
            System.out.println("no data input from comand line");
            System.exit(1);
            for(int i=0;i<args.length;i++)
            {
                System.out.println(args[i]+i);
            }
            int sum=0,avg=0;
            for(int j=0;j<args.length;j++)
            {
                sum=args.length+sum;

            }
            System.out.println("sum ="+sum);
            int av=0;
            av=sum/5;
            System.out.println("average="+av);
        }
    }

}
