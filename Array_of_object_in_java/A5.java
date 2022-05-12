/*3. Construct an array of object of person class having property name, age.
Create an array of object having 10 subscript.
Find out average age, details of eldest and youngest person from array list.*/
import java.lang.*;
import java.util.*;
class person
{

    String name;//declaring variables
    int age;

    // person(){}//default constructor

    person(String name,int age) //parameterized constructor to accept name and age
    {
        this.name=name;
        this.age=age;
    }
    // person cal(person A0,person A1,person A2,person A3,person A4,person A5,person A6,person A7,person A8,person A9)
   static void cal(int age[], String name[])
    {
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
    System.out.println("average age is :"+(double)total/10);
    System.out.println("eldest is "+a+"\t and age "+max);
    System.out.println("youngest is :"+b+"\t and age "+min);
    }

}
class A5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[20];
        int age[]=new int[20];
        for (int i=0;i<10;i++)
        {
            System.out.println("enter array subscripts :");
            name[i]=sc.nextLine();

        }
        for (int i=0;i<10;i++)
        {
            // System.out.pritnln("enter age array subscripts :");
            System.out.println("enter age array subscripts :");
            age[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("name "+name[i]+"\t"+age[i]);
        }
        person A[]=new person[10];//declaration of an array
        for(int i=0;i<10;i++)
        {
            
            A[i]=new person(name[i],age[i]);
            // System.out.println(A[i]);
        }
        
        person.cal(age, name);
        
    }
}