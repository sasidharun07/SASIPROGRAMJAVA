package sasijava;
import java.util.*;
public class Any_one_word_is_greathren_one 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the number: ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>1)
			{
				flag = true;
			}
		}
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");		
	}
}
