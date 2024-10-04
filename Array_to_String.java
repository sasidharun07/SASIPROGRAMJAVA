package sasijava;
import java.util.*;
public class Array_to_String
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of array: ");
		int n = sc.nextInt();
		System.out.println("enter the number: ");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}
