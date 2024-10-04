package sasijava;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		System.out.println(s.append(" world"));
		System.out.println(s.insert(1, "world"));
		System.out.println(s.replace(1, 3, "world"));
		System.out.println(s.delete(1, 3));
		
		
	}

}
