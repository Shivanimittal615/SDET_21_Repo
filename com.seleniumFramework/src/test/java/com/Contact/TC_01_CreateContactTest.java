package com.Contact;

import org.testng.annotations.Test;

public class TC_01_CreateContactTest {
	
	@Test(groups = "SmokeTest")
	
	public void createContactTest()
	{
		System.out.println("Execute Create Contact Test");
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


}
