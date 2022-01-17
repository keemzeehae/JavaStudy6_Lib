package com.jihye.s6;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);//잠깐 기다렸다가 실행하라는 소리
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i: "+i);
			
		}
	}

}
