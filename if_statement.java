package sasijava;
import java.util.*;
public class if_statement 
{
	public static void main(String[] args)
    {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter the number: ");
	     int a = sc.nextInt();
	     if(a>0)
	         System.out.println("a is positive "+a);
	     else if(a==0)
	     {
	         System.out.println("a is zero"+a);
	     }
	     else
	     System.out.println("a is negative"+a);
	 }
}