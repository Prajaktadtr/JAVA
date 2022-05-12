//5. Read a radius of a circle to find diameter, area, and circumference
import java.lang.*;//class file
import java.util.*;//scanner file

public class a5
 {
     public static void main(String []args)

     {
         Scanner sc=new Scanner(System.in);
         int r,d;
         float pi=22/7,a,c;
         System.out.println("enter radius of a circle");
         r=sc.nextInt();
         d=2*r;
         a=pi*r*r;
         c=2*pi*r;
         System.out.println("radius of a circle is"+r);
         System.out.println("diameter of a circle is"+d);
         System.out.println("area of a circle="+a);
         System.out.println("circumference of a circle is"+c);


     }
    
}
