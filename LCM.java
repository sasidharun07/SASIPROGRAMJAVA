package sasijava;
import java.util.*;
public class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num 1: ");
		int a = sc.nextInt();
		System.out.println("enter num 2: ");
		int b = sc.nextInt();
		
		int max = a>b ? a:b;
		int c = max;
		int min = a<b ? a:b;
		
		while(true)
		{
			if(max%min==0)
			{
				System.out.println(max);
				break;
			}
			else
			{
				max+=c;
			}
		}
	}
}
