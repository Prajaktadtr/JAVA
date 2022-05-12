// read a person details to cheak voting eligibility
import java.lang.*;
import java.util.*;

class Demo2
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String nm;
        int age;
        System.out.println("enter name");
        // System.out.println("enter age");
        nm=sc.nextLine();
        System.out.println("enter age");
         age=sc.nextInt();

        //expression for voting elligibility
        if(age>18)
        System.out.println(nm+"is elligible");
        else
        System.out.println(nm+"is not elligible");


    }
}
