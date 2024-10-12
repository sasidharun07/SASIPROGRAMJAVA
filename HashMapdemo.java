package SasiJava;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapdemo {

	public static void main(String[] args) {
		//HashMap
		//key rules: unique, random order, null only one time
		//value rules : dupliates allow , key order , null many times
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("aaa",55);
		m.put("aaa",65);
		m.put("bbb",75);
		m.put("zama",55);
		m.put("aaa",95);
		m.put("elamaran",15);
		m.put("ccc",75);
		m.put("ddd",null);
		m.put(null,55);

		m.put(null,null);
		
		System.out.println(m);

	}

}
