/*Construct a Complex class with consist property int real, float img .
Add two Complex objects to form the third resultant one*/

import java.lang.*;
import java.util.*;
class complex
{

    int real,imaginary;//declaring variables

    //constructor of this class

    //constructor 1-empty consrtructor
    complex() {}

    //constructor 2
    //parameterized constructor to accept real and imaginary part

    complex(int tempReal,int tempImaginary)
    {
        this.real=tempReal;
        this.imaginary=tempImaginary;

    }
    //method
    //to add two complex number
  complex addComp(complex C1,complex C2)
  {
      //creating temporary variable
      complex C3=new complex();

      //adding real part of complex numbers
      C3.real=C1.real+C2.real;

      //adding Imaginary part of complex numbers 
      C3.imaginary=C1.imaginary+C2.imaginary;
    //returning the sum
    return C3;

  }

}
class A2
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        complex C1=new complex(3,2);//first complex number
        System.out.println("complex number 1 :" +C1.real+"+i"+C1.imaginary);//printing first complex number
        
        //second complex number
        complex C2=new complex(9,5);
        //printing second complex number
        System.out.println("Complex number 2 :"+C2.real+"+i"+C2.imaginary);
        //storing the sum
        complex C3=new complex();
        //calling addComp method
        C3=C3.addComp(C1,C2);
        //printing the sum
        System.out.println("sum of complex number :"+C3.real+"+i"+C3.imaginary);



    }
}
