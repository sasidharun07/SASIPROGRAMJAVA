package sasijava;
class gf
{
	int cash=2000000000;
}
class daddyy extends gf
{
	int cash = 1000000000;
	void dis()
	{
		int cash = 345;
		System.out.println("my father access gf cash : "+super.cash);
		System.out.println("my father access packet cash : "+cash);
		System.out.println("my father access self cash : "+this.cash);
	}
}
class sonn extends daddyy
{
	void dis()
	{
		super.dis();
		System.out.println("sasi access father's cash : "+cash);
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		sonn s = new sonn();
		s.dis();
	}

}
