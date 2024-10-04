package sasijava;

public class percentage_of_letters_in_string {

	public static void main(String[] args) 
	{
		 String a = "foobar";
	        char t = 'f';
	        float c=0;
	        for(char x:a.toCharArray())
	        {
	            if(x==t)
	            {
	                c++;
	            }
	        }
	         float k = c/a.length()*100;
	        int r=(int)k;
	        System.out.println(r);
	    }
	}