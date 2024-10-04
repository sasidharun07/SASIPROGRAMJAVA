package sasijava;
import java.util.*;
public class terminaror {

	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
    System.out.println("enter num1: ");
    int a=sc.nextInt();
    System.out.println("enter num2: ");
    int b=sc.nextInt();
    System.out.println("enter num3: ");
    int c=sc.nextInt();
    
    int d=(a>b && a>c) ?  a : (b>a &&b>c) ? b: c;
    System.out.println("the biggest number is :"+d);
  }
}