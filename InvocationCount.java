package testNG_Assignments;

import org.testng.annotations.Test;

//Assign:1 Add two @tests with one @test with 10 invocation count and another with no invocation count
public class InvocationCount 
{
	//@Test(invocationCount=10)
	@Test(invocationCount=10,priority=2)
	
	public void testcase1()
	{
	System.out.println("hello");
	
}

	@Test
	
	public void testcase2()
	{
	System.out.println("My  name is Anjali");
	
}
}
