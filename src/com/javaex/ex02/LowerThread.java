package com.javaex.ex02;

public class LowerThread extends Thread {

	
	
	
	
	public void run() {
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1020);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
	}
	
	
	
	
	
	
}
