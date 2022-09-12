package com.attra.threads;

public class Threadjoin {
	
	public static void main(String[] args) {
		System.out.println("starting a program");
		long start=System.currentTimeMillis();
		PrintTable pt=new PrintTable(1);
		System.out.println("thread name is " + Thread.currentThread().getName());
		System.out.println("the thread state 1 is :" +pt.getState());
		pt.start();
		try {
			System.out.println("");
			pt.join();
			
			PrintTable pt1=new PrintTable(2);
			System.out.println("thread name is " + Thread.currentThread().getName());
			pt1.start();
			
			PrintTable pt3=new PrintTable(3);
			System.out.println("thread name is " + Thread.currentThread().getName());
			pt3.start();
			
			System.out.println("the thread 2 state is : " + pt1.getState());
			System.out.println("the thread 3 state is : " + pt3.getState());
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed the time " + (System.currentTimeMillis() - start));
		}

}
