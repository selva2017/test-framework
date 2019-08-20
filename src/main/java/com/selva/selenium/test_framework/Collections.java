package com.selva.selenium.test_framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Set, List & map 
		Set<Integer> set = new HashSet<Integer>(); //TreeSet,SortedSet
		set.add(1);
		set.add(178);
		for(Integer s: set){
			System.out.println(s);
		}

		Set<String> setString = new HashSet<String>();
		setString.add("Selva");
		setString.add("Raj");
		setString.remove("Raj");
		for (String s: setString)
			System.out.println(s);

		Map<String,String> maps = new HashMap<String,String>();//SortedMap
		maps.put("1name", "Selva");
		maps.put("name2", "Saul");
		maps.put(null, "Columbus");
		maps.put(null, "Columbus1");
		Set<String> keys = maps.keySet();//Keyset - get all the keys
		for(String key:keys){
			System.out.println(key+":"+maps.get(key));
		}

	}

}
