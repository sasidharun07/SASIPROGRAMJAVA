package sasijava;
class birds
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class dove extends birds
{
	void fly()
	{
		System.out.println("flying...");
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		dove d= new dove();
		birds b = new birds();
		d.fly();
		d.eat();
	}

}
