package com.attra.threads;

public class Printtablemain2 {
	public static void main(String[] args)  {
		long starttime=System.currentTimeMillis();
		System.out.println("starting the program");
		PrintTable pt=new PrintTable(3);
		System.out.println("thread name is " + Thread.currentThread().getName());
		pt.start();
		PrintTable pt1=new PrintTable(2);
		System.out.println("thread name is " + Thread.currentThread().getName());
		pt1.start();
		//pt.print(3);
		
		try
		{
			pt.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("completed the time " + (System.currentTimeMillis() - starttime));
		}

}
