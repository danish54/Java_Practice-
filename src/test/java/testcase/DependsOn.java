package testcase;

import org.testng.annotations.Test;

public class DependsOn {
	
	@Test(priority = 1)
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test(priority = 3,dependsOnMethods = "Test1")
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test(priority = 2,dependsOnMethods = "Test2")
	public void Test3() {
		System.out.println("Test3");
	}
}
