package com.project10;

import java.util.*;

public class Stream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int add = Collections.max(list);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(add);
	}

}
