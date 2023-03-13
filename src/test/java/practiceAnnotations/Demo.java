package practiceAnnotations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(invocationCount=2)
	public void mainTest()
	{
		Reporter.log("Welcome to TestNg",true);
		
	}
	@Test(priority=1)
	public void javaTest()
	{
		Reporter.log("Welcome to selenium with java",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="javaTest")
	public void manualTest()
	{
		Reporter.log("India",true);
	}

}
