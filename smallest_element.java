package sasijava;
import java.util.*;
public class smallest_element 
{
	public static void main(String[] args) 
	{  
		Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("enter array element: ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int min = a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i] < min)
			min = a[i];
	}
	System.out.println("smallest element is : "+min);
	sc.close();
}

}