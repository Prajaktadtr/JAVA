// Demonstrating Command Line Input
// Read n friends name from command line and print it 
import java.lang.*;

class DemoCmd1 
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("No Data Input");
			System.exit(1); // terminate the program Execution
		}
		// Print all data input 
		System.out.println("Friend List ");
		for(int i=0;i<args.length;i++)
			System.out.println("args["+i+"] :"+args[i]);

		
	}// End of main
}// End of class

