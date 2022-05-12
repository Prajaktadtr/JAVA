// Demo Command Line Input 
// Read n nos from command Line and print sum, avg of them 
import java.lang.*;

class  DemoCmd2
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("No Data Input ");
			System.exit(1);
		}
		int sum=0;
	for(int i=0;i<args.length;i++)
		{
		System.out.println("args["+i+"] :"+args[i]);
		int n=Integer.parseInt(args[i]);
		sum+=n; // sum=sum+n
		}
		float avg=(float) sum/args.length;

		System.out.println("Summation :"+sum+"Average :"+avg);
	
	}

}

