// Read a no to find factorial of it - OOP code
// n!= n x n-1....1
import java.lang.*;
import java.util.*;

class  Facto
{
	int n;
	public Facto(int n)
	{
		this.n=n;
	}
	public int find_Facto()
	{
		int f=1;
		while(this.n>0)
		{
			f*=this.n; // f=f*this.n
			this.n--;
		}
		return f;
	}
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No :");
		int n=sc.nextInt();
		Facto f=new Facto(n);
		System.out.println("No is :"+n+"Factorial :"+f.find_Facto());
	}

	
}


