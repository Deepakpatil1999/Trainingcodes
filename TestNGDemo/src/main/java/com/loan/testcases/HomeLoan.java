package com.loan.testcases;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test(groups= {"Smoke"})
	public void webPageHomeLoan()
	{
		System.out.println("web Page Home Loan");
	}
	@Test
	public void mobilePageHomeLoan()
	{
		System.out.println("mobile Page Home Loan");
	}
	@Test
	public void apiPageHomeLoan()
	{
		System.out.println("api Page Home loan");
	}

}
