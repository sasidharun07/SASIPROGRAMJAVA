package sasijava;
import java.util.*;
public class Big_of_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num 1: ");
		int a = sc.nextInt();
		System.out.println("enter num 2: ");
		int b = sc.nextInt();
		System.out.println("enter num 3: ");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Biggest number is: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Biggest number is: "+b);
		}
		else
		{
			System.out.println("Biggest number is: "+c);
		}
	}
}
