package sasijava;
import java.util.*;
public class min {

	public static void main(String[] args)
	{Scanner sc = new Scanner(System.in);
	System.out.println("enter the elements: ");
	int n = sc.nextInt();
	int[] numbers = new int[n];
	System.out.println("enter "+ n + " numbers :" );
	for (int i=0;i<n;i++)
	{
		numbers[i] = sc.nextInt();
	}
	int min = numbers[0];
	for(int i=1;i<n;i++)
	{
		if (numbers[i] < min)
		{
			min = numbers[i];
		}
	}
	System.out.println("minimum number is: "+min);	
}

}