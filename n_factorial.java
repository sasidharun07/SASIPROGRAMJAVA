package sasijava;
import java.util.*;
public class n_factorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		for(int i=1;i<=a;i++)
		{
			b*=i;
		}
		System.out.println(b);
	}
}
