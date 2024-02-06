package testNG_Assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Execute all the 9 annotations with 2 @tTest in Testng */

public class Assignment_1
{
	
	   @BeforeSuite 
	   public void bs()
	   {
		   System.out.println("Before Suite");
	   }
	   

	   @AfterSuite 
	   public void as()
	   {
		   System.out.println("AfterSuite");

	   }

	   @BeforeTest 
	   public void bt()
	   {
		   System.out.println("BeforeTest");

	   }
	   
	   @AfterTest
	   public void at()
	   {
		   System.out.println("AfterTest");

	   }
	   
	   @Test
	   public void add()
	   {
		   System.out.println(" Test1");

		   
	   }
	   @Test
	   public void method2()
	   {
		   System.out.println(" Test2");

		   
	   }
	   @BeforeClass
	   public void bc()
	   {
		   System.out.println(" BeforeClass");

		   
	   }
	  
	   @AfterClass
	   public void ac1()
	   {
		   System.out.println(" AfterClass");
	  
		   
	   }
	    
	   @BeforeMethod
	   public void bm()
	   {
		   
	   
		   System.out.println(" Beforemethod"); 
	   }
	   
	   @AfterMethod
	   public void am()
	   {
		   System.out.println(" Aftermethod");

	   }
	   
	   
	

}

