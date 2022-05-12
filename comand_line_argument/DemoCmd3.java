// Read n nos from command Line and find max,min from them 
import java.io.*;

class  DemoCmd3
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
		System.out.println("No Data Input ");
		System.exit(1);
		}
		System.out.println("Array Contents ");
		System.out.println("args["+0+"] :"+args[0]);
		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[0]);
		
		for(int i=1;i<args.length;i++)
		{
			System.out.println("args["+i+"] :"+args[i]);
			int n=Integer.parseInt(args[i]);
			if(n>max)
				max=n;
			if(n<min)
				min=n;
		}
			System.out.println("max :"+max+"min :"+min);

	}
}

