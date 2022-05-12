//2. Write a method to check given string is palindrome or not.
import java.lang.*;
import java.util.*;

class A2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String reverse="";
        String original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        } 
        if(original.equals(reverse))
        {
            System.out.println("given string is palindrome");

        }
        else
        {
          System.out.println("given string is not pallindrome");

        }
    }
}