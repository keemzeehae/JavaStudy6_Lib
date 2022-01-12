package com.jihye.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {

	private Scanner sc;

	// 생성자에서 초기화
	public WrapperEx1() {
		this.sc = new Scanner(System.in);
		// this 생략 가능
	}

	public void ex2() {
		// 키보드로부터 주민등록번호 입력
		System.out.println("주민번호를 입력하세요");
		String number = sc.next();
//		System.out.println(number);
		// 주민번호에서 한자리 가져오기 990123-1234567 에서 9 가져와
		// 9  7  1 2  2  4 - 1 2  3  4  5  6       7 - 마지막 번호는 체크용 번호
		//*2  3  4 5  6  7   8 9  2  3  4  5
		// 18 21 4 10 12 28  8 18 6  12 20 24
		// 결과를 모두 더함 ex) 	122
		
		int source =2;
		int sum =0;
		
		
		for (int i = 0; i < number.length()-1; i++) {
			String result = number.substring(i, i + 1); // 1,2 와야하고 2,3 와야함
	
			if (!result.equals("-")) {
				System.out.println(Integer.parseInt(result));
			}
//이런방법도 있음			
//			if (result.equals("-")) {
//				continue;
//			}
//			System.out.println(Integer.parseInt(result));

		}
		//-------------------------------------
		for (int i = 0; i < number.length()-1; i++) {
			char ch = number.charAt(i);
			if (ch != '-') {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num *source;
				source++;
				if (source>9) {
					source=2;
				}
			}
		}//for 끝
		System.out.println(sum);
		
		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
				//   122/11  -> 11 ....1
		sum = sum%11;
		
		//3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호와 같은지 비교
				//   11-1 =10 == 7
		sum =11-sum;

		//4. 만약에 결과값이 두자리면 결과값을 다시 10으로 나누어서 그 나머지값을
		//   체크용번호랑 같은지 비교
		//   10 /10 --- 0 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		if (sum >9) {
			sum = sum %10;
			
		}
		int check = Integer.parseInt(String.valueOf(number.charAt(number.length()-1)));
		System.out.println("check: "+check);
		System.out.println("sum: "+sum);
		if (sum ==check) {
			System.out.println("OK");
			
		}else {
			System.out.println("Error");
		}
	}

	public void ex1() {
		// 키보드로 부터 주민등록 번호 입력
		// 011224-1234567

		System.out.println("주민번호를 입력하세요");
		String number = sc.next();
		System.out.println(number);
		int age = 0;
		int year = 0;

//		문자열에서 특정한 숫자를 빼내오려면 charAt을 이용한 방법 1
//		char ch1 = number.charAt(0);
//		char ch2 = number.charAt(1);
//		String y = ""+ch1+ch2;

//		substring을 이용하는 방법 + 연도를 파싱하는 방법 2.
		String y = number.substring(0, 2);
		year = Integer.parseInt(y);
//		System.out.println(year+1);

//		성별파싱
//		String s = number.substring(7,8); //string타입
		char ss = number.charAt(7); // char타입
//		if (s.equals("1")||s.equals("2")){
//			
//		}
		int preYear = 2000;

		if (ss == '1' || ss == '2') {
			preYear = 1900;
		}

		year = preYear + year;
//		나이를 대충 계산
//		이번년도- 출생년도
		age = 2022 - year;
		System.out.println("Age: " + age);

//		남자? 여자?
		String se = "Woman";
		if (ss == '1' || ss == '3') {
			se = "Man";
		}
		System.out.println("성별: " + se);

		// 3-5 : 계절 봄
		// 6-8 : 여름
		// 9-11: 가을
		// 12-3: 겨울
		String result = "";
		int season = Integer.parseInt(number.substring(2, 4));
		if (season >= 3 && season <= 5) {
			result = "봄";
		} else if (season >= 6 && season <= 8) {
			result = "여름";
		} else if (season >= 9 && season <= 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		System.out.println(result);
	}
}
