package com.jihye.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("클라이언트 입니다.");
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("172.30.1.26", 8282);
			System.out.println("서버와 접속이 성공!!");
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.nextLine();
			//nextline 띄어쓰기 미포함 , \n을 만날때까지 가져옴
			System.out.println(message); //hello -> 0,1로 바꿔서 나감. 그래서 h e l l o -> 01
			//1. output Stream을 구해오기
			OutputStream os = socket.getOutputStream();//byte -> bit를 처리
			OutputStreamWriter ow = new OutputStreamWriter(os);//char(문자처리)
			BufferedWriter bw = new BufferedWriter(ow);
			//--------전송 준비 끝

			//전송
			bw.write(message+"\r\n"); //\r옆으로 보내라 \n: 다음줄로 이동
			//강제로 버퍼 비우기
			bw.flush();
			
			
			//서버에서 클라이언트로 온 메시지 받아주기
			
			InputStream is =socket.getInputStream();//0,1로 처리
			InputStreamReader ir = new InputStreamReader(is); //char 타입 문자타입
			BufferedReader br = new BufferedReader(ir); //String
			
			message = br.readLine();
			
			System.out.println("Server: "+ message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
