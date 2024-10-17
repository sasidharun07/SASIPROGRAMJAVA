package SasiJava;

public class model5 {

	public static void main(String[] args) {
        int k = 65;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" " + (char) k++);
            }
            System.out.println();
        }
    }
}