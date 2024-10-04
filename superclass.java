package sasijava;
class paybills
{
	int amount = 300;
	void payment()
	{
		System.out.println("send money home , recharge mobile");
	}
}
class googlepay extends paybills
{
	int amount = 100;
	void payment()
	{
		System.out.println("do direct bank to bank transfrs:"+amount);
		System.out.println("parent amount: "+super.amount);
	}
}
public class superclass {

	public static void main(String[] args) {
		googlepay b = new googlepay();
		b.payment();

	}

}
