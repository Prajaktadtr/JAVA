// Write an OOP code to perform all possible arithmetics with two nos 

import java.lang.*;
import java.util.*;

class  DemoOOP
{
	// private data 
	int a,b;
	// Constructor definition
	public DemoOOP(){}
	public DemoOOP(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	// Methods for performing arithmetics 
	public int add()
	{
		return this.a+this.b;
	}
	public int sub()
	{
		return this.a-this.b;
	}
	public int mul()
	{
		return this.a*this.b;
	}
	public int div()
	{
		return this.a/this.b;
	}
	public int mod()
	{
		return this.a%this.b;
	}
	public int comp()
	{
		if(this.a>this.b)
		return this.a;
		else
		return this.b;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no :");
		int a=sc.nextInt();
		System.out.println("Enter Second no :");
		int b=sc.nextInt();

		DemoOOP dm=new DemoOOP(a,b);
		System.out.println("Addtion :"+dm.add());
		System.out.println("Substraction :"+dm.sub());
		System.out.println("Multiplication :"+dm.mul());
		System.out.println("Division :"+dm.div());
		System.out.println("modulus:"+dm.mod());
		System.out.println("Greatest:"+dm.comp());
	}
}

