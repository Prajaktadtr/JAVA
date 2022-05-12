/*. Develop non - static methods for the following
* Read a no to check armstrong
 sum of cube of all digits equals to a no
e.g. 153 = 1^3+5^3+3^3*/
import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;


class A4
{
    //non static method to check number is armstrong or not
    public void armstrong(int n)
    {
int sum=0,rem=0,check;
check=n;
while(check!=0)
{
    rem=n%10;
    sum=sum+(rem*rem*rem);
    check=check/10;

}
if(sum==check)
{
    System.out.println("given no is armstrong no");
    
}
else

System.out.println("given no is not an armstrong no");

}
public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a no");
    int n=sc.nextInt();
    A4 obj=new A4();
    obj.armstrong(n); //call to non static void armstrong no.

}


   
}

