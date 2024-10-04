package sasijava;
import java.util.*;
public class student_data {

	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name :");
	String name=sc.nextLine();
	System.out.println("enter your age: ");
	int age=sc.nextInt();
	System.out.println("enter your roll.no :");
	double roll=sc.nextDouble();		
	System.out.println("enter 6 marks: ");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	int m4=sc.nextInt();
	int m5=sc.nextInt();
	int m6=sc.nextInt();
	System.out.println("=========================================================");
    int total=m1+m2+m3+m4+m5+m6;
	float avg=total/6.0f;
    String res="",gra=" ";
    if(m1>34 && m2>34 && m3>34 && m4>34 && m5>34 && m6>34)
    {
    	res="pass";
    	if(avg>=85)
            gra="outstanding";
    	else if(avg>=75)
    		gra="excllent";
    	else if(avg>=65)
    		gra="very good";
    	else if(avg>=55)
    		gra="good";
    	else
    		gra="fail";
    }
    else
    {
    	res="fail";
    	gra="no grade";
    }   
    System.out.println("name    ="+name);
    System.out.println("age     ="+age);
    System.out.println("roll.no ="+roll);
    System.out.println("total   ="+total);
   	System.out.println("Average ="+avg);
   	System.out.println("result  ="+res);
   	System.out.println("grade ="+gra);
   	sc.close();
    	
    
	}
    
}

