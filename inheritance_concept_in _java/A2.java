//2. Compare for the greatest and lowest among all the A, B, C, D classes and display the specific result.
import java.lang.*;
import java.util.*;

// import javax.lang.model.util.ElementScanner14;
// import javax.lang.model.util.ElementScanner7;

// import org.w3c.dom.ls.LSException;

class A //defination of class A
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
class B extends A // defination of class B
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

class C extends B
{
    int c;
    public C(int a, int b, int c)
    {
        super(a,b);
        this.c=c;
    }
    public int getC()
    {
        return this.c;
    }

}

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
    return "a :"+getA()+" b :"+getB()+" c :"+getC()+" d :"+this.d;

}
public int greatest()
{
    if(getA()>getB()  & getA()>getC() & getA()>this.d)
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
class A2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter a first no");
        int a=sc.nextInt();
        System.out.println("enter a second no");
        int b=sc.nextInt();
        System.out.println("enter a third no");
        int c=sc.nextInt();
        System.out.println("enter a fourth no");
        int d=sc.nextInt();

        D obj=new D(a,b,c,d);
        System.out.println("copy of object :"+obj);
        System.out.println("greatest no :"+obj.greatest());
        System.out.println("lowest no :"+obj.lowest());

        
    }
}