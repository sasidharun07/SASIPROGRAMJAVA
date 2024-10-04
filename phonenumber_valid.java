package sasijava;
import java.util.*;
public class phonenumber_valid {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
    String a=sc.next();
    
    boolean flag = true;
    
      if(a.length()!=10)
          flag=false;
  
      if(a.charAt(0)-48<6)
          flag=false;
          
      for(char x:a.toCharArray())
      {
          if(x-48 >=0 && x-48<=9)
              continue;
          else
              flag=false;
      }
      
      if(flag)
          System.out.print("Valid");
      else
          System.out.print("Invalid");
  }
}
