// Read person details to check voting elligibility
import java.lang.*;
import java.util.*;
class  demo1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String nm=sc.next();
		System.out.println("Enter Age :");
		int age=sc.nextInt();
	// Expression for voting elligibility
		if(age>=18)
			System.out.println(nm+" is elligible to vote");
		else
			System.out.println(nm+" is not elligible to vote");


	}
}