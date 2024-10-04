package sasijava;
import java.util.*;
public class example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {12,12,23,34,45,56};
		int target = 24;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("the num "+a[i]+" , "+a[j]+" is equal to "+target);
				}
			}
		}
	}
}