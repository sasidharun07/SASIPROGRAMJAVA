package sasijava;
import java.util.*;
public class feet_to_cm {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of feet = ");
		double feet = sc.nextDouble();
		double cm = (double)feet*30.48;
		System.out.println(cm);

	}

}
