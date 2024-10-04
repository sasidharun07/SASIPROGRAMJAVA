package sasijava;
import java.util.*;
public class table {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("which table do you want: ");
	     int n = sc.nextInt();
	     //1*5=5
	     //2*5=10
	     //10*5=50
	     //i+"*"+n+"="+i*n;
	        int i=1;
	        while(i<11)
	        {
	            System.out.println(i+"*"+n+"="+i*n);
	            i++;
	        }
	    }
	}