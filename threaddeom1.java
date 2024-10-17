package SasiJava;
import java.lang.Thread;
class obj1 extends Thread//the class name is not equal
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread called "+i);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

public class threaddeom1 {

	public static void main(String[] args)throws Exception {
		obj1 my1  = new obj1();
		obj1 my2  = new obj1();
		my1.start();
		my1.join();
		my2.start();
		
		
	}

}
