package com.attra.threads;

public class PrintTable2 extends Thread {

	int n;

	public PrintTable2(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		print(n);
	}

	public void print(int n) {
		long starttime = System.currentTimeMillis();
		System.out.println("printing the table");
		System.out.println("thread name is " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Executed by " + Thread.currentThread().getName()+ ":" +i* n);
		}
		//System.out.println("completed the time " + (System.currentTimeMillis() - starttime));

	}
}
