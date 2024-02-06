package testNG_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//Execute a class contain 2@test ,one @Test is having invocationCount=10 and 
//see how many test run is coming .

public class Assignment_6 
{
	 @Test(invocationCount=10)
	    public void testcase1()
	    {
	    	System.out.println("Hello");
	    	EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("India"); 
	    }
	 
		@Test()
		public void sum()
		{
		 System.out.println("addition");	
		}
	
	
	
}

