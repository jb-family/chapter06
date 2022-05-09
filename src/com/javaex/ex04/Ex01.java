package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args)throws InterruptedException {

		
		Runnable digit = new DigitImpl();
		Runnable upper = new UpperImpl();
		Runnable lower = new LowerImpl();
		
		Thread thread1 = new Thread(digit);
		Thread thread2 = new Thread(upper);
		Thread thread3 = new Thread(lower);
		
		
		
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
		
		
	}

}
