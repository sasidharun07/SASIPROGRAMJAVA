package sasijava;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class ATM 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		LocalDate myjava = LocalDate.now();
		LocalTime myja = LocalTime.now();		
		
		int pin=1234;
		double balance = 100000000.00;		
		double Addamount = 0.00;
		double TakeAmount = 0.00;		
		String name;
		System.out.println("               WELCOME TO TOM BANK          \n");
		System.out.println("Enter Your Pin : ");
		int passoword = sc.nextInt();
		if(passoword == pin)
        {
			System.out.println("Enter Your Name : ");
			name = sc.next();
			System.out.println("\n       WELCOME "+name);	
			
			while(true)
            {
				System.out.println("\nPress 1 to Check your Balance");
				System.out.println("\nPress 2 to Credited Amount");
				System.out.println("\nPress 3 to Withdrwn Amount");
				System.out.println("\nPress 4 to Take Respecit");
				System.out.println("\nPress 5 to EXIT");		
				
				int opt = sc.nextInt();
				switch(opt)
				{
				case 1:
					System.out.println("\nYour Current Balance Is : \n"+balance);
					System.out.println("\nDate  :"+myjava);
					System.out.println("Time  :"+myja);					
					break;
				case 2:
					System.out.println("\nHow Much Amount Did You Want To Add To Your Account: ");
					Addamount = sc.nextInt();
					System.out.println("\nDate  :"+myjava);
					System.out.println("Time  :"+myja);					
					System.out.println("\n        ****Successfully credited.****\n");					
					balance = Addamount + balance;					
					break;
				case 3:
					System.out.println("\nHow Much Amount Did You Want: \n");
					TakeAmount = sc.nextInt();
					if(TakeAmount>balance)
					{
						System.out.println("\nYour Balance Is Insufficient");
						System.out.println("Try Lessthan Current Balance!");
					}
					else
					{
						System.out.println("\nDate  :"+myjava);
						System.out.println("Time  :"+myja);						
						System.out.println("\n      ****Your Amount Was Successfuly withdraw****\n");
						balance = balance - TakeAmount;						
					}					
					break;
				case 4:
				{
					System.out.println("\n****WELCOME TO TOM ATM ****\n");
					System.out.println("\nYOUR RESPECIT IS: \n");
				    System.out.println("Available Balance Is                     :"+balance);
				    System.out.println("Number Of Amount Deposited               :"+Addamount);
				    System.out.println("Number Of Amount Withdraw                :"+TakeAmount);
				    System.out.println("\nDate  :"+myjava);
					System.out.println("Time  :"+myja);					
				    System.out.println("\n\n      ********Thanks For Coming!***********      \n");					
				    break;				    
				    }
			    default:
			   	{ 
				    System.out.println("\n                       Thank For Coming      ");
				    break;  
			    }
			}
				if(opt==5)
				{
					System.out.println("\n             *******Come Again! Thank You**********");
					break;
					
				}					
            }				
        }		
		else
		{
			System.out.println("\n                        ***     Wrong Password   ***\n");
			System.out.println("                    *****    Enter Your Correct pin!   *****");
		}	
	}
}



