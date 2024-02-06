package testNG_Assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*Assign:2 Execute 3@Test and 1 before suite and 1 After Method annotation.  */

public class Assignment_2
{

	@BeforeSuite 
	   public void bs()
	   {
		   System.out.println("Before Suite");
	   }
	

	   @AfterMethod
	   public void am()
	   {
		   System.out.println(" Aftermethod");

	   }
	   
	   @Test
	   public void add()
	   {
		   System.out.println(" Test1");

		   
	   }
	   @Test
	   public void sub()
	   {
		   System.out.println(" Test2");

		   
	   }
	   @Test
	   public void mul()
	   {
		   System.out.println(" Test3");

		   
	   }
	
}
