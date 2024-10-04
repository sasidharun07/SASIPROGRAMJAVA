package sasijava;
import java.util.*;
public class argunment_constructor {
	int eid;
	String ename;
	float sal;
	Scanner sc = new Scanner(System.in);
	argunment_constructor(int eno,String ename,float sal)
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
		argunment_constructor e1 = new argunment_constructor(1001,"sasi",6500000);
		argunment_constructor e2 = new argunment_constructor(1001,"kannan",6500000);
		argunment_constructor e3 = new argunment_constructor(1001,"sasimani",6500000);
		e1.display();
		e2.display();
		e3.display();

	}

}
