package sasijava;

import java.util.Scanner;

public class emp {
int eid;
String ename;
float sal;
Scanner sc = new Scanner(System.in);
void getinfo()
{
	System.out.println("enter employee id: ");
	eid = sc.nextInt();
	System.out.println("enter employee name : ");
	ename = sc.nextLine();
	ename = sc.nextLine();
	System.out.println("enter employee salary : ");
	sal = sc.nextFloat();
	
}
void display()
{
	System.out.println("employee id : "+eid);
	System.out.println("employee name : "+ename);
	System.out.println("employee salary : "+sal);
}
	public static void main(String[] args) {
		System.out.println("this is first execrtion inbuilt main method");
		//this is way to reate object 
		emp e = new emp();
		emp e1 = new emp();
		e.getinfo();
		e.display();
		e1.getinfo();
		e1.display();

	}

}