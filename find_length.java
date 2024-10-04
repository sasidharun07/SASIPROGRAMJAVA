package sasijava;

public class find_length {

	public static void main(String[] args)
	{
		String text = "abcdefghijklmnopqrstuvwxyz";
		/*
		System.out.println(text);
		System.out.println("\nthe length of string is :"+text.length());
	*/int c = 0;
	for(int i=0;i<text.length();i++)
	{
		c++;
	}
	System.out.println(c);
	}

}