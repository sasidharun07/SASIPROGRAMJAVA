package sasijava;
import java.util.*;
public class sum_of_first_N_natural_numbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		int c = 0;
		for(int i=0;i<=n;i++)
		{
			c+=i;
		}
		System.out.println(c);
	}

}
