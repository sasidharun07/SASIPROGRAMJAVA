package sasijava;
public class calling_method 
{
	static void hi()
	{
    System.out.println("hi");
	}

    void hello()
    {
    System.out.println("hello");
    }

    void sasi()
    {
    System.out.println("sasidharun");
    }

public static void main(String args[])
{
    hi();
    calling_method o = new calling_method();
    o.hello();
    o.sasi();
}
}