package sasijava;
import java.util.*;
public class sum_of_array {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int sum =0;
		int a[]  = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}

}
