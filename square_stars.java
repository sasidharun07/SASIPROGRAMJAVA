package sasijava;
import java.util.*;
public class square_stars {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of rows: ");
		int row = sc.nextInt();
		System.out.println("enter the number of col: ");
		int col = sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 || j==0)
					System.out.print(" * ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
