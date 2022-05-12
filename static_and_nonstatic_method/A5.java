/* Read a four digit no to print digits using alphabet
e.g i.p : 1234 , o.p. One Two Three Four*/

import java.lang.*;
import java.util.*;

class A5
{
   public void read(int n)
   {
       int num=0;
       /* Store reverse of n in num */
    while(n != 0)
    {
        num = (num * 10) + (n % 10);
        n /= 10;
    }

    /* 
     * Extract last digit of number and print corresponding digit in words
     * till num becomes 0
     */
    while(num != 0)
    {
        switch(num % 10)
        {
            case 0: 
                System.out.println("Zero ");
                break;
            case 1: 
                System.out.println("One ");
                break;
            case 2: 
                System.out.println("Two ");
                break;
            case 3: 
                System.out.println("Three ");
                break;
            case 4: 
               System.out.println("Four ");
                break;
            case 5: 
              System.out.println("Five ");
                break;
            case 6: 
               System.out.println("Six ");
                break;
            case 7: 
               System.out.println("Seven ");
                break;
            case 8: 
                System.out.println("Eight ");
                break;
            case 9: 
              System.out.println("Nine ");
                break;
        }
        
        num = num / 10;
    }
   } 
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int n=sc.nextInt();
       A5 rr=new A5();
       rr.read(n); //call to non static void read()
   }

}
