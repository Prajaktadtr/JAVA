//write a complete oop to 5. Read 3 nos to determine greatest and lowest
import java.lang.*;
import java.util.*;

class A5
{
    int p,q,r;
    public A5(int p,int q,int r)
    {
        this.p=p;
        this.q=q;
        this.r=r;
    }
    public int greatest()
    {
        if(p>q && p>r){
            System.out.println(+p+"is greatest");

        }
        else if(q>p && q>r)
        {
            System.out.println(+q+" is greatest ");
        }
        else if(r>p && r>q)
        {
            System.out.println(+r+" is greatest");
        }
        if(p<q && p<r)
        {
            System.out.println(+p+" is smallest");

        }
        else if(q<r && q<p)
        {
            System.out.println(+q+" is smallest");

        }
        else if(r<p && r<q)
        {
            System.out.println(+r+" is smallest");
        }
return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no");
        int p=sc.nextInt();
        System.out.println("enter a second no");
        int q=sc.nextInt();
        System.out.println("enter a third no");
        int r=sc.nextInt();
        A5 a=new A5(p,q,r);
        System.out.println("1st no is "+p);
        System.out.println("2nd no is "+q);
        System.out.println("3rd no is "+r);
        System.out.println(+a.greatest());
    }
}