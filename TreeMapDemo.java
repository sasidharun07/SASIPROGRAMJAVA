package SasiJava;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//TreeMap
		//key rules: unifque, ascending, null not accept
		//value rules : dupliates allow , key order , null many times

		TreeMap<String,Integer> m = new TreeMap<String,Integer>();
		m.put("aaa",55);
		m.put("aaa",65);
		m.put("bbb",75);
		m.put("zama",55);
		m.put("aaa",95);
		m.put("elamaran",15);
		m.put("ccc",75);
		m.put("ddd",null);
		m.put("eaf",55);

		m.put("eee",null);
		
		System.out.println(m);
	}

}
