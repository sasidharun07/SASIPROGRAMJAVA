package sasijava;
import java.util.*;
public class string_reverse {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			char x = a.charAt(i);
			System.out.print(x);
		}
	}

}
