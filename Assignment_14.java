package testNG_Assignments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Classroom Example Program Test_Case2,instead of String try to use Char data type in
//DataProvider concept  15/jan/2024

public class Assignment_14
{
	 @DataProvider(name="data3")
	 
	 	public Object[][] dataforstringfunction()
		{
			return new Object[][] {{'A'},{'M'},{'2'}};	
	}
	  @Test(dataProvider="data3") 
	  public void scenario1(char data)
	  {
		  System.out.println(data);
	
	  }	
}
