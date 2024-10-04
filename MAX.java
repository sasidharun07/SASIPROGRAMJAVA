package sasijava;
import java.util.*;
public class MAX
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the number of array: ");
		int n = sc.nextInt();
		System.out.println("enter the array elements: ");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("the maximum number is : "+max);
	}

}
/*
 int a[] = {1,2,3,4,5,6,6,7,7,88,99};
    int max = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        max=a[i];
    }
    System.out.println(max);
    }    
}
*/
