package com.attra.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool  {
	
	
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		ExecutorService sr= Executors.newFixedThreadPool(5);
		
		for(int i =0; i<10; i++)
		{
			Workable wt=new Workable();
			sr.execute(wt);
			//sr.execute(wt);
			
		}
		sr.shutdown();
		System.out.println("Finished sending sms " + (System.currentTimeMillis() - starttime));
	
	}
	

}
