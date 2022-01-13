package com.jihye.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		//출력할때 순서가 없음 넣는 방식이 있긴한데 
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
			
		}
	}
	
	public void study3() {
		
		//hashset은 중복된 데이터 값을 안넣어줌
		Random random = new Random();
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size()!=6) {
			int num = random.nextInt(45)+1;
			lotto.add(num);
			
		}
//		이럴경우에 배열이 정해져 있는데 중복된 값이 나오면 삭제되고 나오기 때문에 5개만 뽑혀진 것처럼 보일 수 있음 
//		for (int i = 0; i < 6; i++) {
//			int num = random.nextInt(45) + 1;// 0~10미만의 숫자를 뽑아줌
//			lotto.add(num);
//		}
		System.out.println(lotto);

		
	}
	public void study2() {
		// Random
		Random random = new Random();

		// Lotto 번호를 랜덤 1-45번까지를 6개를 랜덤하게 뽑음
		// 모아뒀다가 한꺼번에 뽑음
		// ArrayList에 담아
		//ArrayList 중복된 데이터 허용
		//ArrayList를 썼을때 중복되지 않게 어떻게 뽑을 수 있을까
		ArrayList<Integer> lotto = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1;// 0~10미만의 숫자를 뽑아줌
			lotto.add(num);
		}
		System.out.println(lotto);

	}

	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);

		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
