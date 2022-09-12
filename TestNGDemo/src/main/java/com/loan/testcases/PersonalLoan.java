package com.loan.testcases;

import org.testng.annotations.Test;

public class PersonalLoan {
	@Test(groups= {"Smoke"})
	public void webPagePersonalLoan()
	{
		System.out.println("Web page car loan");
	}
	@Test(dependsOnMethods= {"TestB", "TestC"} )
	public void TestA()
	{
		System.out.println("TestA");
	}
	@Test
	public void TestB()
	{
		System.out.println("TestB");
	}
	
	@Test
	public void TestC()
	{
		System.out.println("TestC");
	}

}
