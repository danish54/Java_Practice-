package feb2023;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority = 0)
	public void testA() {
	System.out.println("priority = 0 "+" testA" );	
	}
	@Test
	public void AtestB() {
	System.out.println("priority = No "+" AtestB" );	
	}
	
	@Test(priority = 1)
	public void testC() {
	System.out.println("priority = 1 "+" testC" );	
	}
	
	@Test(priority = 2)
	public void testD() {
	System.out.println("priority = 2 "+" testD");	
	}
}
