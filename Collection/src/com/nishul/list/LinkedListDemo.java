package com.nishul.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Durga");
		l.add(10);
		l.add(null);
		l.add(true);
		System.out.println(l); // [10, Durga, 10, null, true]
		Object o = l.set(0, "Software");
		System.out.println(l); // [Software, Durga, 10, null, true]
		System.out.println(o); // 10 linked list set will return old value and
								// set new assigned value
		l.add(0, "test");
		System.out.println(l); // [test, Software, Durga, 10, null, true]
		l.removeLast();
		System.out.println(l); // [test, Software, Durga, 10, null]
		l.addFirst("Hello");
		System.out.println(l); // [Hello, test, Software, Durga, 10, null]
	}
}
