package com.gul.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest2 {

	public static void main(String[] args) {
//		Map<String,List<String>> map  = new HashMap<String, List<String>>();
//		
//		List<String> abc = new ArrayList<String>();
//		abc.add("gulrez");
//		abc.add("");
//		List<String> abc2 = new ArrayList<String>();
//		map.put("1", abc);
//		map.put("2", abc2);
//		System.out.println(map);
		
		Map<String,Map<String,List<String>>> map  = new  HashMap<>();
		List<String> abc = new ArrayList<String>();
		abc.add("gulrez");
//		abc.add("");
		List<String> abc2 = new ArrayList<String>();
		Map<String,List<String>> map2 = new HashMap<>(); 
		map2.put("1", abc);
		if(!abc2.isEmpty()) {
			map2.put("2", abc2);
		}
		map.put("1",map2);
		System.out.println(map);
	}
}
