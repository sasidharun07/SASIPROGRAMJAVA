package sasijava;
interface TamTeacher
{
	String sub1 = "tamil";
	void dis1();
}

interface EngTeacher
{
	String sub2 = "english";
	void dis2();
}
interface MatTeacher
{
	String sub3 = "maths";
	void dis3();
}

public class interfacedemo implements TamTeacher,EngTeacher,MatTeacher{

	public static void main(String[] args) {
		interfacedemo s = new interfacedemo();
		s.dis1();
		s.dis2();
		s.dis3();
	}

	@Override
	public void dis1() {
		// TODO Auto-generated method stub
		System.out.println("student access teacher 1 subjects: "+sub1);
	}

	@Override
	public void dis2() {
		// TODO Auto-generated method stub
		System.out.println("student access teacher 2 subjects: "+sub2);
	}
	public void dis3() {
		// TODO Auto-generated method stub
		System.out.println("student access teacher 3 subjecrts: "+sub3);
	}
	

}
