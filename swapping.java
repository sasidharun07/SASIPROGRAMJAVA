package sasijava;
import java.util.*;
public class swapping {

	public static void main(String[] args) 
	{   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("before swapping: "+a+" and "+b);
    int t = a;
    a = b;
    b = t;
    System.out.println("after swapping: "+a+" and "+b);
}
}