package com.attra.threads;

public class ThreadByRunnaleInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("printing from the thread : " +Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadByRunnaleInterface r1=new ThreadByRunnaleInterface();
		
		Thread t1=new Thread(r1,"runnable");
		t1.start();
		System.out.println("Program end " + Thread.currentThread().getName());
		System.out.println("program end");
	}
	

}
