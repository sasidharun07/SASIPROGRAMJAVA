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
class babydove extends dove
{
	void sleeping()
	{
		System.out.println("sleeping...");
	}
}
public class multi_inheritance {

	public static void main(String[] args) {
		babydove d = new babydove();
		d.eat();
		d.fly();
		d.sleeping();
	}

}
