package SasiJava;
import java.util.*;
public class model7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt(),i,j;
		for( i=1;i<=n;i++)
		{
			for( j=0;j<=n;j++)
			{ 
				if(i==j || i+j==n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
