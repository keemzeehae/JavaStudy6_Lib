package com.jihye.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() { //배열 호출하는거 다시 해보기
		String name = "woosik dami 춘식이";
		String [] names = name.split(" ");
		
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i].trim());
		}
	}
	public void splitStudy2() {
		String sun = "어제는 workshopd에 다녀왔다.";
		String [] sunny = sun.split(" ");
		
		for (int i=0; i<sunny.length;i++) {
			System.out.println(sunny[i].trim());
		}
	}
	
	public void valueTest() { 
		int num = 123;
		String result = String.valueOf(num); //static
		System.out.println(result);
		
		String test = "0123";
		Integer result2 = Integer.valueOf(test);
		System.out.println(test);
		System.out.println(result2);
		
	}
	
	public void caseTest() { 
		String title = "West Side Story";
		String result1 = title.toLowerCase();
		System.out.println(title);
		System.out.println(result1);
		String result2 = title.toUpperCase();
		System.out.println(title);
		System.out.println(result2);
		
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		//reference type,지역변수,참조변수
		//참조변수명.멤버메서드명()
//		String result =title.replace('S', 't');
		String result =title.replace("West", "East");
		
		System.out.println(title);
		System.out.println(result);
		
	}
	
	public void subStringEx1 () {
		//키보드로부터 업로드할 파일명을 입력받아 
		//예를 들어 a.txt, b.pdf 
		//jpg,gif,png ->이미지파일 입니다 출력
		//txt,pdf,hwp ->문서파일입니다 출력
		//mp3,wav,ogg ->음원파일입니다 출력
		//나머지는 알 수 없는 파일입니다. 출력
		System.out.println("파일명을 입력해주세요");
		Scanner sc =new Scanner(System.in);
		String fileName = sc.next();
		String result = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(result);
		
		if (result.equals("jpg")|| result.equals("gif")||result.equals("png")) {
			System.out.println("이미지파일 입니다");
			
		}else if (result.equals("txt")||result.equals("pdf")||result.equals("hwp")){
			System.out.println("문서파일 입니다");
		}else if (result.equals("mp3")||result.endsWith("wav")||result.equals("ogg")){
			System.out.println("음원파일 입니다");
		}else {
			System.out.println("알 수 없는 파일 형식");
		}
		
	}
	
	public void subStringTest() {
		String title = "West Side Story";
//		String result = title.substring(5);
		String result = title.substring(title.indexOf("s"));
		System.out.println(result);
		result = title.substring(5,9);
		System.out.println(result);
	}
	
	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);
		
		String find = "y";
		//title find에 들어가있는 글자가 몇개 인지 출력
		int count =0;
		for (int i=0;i<title.length();i++) {
			int index= title.indexOf(find,i);
			if (index != -1) {
				count++;
				i = index;
			}else {
				break;
			}
		}
		System.out.println("count"+ count);
		//한글자씩 출력
		for(int i=0; i<title.length(); i++) {
			char ch = title.charAt(i);
			System.out.println(ch);
//			System.out.println(title.charAt(i)); 한번에
		
			
		}
	}
	
	public void indexofTest() {
		String msg = "Hello World!";
		//indexOf 호출
//		int num = msg.indexOf("o"); 
		//num은 primitive 타입이면서 지역변수
//		int num = msg.indexOf('W');//int ch ='W'; 문자를 인트에 넣는것 형변환
		int num = msg.indexOf("Wo");//int ch ='W'; 문자를 인트에 넣는것 형변환
		System.out.println(num);
	}
	
	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu") ;
		String str4 = new String("iu") ;
		System.out.println(str == str2 ); // (불안정함) 힙영역에 상수영역이 있는데 거기에 주소가 저장되는거임
		System.out.println(str3 == str4 );
		System.out.println(str == str3 );
		System.out.println("===================");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));
	
		
//		System.out.println("str" +str);
//		System.out.println("str2" +str2);
//		System.out.println(str2 == str);
//		System.out.println(str.equals(str2));
//		
		//equals 를 써야 그 속에 문자열을 비교가 됨(그 객체의 실제값)
	}
	public void study() {
		String name = "hello";
		//charAt메서드 호출 코드 작성
		
		char ch = name.charAt(1);
		//char 어떤 문자열에서 한글자를 빼내오고 싶을 때
		System.out.println(ch);
		String name2 = new String("hello2");
		System.out.println(name2);
		
	}

}
