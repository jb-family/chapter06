package com.javaex.ex03;

public class Digitimpl implements Runnable {

	//필드
	
	//생성자
	
	//메소드 - gs
	
	//메소드 - 일반
	
	
	public void run() {
		for(int i = 0; i < 9; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
}
