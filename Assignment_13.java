package testNG_Assignments;

import org.testng.annotations.Test;

/*"Using Grouping concept execute the Testng xml file by adding the ""Include"""
		 " tag for Regression,Integration,"Component*/


public class Assignment_13 
{
	@Test(groups= {"Smoke","System"})
	   void testcase1()
	   {
		 System.out.println("1");  
	   }

	   @Test(groups= {"System"})
	   void testcase2()
	   {
		   System.out.println("2");
	   }
	   @Test(groups= {"System","Regression","Smoke"})
	   void testcase3()
	   {
		   System.out.println("3");
	   }
	   @Test(groups= {"Integration"})
	   void testcase4()
	   {
		   System.out.println("4");
	   }
	   @Test(groups= {"Component"})
	   void testcase5()
	   {
		   System.out.println("5"); 
	   }
	
}
