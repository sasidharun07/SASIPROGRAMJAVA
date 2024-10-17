package SasiJava;
import java.lang.Thread;
public class threaddemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
