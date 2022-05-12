/*3. Consider a String "Welcome to Axiom TechGuru Pvt. Ltd"
Compute - total no of characters in a String
- Total no of words in a String
- Total no of vowels
- Total No of Consonants
- Total no of sp. characters.*/
import java.lang.*;
import java.util.*;

class A3

{
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
System.out.println("ENTER A STRING");
String str1 = sc.nextLine();
int wordCount = 1;
for (int i = 0; i < str1.length(); i++)
{
if (str1.charAt(i) == ' ' && str1.charAt(i+1)!=' ')
{
wordCount++;
}
}
System.out.println("Word count is = " + wordCount);
}
}