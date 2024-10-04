package sasijava;
import java.util.*;
public class palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("enter the string: ");
		String a = sc.next();
		for(int i=0,j=a.length()-1;i<a.length();i++,j--)
		{
			if(a.charAt(i)!=a.charAt(j))
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("Yes it's palindrome "+a);
		}
		else
		{
			System.out.println("No it's not palindrome "+a);
		}
	}

}
