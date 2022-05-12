// Read n floating data from command line and sum,avg,max,min from them
import java.lang.*;

class  DemoCmd4
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
		System.out.println("No Data Input ");
		System.exit(1);
		}
		System.out.println("Array Contents :");
		System.out.println("args["+0+" ] :"+args[0]);
		float max=Float.parseFloat(args[0]);
		float min=Float.parseFloat(args[0]);
		float sum=0.0f;
		sum+=Float.parseFloat(args[0]);
		for(int i=1;i<args.length;i++)
		{
			System.out.println("args["+i+"] :"+args[i]);
			float n=Float.parseFloat(args[i]);
			sum+=n;
			if(n>max)
				max=n;
			if(n<min)
				min=n;
		}
		float avg=(float) sum/args.length;

		System.out.println("Summation :"+sum+"Average :"+avg);
		System.out.println("Maximim :"+max+"Minimum :"+min);
	} // End of main
} // End of class 
