/*3. Construct an array of object of person class having property name, age.
Create an array of object having 10 subscript.
Find out average age, details of eldest and youngest person from array list.*/
import java.lang.*;
import java.util.*;
class A3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[500];
        int age[]=new int[20];
        for(int i=0;i<10;i++)
        {
            System.out.println("enter  name array subscripts :");
            name[i]=sc.nextLine();
            // age[i]=sc.nextInt();

        }
        for(int i=0;i<10;i++)
        {
            System.out.println("enter age array subscripts :");
            age[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("name   age "+name[i]+"\t" +age[i]);
            // System.out.println("array age subscripts are "+age[i]);
        }
        int total=0;
        int max=0;
        int min=99999;
        String a=new String();
        String b=new String();

        for(int i=0;i<10;i++)
        {
            total+=age[i];
            if(max<age[i])
            {
            max=age[i];
            a=name[i];
            }
            if(min>age[i])
            {
            min=age[i];
            b=name[i];
            }

        } 
        System.out.println("average age is  :"+(double)total/10);
        System.out.println("eldest is :"+a+"\t and age"+max);
        System.out.println("youngest is :"+b +"\t and age" +min);
        
    }
}