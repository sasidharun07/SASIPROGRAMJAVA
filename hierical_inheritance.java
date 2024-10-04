package sasijava;
class Teacher
{
	String sub="JAVA";
}
class Student1 extends Teacher
{
	void show()
	{
		System.out.println("adithya reference "+sub+" from teacher");
	}
}
class Student2 extends Teacher
{
	void show()
	{
		System.out.println("elamaran reference "+sub+" from teacher");
	}
}
public class hierical_inheritance {

	public static void main(String[] args) 
	{
		Student1 s1 = new Student1();
		Student2 s2 = new Student2();
		s1.show();
		s2.show();

	}

}
