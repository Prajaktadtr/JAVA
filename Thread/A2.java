//2. Update the same code to develop threading logic by implementing Runnable Interface.
import java.lang.*;

class Thread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("my name is siya");
                Thread.sleep(10000);
    
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("1111111111");
                Thread.sleep(30000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Thread3 implements Runnable
{
    public void run()
    {
        while(true)
        {
            try{
                System.out.println("siya@gmail.com");
                Thread.sleep(20000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class A2
{
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();
        Thread a=new Thread(t1);
        a.start();
        Thread2 t2=new Thread2();
        Thread b=new Thread(t2);
        b.start();
        Thread3 t3=new Thread3();
        Thread c=new Thread(t3);
        c.start();
        while(true)
        {
            try{
                System.out.println("details");
                Thread.sleep(10000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}