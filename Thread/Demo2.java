//demonstrating thread by implementing Runnable interface
import java.lang.*;

class Thread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Axiom");
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            catch(Exception exc)
            {
                exc.printStackTrace();
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
                System.out.println("TechGuru");
                Thread.sleep(300);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();

            }
            catch(Exception exc)
            {
                exc.printStackTrace();
            }
        }
    }
}



class Demo2
{
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();

        Thread a=new Thread(t1);
        a.start();
        Thread2 t2=new Thread2();
        Thread b=new Thread(t2);
        b.start();
        while(true)
        {
            try{
                System.out.println("main");
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
            catch(Exception exc)
            {
                exc.printStackTrace();
            }
        }
    }
}