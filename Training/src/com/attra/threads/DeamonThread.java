package com.attra.threads;

public class DeamonThread {
	public static void main(String[] args) {
		System.out.println("starting a program");
		long start=System.currentTimeMillis();
		PrintTable pt=new PrintTable(1);
		System.out.println("thread name is " + Thread.currentThread().getName());
		System.out.println("the thread state 1 is :" +pt.getState());
		System.out.println("Is thread is Deamon thread " + pt.isDaemon());
		System.out.println("Is main thread a deamon " + Thread.currentThread().isDaemon());
		pt.setDaemon(true);
		System.out.println("Is thread is deamon thread " + pt.isDaemon());
		System.out.println("Is main thread a deamon " + Thread.currentThread().isDaemon());
		
		
	}

}
