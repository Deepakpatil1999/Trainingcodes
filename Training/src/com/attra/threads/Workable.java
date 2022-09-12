package com.attra.threads;

public class Workable implements Runnable {
	public void run()
	{
		System.out.println("This is sending a message");
	sendSMS();
	}
	private void sendSMS()
	{
		System.out.println("sending sms");
	
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
