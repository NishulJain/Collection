package com.nishul.list;

import java.io.Serializable;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("Nishul");
		l.add(true);
		l.add(25);
		l.add(null);
		l.add(10);

		System.out.println(l); // [10, Nishul, true, 25, null, 10]
		l.remove(2);
		System.out.println(l); // [10, Nishul, 25, null, 10]
		l.add(2, "M");
		System.out.println(l); // [10, Nishul, M, 25, null, 10]
		l.add("N");
		System.out.println(l); // [10, Nishul, M, 25, null, 10, N]

		System.out.println(l instanceof Serializable); // true
		System.out.println(l instanceof Cloneable); // true
		System.out.println(l instanceof RandomAccess); // true

		LinkedList l2 = new LinkedList();
		System.out.println(l2 instanceof Serializable); // true
		System.out.println(l2 instanceof Cloneable); // true
		System.out.println(l2 instanceof RandomAccess); // false
	}
}
