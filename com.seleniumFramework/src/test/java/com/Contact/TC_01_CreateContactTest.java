package com.Contact;

import org.testng.annotations.Test;

public class TC_01_CreateContactTest {
	
	
	
	@Test(groups = "SmokeTest")
	
	public void createContactTest()
	{
		System.out.println("Execute Create Contact Test");
		String BROWSER = System.getProperty("chrome");
		String ENV = System.getProperty("https://staging.com");
		System.out.println("BROWSER=====>" +BROWSER  +", URL=======>"+ENV);
	}
	
	@Test(groups = "RegressionTest")
	
	public void createContactWithOrgTest()
	{
		System.out.println("Execute Create Contact with Test");
	}
	
	@Test(groups = "RegressionTest")

public void deleteContactTest()
{
	System.out.println("Execute delete Contact Test");
	
}
	
	@Test(groups = "RegressionTest")

	public void searchContactTest()
	{
		System.out.println("Execute search Contact Test");
	}
}



