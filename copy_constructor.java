package sasijava;

import java.util.Scanner;

public class copy_constructor {


	int eid;
	String ename;
	float sal;
	Scanner sc = new Scanner(System.in);
	copy_constructor(int eno,String ename,float sal)
	{
		eid=eno;
		this.ename=ename;
		this.sal=sal;
	}
void display()
{
	System.out.println("employee id: "+eid);
	System.out.println("employee name: "+ename);
	System.out.println("employee salary: "+sal);
	
}
	public static void main(String[] args) {
		System.out.println("tis is first execution inbuilt main method : ");
		//this is way of create object 
		copy_constructor e1 = new copy_constructor(1001,"sasi",6500000);
		copy_constructor e2 = new copy_constructor(1001,"kannan",6500000);
		copy_constructor e3 = new copy_constructor(1001,"sasimani",6500000);
		e1.display();
		e2.display();
		
		e2=e1; //copy constructor
		
		e1.display();
		e2.display();
		
	

	}

}
