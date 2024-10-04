package sasijava;
class HM
{
	String sub = "all subject";
}
class teacher extends HM
{
	String sub="JAVA";
	void show()
	{
		System.out.println("teacher learning "+super.sub+" from HM");
	}
}
class Studentt1 extends teacher
{
	void show()
	{
		super.show();
		System.out.println("student 1 reference "+sub+"from teacher");
	}
}
class Studentt2 extends teacher
{
	void show()
	{
		super.show();
		System.out.println("Student 2 reference "+sub);
	}
}

public class hybrid_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
