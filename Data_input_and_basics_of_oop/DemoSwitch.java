// Demo switch ..case 
import java.lang.*;
import java.util.*;


class  DemoSwitch
{
	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
	do
	{
		// develop a Menu
		System.out.println("Select Your Choice to perform");
		System.out.println("1: Prime");
		System.out.println("2: Armstrong");
		System.out.println("3: Multiples");
		System.out.println("4: Fibbonoci");
		System.out.println("Enter Your Choice :");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("You Selected Prime");
			// call method for prime here 
			break;
			case 2:
			System.out.println("You Selected Armstrong");
			// call method for Armstrong here 
			break;
			case 3:
			System.out.println("You Selected Multiples");
			// call method for Multiples here 
			break;
			case 4:
			System.out.println("You Selected Fibbonoci");
			// call method for Fibbonoci here 
			break;
			default :
			System.out.println("You Selected Wrong choice ");
			break;
		} // End of switch
	}	while (ch!=0); // end of while 
		
	}// End of main
}