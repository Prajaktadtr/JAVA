/*1. Construct a method which will accept a String and a character as an argument to find total no of
occurrences of a character in a String*/
import java.lang.*;
import java.util.*;

/*class A1
{
    static final int SIZE=26;
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        str=sc.nextLine();
        freq_of_chars(str);
    }
    static void freq_of_chars(String str)
    {
        int n=str.length();
        int[] freq=new int[SIZE];
        for(int i=0;i<n;i++)
        {
        freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[str.charAt(i)-'a']!=0)
            System.out.println(str.charAt(i));
            System.out.println(freq[str.charAt(i)-'a']+"");
        
    freq[str.charAt(i)-'a']=0;
        }
    }
}*/
class A1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String input=sc.nextLine();
        System.out.println("enter a search charecter");
        String search=sc.next();

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search.charAt(0))
            count++;
        }
        System.out.println("the charecter "+search+"apperars "+count+ "time");
        
    }

}
