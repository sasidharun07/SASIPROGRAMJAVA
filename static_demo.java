package sasijava;
class students
{
	String name;
	int age;
    static String teacher_name;
	static String sec;
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Teacher Name = "+teacher_name);
		System.out.println("section :"+sec);
	}
	static
	{
		students.teacher_name = "david";
		students.sec = "XII-A10\n";
	}
}
public class static_demo 
{
	public static void main(String[] args) 
	{
		students s1 = new students();
		students s2 = new students();
		s1.name = "mani";
		s1.age = 20;        
		s2.name = "kannan";
		s2.age = 20;	
		s1.display();
		s2.display();
	}
}