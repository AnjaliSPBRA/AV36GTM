package testNG_Assignments;
//Exceute 2@Test and 1 After suite annotation

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Assignment_4
{
	@Test
	public void add()
	{
		System.out.println("Addition");
	}
	
	@Test
	public void sub()
	{
		System.out.println("Subtraction");
	}
	
	@AfterSuite 
	   public void as()
	   {
		   System.out.println("AfterSuite");

	   }

}
