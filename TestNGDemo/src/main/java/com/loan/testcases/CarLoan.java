package com.loan.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("before Method");
	}
	
	@Test
	public void mobilePageCarLoan()
	{
		System.out.println("mobile Page Car Loan");
	}
	@Test
	public void apiPageCarLoan()
	{
		System.out.println("api Page Car Loan");
	}

}
