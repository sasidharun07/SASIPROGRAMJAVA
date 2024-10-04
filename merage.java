package sasijava;
import java.util.*;
public class merage {

	public static void main(String[] args)
	{ Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    List<Character> ak = new ArrayList<>();
    List<Character> bk = new ArrayList<>();
    
    for(char x:a.toCharArray())
    {
        ak.add(x);
    }
    for(char x:b.toCharArray())
    {
        bk.add(x);
    }
    int k=1;
    for(int i=0;i<bk.size();i++)
    {
        ak.add(k,bk.get(i));
        k+=2;
    }
   System.out.println(ak) ;
}
}