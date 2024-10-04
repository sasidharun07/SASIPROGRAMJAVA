package sasijava;
import java.util.*;
public class feet_to_meter {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("entr the feet: ");
		double feet = sc.nextDouble();
		double meter = feet/3.28084;
		System.out.println(meter);

	}

}
