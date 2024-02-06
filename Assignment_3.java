package testNG_Assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//Exceute 2@Test and 1 aftermethod annotation.

public class Assignment_3

{

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
	   
	   @AfterMethod
	   public void am()
	   {
		   System.out.println(" Aftermethod");

	   }
}
