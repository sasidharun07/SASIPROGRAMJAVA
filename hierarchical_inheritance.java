package sasijava;
class eagle
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class frog extends eagle
{
	void eatfrog()
	{
		System.out.println("eating frog...");
	}
}
class snack extends eagle
{
	void eatsnack()
	{
		System.out.println("eating snack...");
	}
}
public class hierarchical_inheritance {

	public static void main(String[] args) {
		frog f = new frog();
		f.eat();
		f.eatfrog();
		snack s = new snack();
		s.eat();
		s.eatsnack();
	}

}
