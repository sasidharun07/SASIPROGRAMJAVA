package SasiJava;
import java.lang.Thread;
class opj implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread called "+i+" "+Thread.currentThread().getName());
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
public class Thread_in_interface {

	public static void main(String[] args) throws Exception{
		opj my1 = new opj();
		opj my2 = new opj();
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		t1.setName("sasi");
        t2.setName("mani");
        t1.start();
        t1.join();
        t2.start();
	}

}
