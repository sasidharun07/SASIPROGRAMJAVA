package sasijava;
import java.util.*;
public class remove_star_nearelements {

	public static void main(String[] args) 
	{   Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = "";
    int m =0;
    for(int i=a.length()-1;i>=0;i--)
    {
        char x = a.charAt(i);
        if(x=='*')
        m++;
        
        else if(x!='*' && m>0)
        m--;
        
        else
        b = x+b;
    }
    System.out.println(b);
  }
}