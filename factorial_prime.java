package sasijava;
import java.util.*;
public class factorial_prime {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true) {
        System.out.print("\nEnter a prime number: \n");
        int number = scanner.nextInt();        
        if (isPrime(number)) 
        {
            long factorial = calculateFactorial(number);
            System.out.println(number+" is prime number");
            System.out.println("Factorial of " + number + " is: " + factorial);
        } else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }
	}
    public static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public static long calculateFactorial(int num)
    {
        long factorial = 1;
        for (int i = 2; i <= num; i++) 
        {
            factorial *= i;
        }
        return factorial;
    }
}

