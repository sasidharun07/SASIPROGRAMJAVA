package SasiJava;

public class model6 {

	public static void main(String[] args) {
        int k = 0;
        int x;
        
        for (int i = 1; i <= 5; i++) {
            x = i + k;
            for (int j = 1; j <= i + k; j++) {
                System.out.print(x++ + " ");//(" * ");
            }
            k++;
            System.out.println();
        }
    }
}