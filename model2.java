package SasiJava;

public class model2 {

	public static void main(String[] args) 
	{
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= j)//if(i>=j) 
                {
                    System.out.print(" " + i + j + " ");
                } 
                else 
                {
                    System.out.print("  "); // Print spaces for formatting
                }
            }
            System.out.println();
        }
    }
}
