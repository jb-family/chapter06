package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		//출장가서 준비되는대로 시작해라
		Thread thread = new DigitThread();
		//thread.run(); 비교해볼것 run()을 실행하면 run()메소드 실행하고 밑에 for문 실행
		thread.start();//start()사용하면 run()메소드에있는것과 for문이 동시에 실행 (멀티실행)
		
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
