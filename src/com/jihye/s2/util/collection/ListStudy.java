package com.jihye.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	public void Study2() {
		ArrayList ar = new ArrayList();
		int num =1;
		Integer n = num; //autoBoxing
		ar.add(n);
		ar.add(1); //autoBoxing 자동으로 오토박싱을 해줘서 되는 것
		
		ar.add('a'); //cha타입이 캐릭터타입으로 autoBoxing 된것
		ar.add(3.14); 
		ar.add("name");// 이건 오토박싱한거 아님  다형성개념
		
		//프리미티브 타입-> 오브젝티브 타입이 아님 / 레퍼런스타입->super class 오브젝트 타입 상속받음
		String k = "iu"; // String is a Object
		Object obj = k; //다형성 
	}
	
	//메서드 생성
	public void Study1() {
		//배열타입으로 객체생성
		int [] numbers = new int[2];
		ArrayList ar = new ArrayList();//기본 10칸, 알아서 칸이 늘어남
		
		//대입
		numbers [0] =1;
		numbers[1]=2;
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1,100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();
		
		System.out.println(numbers[0]);
//		System.out.println(ar.get(0));
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("List 출력");
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
}

}
