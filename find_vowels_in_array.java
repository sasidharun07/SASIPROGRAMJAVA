package sasijava;
import java.util.*;
public class find_vowels_in_array {

	public static void main(String[] args)
	{
		 char a[] = {'a','b','e','k','i','h','o','y','u'};	        
	        List<Character> ak = new ArrayList<>();
	        for(char x:a)
	        {
	           if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
	           {
	               ak.add(x);
	           }
	        }
	        System.out.println(ak);
	        }
	}