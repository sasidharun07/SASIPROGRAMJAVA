package sasijava;
import java.util.*;
public class integer_reverse {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a integer: ");
	        int a = sc.nextInt();
	        int b = 0;
	        while(a>0)
	        {
	            b*=10;
	            b+=a%10;
	            a/=10;
	        }
	        System.out.println(b);
	    }
	}
	/*
	a=123;
	b=0;


	  b => 0
	  b => 3
	  a => 12
	  
	  b => 30
	  b => 32
	  a => 1
	  
	  b => 320
	  b => 321
	  a => 0
	  */