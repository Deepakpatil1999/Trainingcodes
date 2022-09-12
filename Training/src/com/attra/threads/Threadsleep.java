package com.attra.threads;

public class Threadsleep {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		System.out.println("Starting the program");
		try {
			Thread.sleep(2000);
			long endtime = System.currentTimeMillis();
			System.out.println("thread name is : " + Thread.currentThread().getName());
			System.out.println("thread priority is : " + Thread.currentThread().getPriority());
			Thread.currentThread().setName("User thread");
			Thread.currentThread().setPriority(5);

			System.out.println("Thread name is now updated as " + Thread.currentThread().getName());
			System.out.println("Thread priority is now updated as " + Thread.currentThread().getPriority());

			System.out.println("completed the program execution with time of " + (endtime - starttime));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
