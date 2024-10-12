package SasiJava;

import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {

		//deque
		//1 type : array deque
		
		//rules:
		//duplicates allow , insertion order , null not accept
		
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		ad.add(34);
		ad.add(44);
		ad.add(56);
		ad.add(34);
		ad.add(76);
		ad.add(34);
		ad.add(4);
		//ad.add(null);//error
		
		System.out.println(ad);

		

	}

}
