package com.javaex.ex01;

public class DigitThread extends Thread{

	
	
	//필드
	
	//생성자
	
	//메소드 - gs
	
	//메소드 - 일반
	public void run() {	//Thread를 만들때에는 정해진 이름에다가 로직을 짜야한다. 그게 run()메소드임.

		for(int i = 0; i < 10; i++ ) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
