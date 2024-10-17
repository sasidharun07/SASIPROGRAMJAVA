package SasiJava;
import java.util.*;
public class Example 
{
	public static void main(String[] args) 
	{
	Scanner sc  =  new Scanner(System.in);
    int k = 65;
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
            System.out.print(" " + (char) k++);
        }
        System.out.println();
    }
}
}