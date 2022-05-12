/*2. Construct a method which will throw 4 predefined exception and catch them all using exception
Handling.*/

import java.lang.*;
import java.nio.channels.NoConnectionPendingException;
import java.text.NumberFormat;
import java.util.*;
import java.util.prefs.NodeChangeEvent;

import javax.naming.NoPermissionException;
import javax.swing.JSpinner.NumberEditor;
class A6
{

  public static void validate(int age)
  {
      try {
        if(age<18)
        {
            throw new ArithmeticException("person is not eligible to vote");
            throw new Exception();
            throw new RuntimeException();
            throw new InstantiationError();
  
  
        }
          else
          {
            System.out.println("person is eligible to vote");
  
          } 
          
       } catch (Exception e) {
          TODO: handle exception
      }
      catch(ArithmeticException e)
      {
        e.printStackTrace();
      }
      catch(RuntimeException i)
      {
          System.out.println(i);

      }
      catch(InstantiationError c)
      {
          System.out.println(c);
      }
      
    }
    
    
  
    public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.println("enter age ");
    age=sc.nextInt();
    validate(age);
    System.out.println("rest of the code");
}
}
