package sasijava;
import java.util.*;
public class cm_to_meter {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the cm: ");
		int cm = sc.nextInt();
		double meter = cm/100.0;
		System.out.println(meter);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the meter : ");
		double meter = sc.nextDouble();
		double cm = meter*100;
		System.out.println("the cemtimeter is: "+cm);
	}

}
