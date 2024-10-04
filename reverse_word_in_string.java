package sasijava;
import java.util.*;
public class reverse_word_in_string {

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b="";
    String c="";
    for(int i=a.length()-1;i>=0;i--)
    {
        char x = a.charAt(i);
        if(x==' ')
        {
            b=b+" "+c;
            c="";
        }
        else
        {
            c=x+c;
        }
    }
    b=b+" "+c;
    System.out.println(b.trim());
}
}