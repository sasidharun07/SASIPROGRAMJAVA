package sasijava;
import java.util.*;
public class Array_to_list 
{
	public static void main(String[] args) 
	{
	        int a[] = {1,2,3,4,5};
	        List<Integer> ak = new ArrayList<>();
	        for(int x:a)
	        {
	            ak.add(x);
	        }
	        System.out.println(ak);
	}
}
