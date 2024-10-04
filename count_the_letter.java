package sasijava;
import java.util.Scanner;
public class count_the_letter 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string :");
	String a = sc.next();
	int c = 0;
	char t='s';
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)==t)
		{
			c++;
		}
	}
	System.out.println("in the string "+a+"  the letter "+t+" is print in "+c+" times.");
	}
}