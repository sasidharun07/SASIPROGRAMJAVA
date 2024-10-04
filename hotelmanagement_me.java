package sasijava;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class hotelmanagement_me {

	public static void main(String[] args)
	{  
		LocalDate myjava = LocalDate.now();
		LocalTime myja = LocalTime.now();
		
	int amount1,amount_1=0,amount_2 = 0,amount_3 = 0,amount_4=0,amount_5=0,amount_6=0,amount_7 = 0,amount_8 = 0;
    int i;
    int num_dosai,num_itly,num_vadi,num_chapttai,num_bori,num_sambar,num_pongal,num_porrata;
    int itly = 7;
    int dosai = 9;
    int vadi = 5;
    int chapttai = 10;
    int bori = 12;
    int sambar = 15;
    int pongal = 20;
    int porrata = 15;
    
    Scanner sc = new Scanner(System.in);        
    System.out.println("   \n              WELCOME TO TOM HOTEL\n\n");
    System.out.println("MENU CARD : \n");
    do
    {
    System.out.println("Press 1 to Buy idly");
    System.out.println("Press 2 to Buy dosa");
    System.out.println("Press 3 to Buy vadai");
    System.out.println("Press 4 to Buy chapathi");
    System.out.println("Press 5 to Buy poori");
    System.out.println("Press 6 to Buy sambar rice");
    System.out.println("Press 7 to Buy pongal");
    System.out.println("Press 8 to Buy porrata\n");
    System.out.println("Enter The Choice:  \n");
    int ch = sc.nextInt();
    switch(ch)
    {
        case 1:
            System.out.println("\nhow much did you want: \n");
            num_itly = sc.nextInt();
            amount_1 = num_itly*itly;
            break;
        case 2:
            System.out.println("\nHow much did you want:  \n");
            num_dosai = sc.nextInt();
            amount_2 = num_dosai*dosai;
            break;
        case 3:
            System.out.println("\nHow much did your wnat:  \n");
            num_vadi = sc.nextInt();
            amount_3 = num_vadi*vadi;
            break;
        case 4:
            System.out.println("\nHow much did you want:  \n");
            num_chapttai = sc.nextInt();
            amount_4 = num_chapttai*chapttai;
            break;
        case 5:
            System.out.println("\nHow much did you want:  \n");
            num_bori = sc.nextInt();
            amount_5 = num_bori*bori;
            break;
        case 6:
            System.out.println("\nHow much did you want:  \n");
            num_sambar = sc.nextInt();
            amount_6 = num_sambar*sambar;
            break;
        case 7:
            System.out.println("How much did you want:  \n");
            num_pongal = sc.nextInt();
            amount_7 = num_pongal*pongal;
            break;
        case 8:
        	System.out.println("\nHow much did you want:  \n");
        	num_porrata = sc.nextInt();
        	amount_8 = num_porrata*porrata;
        	break;
            default:
            System.out.println("This Food Was Not Available!");
    }
    System.out.println("\nDid You Want To Continue Press 0.....else Press 11 twise to EXIT");
    i = sc.nextInt();
    }while(i==0);
    amount1 = sc.nextInt();
    amount1 = amount_1 +amount_2+amount_3+amount_4+amount_5+amount_6+amount_7+amount_8; 
    double apple = amount1*3.00/100.00;       
    System.out.println("=====================================================================================================================================================================");
    System.out.println("\n                  WELCOME TO KANNAN HOTEL              \n ");
    System.out.println("Your Bill is         : "+amount1); 
    System.out.println("Including GST        : "+apple);
    double total_bill = amount1+apple;
    System.out.println("Total Bill Amount Is : "+total_bill);
    System.out.println("Given The Amount : ");
   int given_amt = sc.nextInt();
   System.out.println("The Given Amount is : "+given_amt);
   double balance = given_amt-total_bill;
   System.out.println("The Balance is      "
   		+ ": "+balance);
    System.out.println("\nDate :"+myjava);
	System.out.println("Time :"+myja);
	
    System.out.println("   \n                Thank You For Coming! \n  ");
    System.out.println("          ***********Come Again*************");
    }
	

}
