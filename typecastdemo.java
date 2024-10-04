package sasijava;

public class typecastdemo {

	public static void main(String[] args) {
		
		byte v1 = 127;
		short v2 = 129;
		int v3 = 200;
		long v4 = 8888;
		
		byte v5=v1;//automatic casting
		short v6 = v1; //explicit 
		int v7 = v1;
		long v8 = v1;
		
		byte v9 = (byte)v2;//type casting //implicit
		System.out.println(v9);
		
		float tot = (float)331/5;
		System.out.println(tot);

	}

}
