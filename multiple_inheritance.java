package sasijava;
class sasi
{
	void parent()
	{
		System.out.println("parent");
	}
}
class c1 extends sasi
{
	void show1()
	{
		System.out.println("child 1");
	}
}
class c2 extends sasi
{
	void show2()
	{
		System.out.println("child 2");
	}
}
public class multiple_inheritance 
{
	public static void main(String[] args)
	{	
		c1 car=new c1();
		c2 c=new c2();
		car.parent();
		car.show1();
		c.parent();
		c.show2();				
	}
}
