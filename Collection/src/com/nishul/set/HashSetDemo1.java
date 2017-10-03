package com.nishul.set;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("A");
		h.add("Z");
		h.add(null);
		h.add("l");
		System.out.println(h.add("Z")); // false
		h.add(10);
		
		h.add(50);

		System.out.println(h); // [null, A, Z, 10, l]
	}
}
