//example of throw
// Java program to demonstrate the working 
// of throw keyword in exception handling
 import java.lang.*;
 import java.util.*;

public class A1 {
    public static void main(String[] args)
    {
        // Use of unchecked Exception
        try {
            // double x=3/0;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}