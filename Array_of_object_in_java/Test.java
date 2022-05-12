// A program to add two time object to form the third resultant one
import java.lang.*;
import java.util.*;

class MyTime
{
    int Hr,Min,Sec; //private data

    MyTime(){}//default constructor is called do nothing constructor as it return value 0

    public MyTime(int Hr, int Min, int Sec)//parameterized constructor
    {
        this.Hr=Hr;
        this.Min=Min;
        this.Sec=Sec;

    }

    public String toString() //over ridding toString
    {
        return "Hour :"+this.Hr+"Minute :"+this.Min+"Seconds : "+this.Sec;
    }

    public MyTime addTime(MyTime p) //method to add two time object to form th resultant one
    {
        MyTime r=new MyTime(); //resultant object
        

        r.Sec=this.Sec+p.Sec;
        r.Min=r.Sec/60;
        r.Sec%=60;
        r.Min+=this.Min+p.Min;
        r.Hr=r.Min/60;
        r.Min%=60;
        r.Hr+=this.Hr+p.Hr;
        return r;
        

    }
}

    class Test
    {
        public static void main(String[] args)
        {
            MyTime t1=new MyTime(2,54,45);
            MyTime t2=new MyTime(3,45,55);
            MyTime t3=new MyTime();

        
            t3=t1.addTime(t2); //t3=t1+t2; not possible as these are user defined object variable and user defined object variable can't be added directly
            System.out.println("t1 object :"+t1);
            System.out.println("t2 object :"+t2);
            System.out.println("t3 object :"+t3);
        }
    }