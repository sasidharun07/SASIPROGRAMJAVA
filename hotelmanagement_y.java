package sasijava;
import java.util.*;
public class hotelmanagement_y {

	public static void main(String[] args) 
	{
	int qty;
	int amt;
	int bill = 0;
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("mini tech hacker");
	do
	{
	System.out.println("press 1 to buy idli");
	System.out.println("press 2 to buy dosai");
	System.out.println("press 3 to buy sambar");
	System.out.println("press 4 to buy vadai");
	System.out.println("press 5 to buy paniyaram");
	System.out.println("what is your choice: ");
	int ch = sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("itly quinity ?");
		qty = sc.nextInt();
		amt = qty*10;
		bill = bill + amt;
		break;
	case 2:
		System.out.println("dosai quinity ?");
		qty = sc.nextInt();
		amt = qty*30;
		bill = bill + amt;
		break;
	case 3:
		System.out.println("sambar quinity ?");
		qty = sc.nextInt();
		amt = qty*10;
		bill = bill + amt;
		break;
	case 4:
		System.out.println("vadi quinity ?");
		qty = sc.nextInt();
		amt = qty*7;
		bill = bill + amt;
		break;
	case 5:
		System.out.println("paniram quinity ?");
		qty = sc.nextInt();
		amt = qty*10;
		bill = bill + amt;
		break;
		default:
			System.out.println("this food was not available , so choice menu food");
			break;	
		}
	System.out.println("you want cantinue.....press 1 or pree 0");
	i = sc.nextInt();
	}while(i==1);
	System.out.println("your total bill is: "+bill);
    	
}

}
