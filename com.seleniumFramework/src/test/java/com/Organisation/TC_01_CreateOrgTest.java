package com.Organisation;

import org.testng.annotations.Test;

public class TC_01_CreateOrgTest {
	
	@Test(groups = "SmokeTest")
	
	public void createOrgTest()
	{
		System.out.println("Execute Create Org Test");
	}
	
	@Test(groups = "RegressionTest")
	
	public void createOrgWithIndTest()
	{
		System.out.println("Execute Create Org with Ind Test");
	}
	
	@Test(groups = "RegressionTest")

public void deleteOrgTest()
{
	System.out.println("Execute delete Org Test");
}


}
