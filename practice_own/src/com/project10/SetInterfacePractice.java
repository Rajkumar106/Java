package com.project10;

import java.util.*;
import java.util.Map.Entry;

public class SetInterfacePractice {
	private static char[] j;

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(10, "java");
		hm.put(20,"sql");
		hm.put(30,"oops");
		hm.put(40,"sql");
		hm.put(50,"oracle");
		hm.put(60,"DB");
		hm.put(10,"selenium");
		hm.put(50,"psql");
		hm.put(40,"hadoop");
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for(Entry<Integer, String> keys:hm.entrySet()) {
			System.out.println(keys);
		}
		for(Entry<Integer, String> entries:hm.entrySet()) {

				System.out.println(entries.getKey()+"\n"+entries.getValue());
				
		}
	}
}
