package com.selva.selenium.test_framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("rra");
		list.add("trt");
		list.add("rare");
		Collections.sort(list);
		System.out.println(list);
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());

		LinkedList<String> llist = new LinkedList<String>();
		llist.add("1");
		llist.add("2");
		Iterator<String> it=llist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
