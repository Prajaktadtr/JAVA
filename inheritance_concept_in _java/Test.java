// Comparing for greatest and lowest property among four classes using Inheritance 
import java.lang.*;
import java.util.*;

// Definition A class
class A
{
	int a;
	public A(int a)
	{
		this.a=a;
	}
	public int getA()
	{
		return this.a;
	}
}
// Definition B class
class B extends A
{
	int b;
	public B(int a,int b)
	{
		super(a);
		this.b=b;
	}
	public int getB()
	{
		return this.b;
	}
}

// Definition C class
class C extends B
{
	int c;
	public C(int a,int b,int c)
	{
		super(a,b);
		this.c=c;
	}
	public int getC()
	{
		return this.c;
	}
}

// Definition D class
class D extends C
{
	int d;
	public D(int a,int b,int c,int d)
	{
		super(a,b,c);
		this.d=d;
	}
	public int getC()
	{
		return this.c;
	}

public String toString()
	{
	return "a :"+getA()+" b:"+getB()+" c:"+getC()+" d :"+this.d;
	}
public int greatest()
	{
	if(getA()>getB() & getA()>getC() & getA()>this.d)
		return getA();
	else if(getB()>getA() & getB()>getC() & getB()>this.d)
		return getB();
	else if(getC()>getA() & getC()>getB() & getC()>this.d)
		return getC();
	else
		return this.d;
	}

public int lowest()
	{
	if(getA()<getB() & getA()<getC() & getA()<this.d)
		return getA();
	else if(getB()<getA() & getB()<getC() & getB()<this.d)
		return getC();
	else if(getC()<getA() & getC()<getB() & getC()<this.d)
		return getC();
	else
		return this.d;
	}


}



class  Test
{
	public static void main(String[] args) 
	{
		D obj=new D(5,20,3,9);

		System.out.println("Copy of object :"+obj);
		System.out.println("Gretest Object :"+obj.greatest());
		System.out.println("Lowest Object :"+obj.lowest());


	}
}
