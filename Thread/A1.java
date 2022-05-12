/*1. Create multi threads for printing your name, surname, mobile no, email id
set different sleeping time for all and synchronize them to main thread.*/

import java.lang.*;
class Thread1 extends Thread
{
    public void run()
    {
        while(true)
        {
            
           try{
            System.out.println("my name is siya");
            Thread.sleep(500);//sleeps for 500ms
           }
           catch(InterruptedException ie)
           {
               ie.printStackTrace();
           }
           catch(Exception exc)
           {
               exc.printStackTrace();
           }
        }//end of while
    }//end of run
}//end of class
class Thread2 extends Thread
{
    public void run()
    {
        while(true)
        {
            try{
                System.out.println("1111111111");
                Thread.sleep(400);

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
class Thread3 extends Thread
{
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("siya@gmail.com");
                Thread.sleep(300);
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
class A1
{
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.start();
        t2.start();
        t3.start();
        while(true)
        {
            try{
                System.out.println("details");
                Thread.sleep(100);
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