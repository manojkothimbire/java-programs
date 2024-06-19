package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hardassertdemo {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\microsoftEdgedriver\\abc\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	
}
	@Test
	public void title()
	{
		System.out.println("test case 1");
		System.out.println("test case 2");
		System.out.println("test case 3");
		
		String Expectedtitle="Orange";

		String Atualtitle=driver.getTitle();
		Assert.assertEquals(Expectedtitle, Atualtitle);
		
		System.out.println("test case 4");
		System.out.println("test case 5");
		System.out.println("test case 6");

	}
	
	
	
@AfterTest
public void logout()
{
		driver.quit();
}

}
