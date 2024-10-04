package sasijava;
class daddy
{
	int cash=10000000;	
}
class son extends daddy
{
	void dis()
	{
		System.out.println("sasi access father's cash: "+cash);
	}
}
public class single_inheritance 
{
	public static void main(String[] args) 
	{
		son s = new son();
		s.dis();
	}
}
