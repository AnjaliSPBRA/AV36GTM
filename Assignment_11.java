package testNG_Assignments;

//Take screeshot with other than JPEG/JPG format
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Take screeshot with other than JPEG/JPG format

public class Assignment_11
{
     @Test
     public void testcase1() throws IOException

{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	TakesScreenshot ts1= driver ;
	File source=ts1.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\verma\\eclipse-workspace\\TestNG\\Screenshot\\anj.png");
	FileUtils.copyFile(source, destination);
}
}	

