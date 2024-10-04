package sasijava;
import java.util.*;
public class arraydemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n = sc.nextInt();
		String[] mo_name = new String[n];
		System.out.println("enter the movie name: ");
		for(int i=0;i<n;i+=2)
		{
			mo_name[i] = sc.next();
		}
		System.out.println("\nmovie list: \n");
		for(int i=0;i<n;i+=2)
		{
			System.out.println(mo_name[i]);
		}
		

	}

}
