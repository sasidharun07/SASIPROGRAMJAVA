package sasijava;
class demo
{
	
	private int age = 22;
	private int mark = 75;
	public int getAge() 
	{
		return age;
	}
	public void setAge(int val) 
	{
		System.out.println("age changed to "+val);
		age = val;
		val = 18;
	}
}
public class encapsulation {

	public static void main(String[] args)
	{
		demo obj = new demo();
		obj.setAge(20);
		System.out.println(obj.getAge());
	}

}
