//read a no and perform arithmatics

import java.lang.*;
import java.util.*;

class demo1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first no");
        int a =sc.nextInt();
        System.out.println("enter a second no");
        int b= sc.nextInt();
        System.out.println("a :"+a+ "b :"+b);
        System.out.println("sum"+(a+b));
        System.out.println("sub"+(a-b));
        System.out.println("multi"+(a*b));
        System.out.println("div"+(a/b));
        System.out.println("modulous"+(a%b));
    }
}


