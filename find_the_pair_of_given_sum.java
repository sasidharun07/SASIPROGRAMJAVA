package sasijava;
import java.util.*;
public class find_the_pair_of_given_sum {

	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the how many numbers: ");
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("enter the numbers: ");
	        for(int i=0;i<n;i++)
	        {
	           a[i] =sc.nextInt();
	        }
	        System.out.println("enter the target number: ");

	        int t = sc.nextInt();
	        int flag=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(a[i]+a[j]==t && flag==0)
	                {
	                    System.out.print("the sum of number is :"+a[i]+" "+a[j]+"  ");
	                    flag=1;
	                }
	            }
	        }
	    }
	}

	/*
	10
	1 2 3 4 5 6 7 8 9 10
	16

	*/
	