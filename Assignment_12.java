package testNG_Assignments;

import org.testng.annotations.Test;

// "Using Grouping concept execute the Testng xml file by adding the ""Exclude" tag with system testing

public class Assignment_12
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
	   @Test(groups= {"Smoke"})
	   void testcase5()
	   {
		   System.out.println("5"); 
	   }	
	
}
