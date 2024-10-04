package sasijava;
import java.util.*;
public class cm_to_feet {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of cm = ");
		int cm = sc.nextInt();
		double feet = (double) (cm/30.48);
		System.out.println(feet);	
	}
}
