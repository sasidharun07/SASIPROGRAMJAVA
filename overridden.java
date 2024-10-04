package sasijava;
class paybillss
{
	int amount = 300;
	void payment()
	{
		System.out.println("send money home , recharge mobile");
	}
}
class googlepayy extends paybillss
{
	int amount = 10;  
	googlepayy()
	{
		System.out.println("child constructor");
	}
	void payment()
	{
		super.payment();
		System.out.println("do direct bank to bank transfrs:"+amount);
		System.out.println("parent amount: "+super.amount);
	}
}
public class overridden {

	public static void main(String[] args) {
		googlepay b = new googlepay();
		b.payment();

	}

}
