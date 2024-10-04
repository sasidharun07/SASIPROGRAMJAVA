package sasijava;
abstract class sasI
{
	int mark = 100;
	void show1()
	{
		System.out.println("This is Completed method "+mark);
	}
	abstract void show2();
	abstract void show3();
	
}
public class ABSDEMO extends sasI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABSDEMO AB = new ABSDEMO();
		AB.show1();
		AB.show2();
		AB.show3();

	}

	@Override
	void show2() {
		// TODO Auto-generated method stub
		System.out.println("This is Incomplete method "+ mark);
	}

	@Override
	void show3() {
		// TODO Auto-generated method stub
		System.out.println("This is Incomplete method "+mark);
	}

}
