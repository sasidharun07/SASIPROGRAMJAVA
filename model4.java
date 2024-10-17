package SasiJava;

public class model4 {

	public static void main(String[] args) {
		int k = 1;
	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= 5; j++) {
	            if (i == 2 || i == 4) {
	                System.out.print(--k + " ");
	            } else {
	                System.out.print(k++ + " ");
	            }
	        }
	        System.out.println();
	    }
	}
	}