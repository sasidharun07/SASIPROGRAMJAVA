package sasijava;
import java.util.*;
public class without_short_function 
{
	public static void main(String[] args)
	{
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the how many number: ");
		    int n=sc.nextInt();
		    System.out.println("enter the array numbers: ");
		    int ak[]=new int[n];
		    int bk[]=new int[n];
		    for (int i=0;i<n;i++)
		    {
		        ak[i]=sc.nextInt();
		    }		
		    for(int i=0;i<ak.length;i++)
		    {
		        int c=0;
		        for(int j=0;j<ak.length;j++)
		        {
		            if(ak[i]>ak[j])
		                c++;
		        }
		        while(bk[c]>0)
		        {
		            c++;
		        }
		        bk[c]=ak[i];
		    }
		    System.out.println(Arrays.toString(ak));
		    System.out.println(Arrays.toString(bk));
	}
}
