package com.jihye.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	public void study1() {
		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		
		//put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1);
		
		System.out.println(map);
		
		Integer num = map.get("f2");
		System.out.println(num);
		
		map.remove("f3");
		System.out.println(map);
		
		map.put("f1", 100);
		System.out.println(map);
		//똑같은 키에 다른 value를 넣으면 수정이 된다
		
		Integer n = map.get("test");
		System.out.println("N: "+n);
		//없는 키로 꺼내면 레퍼런스 타입으로 넣어주는 거니까 null 이 나온다
		
		map.clear();
		System.out.println(map);
		
		String name = "k5";
		map.put(name, null);
		//변수형태로 넣을 수도 있고, null이 들어갈 수 있는 이유는 Integer 레퍼런스 타입이니까
	}

}
