package SasiJava;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashtableDemo {

	public static void main(String[] args) {
		//Hashtable
		//key rules: unique, random, null not accept
		//value rules : dupliates allow , key order , null many times
		Hashtable<String,Integer> m = new Hashtable<String,Integer>();

		m.put("aaa",55);
		m.put("aaa",65);
		m.put("bbb",75);
		m.put("zama",55);
		m.put("aaa",95);
		m.put("elamaran",15);
		m.put("ccc",75);
		m.put("eaf",55);

		
		System.out.println(m);



	}

}
