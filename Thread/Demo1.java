//demonstrating thread
import java.lang.*;

class MyThread1 extends Thread
{
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("thread 1");
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
class MyThread2 extends Thread
{
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Tread 2");
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

class MyThread3 extends Thread
{
    public void run()
    {
        while(true)
        {
            try{
                System.out.println("tread 3");
                Thread.sleep(200);
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
class MyThread4 extends Thread
{
    public void run()
    {
        while(true)
        {
            try{
                System.out.println("Thread 3");
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
class Demo1{
    public static void main(String[] args)
    {
        MyThread1 mt1=new MyThread1();
        MyThread2 mt2=new MyThread2();
        MyThread3 mt3=new MyThread3();
        MyThread4 mt4=new MyThread4();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        while(true)
        {
            try
            {
                System.out.println("main thread");
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