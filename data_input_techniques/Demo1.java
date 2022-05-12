// Demonstrating BufferedReader
import java.lang.*;
import java.io.*; // BufferedReader 

class  Demo1
{
	public static void main(String[] args) 
	{
			try
			{
				// InputStreamReader ip=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name :");
		String nm=br.readLine();
		System.out.println("Enter Age :");
		int age=Integer.parseInt(br.readLine());

	System.out.println("Name :"+nm+"Age :"+age);
	
			} // End of try
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
			catch(Exception exc)
		{
				exc.printStackTrace();
		}

	} // End of main
}// End of class

