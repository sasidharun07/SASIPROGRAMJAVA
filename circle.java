package sasijava;
public class circle {
	
double radius;
String color;

public circle()
{
	radius = 1.0;
	color = "red";
}
public circle(double r,String c)
{
	radius = r;
	color = c;
}
public double getradius(double r)
{
	return radius;
}
public void setradius(double r)
{
	radius = r;
}
public String getcolor()
{
	return color;
}
public void setcolor(String c)
{
	color = c;
}
public double area()
{
	return 3.14*radius*radius;
}
public double circumference()
{
	return 2*3.14*radius;
}
public String toString()
{
	return"circle[ Radius = "+radius+", color =  "+color+" ]";
}
	public static void main(String[] args) {
		circle c1 = new circle();
		System.out.println("color :"+c1.color);
		System.out.println("radius :"+c1.radius);
		System.out.println("area :"+c1.area());
		System.out.println("circumferance :"+c1.circumference());
		
		circle c2 = new circle(3.5,"pink");
		System.out.println("\ncolor :"+c2.getcolor());
		System.out.println("radius :"+c2.getradius(0));
		System.out.println("area :"+c2.area());
		System.out.println("circumference :"+c2.circumference());
		System.out.println("\n"+c1);
		System.out.println(c2);
		}
}
