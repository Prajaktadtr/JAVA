//user defined exception in java
/*3. Create an User Defined Exception and if persons age <18 as well as persons age >=65 then throw user
defined exception .*/

import java.lang.*;
import java.util.*;
class A5
{

public class InvalidAgeException extends Exception
{
// Declare a parameterized exception with string str as a parameter.
  InvalidAgeException(String str)
  {
	super(str);
  }
}


 int age;
 void validate() throws InvalidAgeException
{ 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your age");
 age = sc.nextInt();

 if(age < 18)  
 throw new InvalidAgeException("Invalid Age, You are not eligible to vote");  
 else if(age >=65)
 throw  new InvalidAgeException("Invalid Age, You are not eligible to vote");
 else
 System.out.println("Welcome to vote");  

}  
public static void main(String[] args)
{
  A5 v=new A5();
try
{  
 v.validate();  
}

catch(InvalidAgeException e)
{
  System.out.println("Caught an Exception: \n "+e);
}   
 
}

}

