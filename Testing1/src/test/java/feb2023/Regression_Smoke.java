package feb2023;

import org.testng.annotations.Test;

public class Regression_Smoke {

	
	@Test(groups = "Regression")
	public void Test1() {
	System.out.println("This is Regression" );	
	}
	

	@Test(groups = "smoke")
	public void Test4() {
	System.out.println("This is smoke" );	
	}
	

	@Test(groups = "Regression")
	public void Test2() {
	System.out.println("This is Regression" );	
	}
	

	@Test(groups = "smoke")
	public void Test3() {
	System.out.println("This is Smoke" );	
	}
}
