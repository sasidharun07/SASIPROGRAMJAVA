package sasijava;

public class overloading_constructor {
	overloading_constructor(int a)
	{
		System.out.println("area of square : "+(a*a));
	}
	overloading_constructor(float r)
	{
		System.out.println("area of circle : "+(Math.PI*r*r));
	}
	overloading_constructor(int l,int b)
	{
		System.out.println("area of rectangle: "+(l*b));
	}
	

	public static void main(String[] args) {
		new overloading_constructor(10);
		new overloading_constructor(10,20);
		new overloading_constructor(10.3f);

	}

}
