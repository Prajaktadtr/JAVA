/*4. Read Name, surname, age, height and check the criteria for selection (age>=18 & age<=25, height
>=5.4 & height <=6.2)
print relevant message of eligibility*/

import java.lang.*;
import java.util.*;


public class a4
 {
     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
         String nm,snm;
         int age;
         float h;
         System.out.println("enter name");
         nm=sc.next();
         System.out.println("enter surname");
        snm=sc.next();
         System.out.println("enter age");
         age=sc.nextInt();
         System.out.println("enter height");
         h=sc.nextFloat();
         System.out.println("name is "+nm+" "+snm);
         System.out.println("age and height is "+age+" "+h);
         if(age>18 && age<=25)
         {
             System.out.println("eligible for voting");
         }
         if(h>=5 && h<=6.2)
         {
             System.out.println("eligible for army");
             
         }


     }
    
}
