package sasijava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expresion {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[^a-zA-Z0-9]{0,}");
		Matcher m = p.matcher("@#$%#$ $%#$ @#$@#");
		if(m.matches()==true)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
