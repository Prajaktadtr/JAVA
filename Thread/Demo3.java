// Demonstrating Thread
import java.lang.*;

// Thread 1
class MyThread1 extends Thread
{
	// Threading logic - over-ride run() method 
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("I'm in Thread 1");
				Thread.sleep(500); // sleeps for 500 ms
		
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
			catch(Exception exc)
			{
				exc.printStackTrace();
			}
		
		} // End of while

	}// End of run
} // End of class 

// Thread 2
class MyThread2 extends Thread
{
	// Threading logic - over-ride run() method 
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("I'm in Thread 2");
				Thread.sleep(300); // sleeps for 500 ms
		
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
			catch(Exception exc)
			{
				exc.printStackTrace();
			}
		
		} // End of while

	}// End of run
} // End of class 

// Thread 3
class MyThread3 extends Thread
{
	// Threading logic - over-ride run() method 
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("I'm in Thread 3");
				Thread.sleep(200); // sleeps for 500 ms
		
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
			catch(Exception exc)
			{
				exc.printStackTrace();
			}
		
		} // End of while

	}// End of run
} // End of class 

class MyThread4 extends Thread
{
	// Threading logic - over-ride run() method 
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("I'm in Thread 4");
				Thread.sleep(100); // sleeps for 500 ms
		
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
			catch(Exception exc)
			{
				exc.printStackTrace();
			}
		
		} // End of while

	}// End of run
} // End of class 


class  Demo3
{
	public static void main(String[] args) 
	{
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		MyThread3 mt3=new MyThread3();
		MyThread4 mt4=new MyThread4();
		mt1.start(); // start running thread1 
		mt2.start(); // start running thread2
		mt3.start(); // start running thread3 
		mt4.start(); // start running thread4
		while(true)
		{
		try
		{
			System.out.println("I'm in main Tread");
			Thread.sleep(1000);
			}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		
	} // End of while
} // End of main 
}// End of class 
