package sasijava;

public class count_vowels_in_String {

	public static void main(String[] args)
	{
		  int count = 0;
	        String a = "raga";
	        for (int i = 0; i < a.length(); i++) 
	        {
	            char c = a.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	}
}
