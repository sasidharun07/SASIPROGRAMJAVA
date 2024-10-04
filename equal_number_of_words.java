package sasijava;
import java.util.*;
public class equal_number_of_words 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        boolean flag=true;
        
        String a = sc.nextLine();
        int s=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==a.charAt(0))
                s++;
        }        
        
        for(int i=0;i<a.length();i++){
            int p=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j))
                    p++;
            }
         if(p!=s) 
         flag=false;
        }
        if(flag)
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}