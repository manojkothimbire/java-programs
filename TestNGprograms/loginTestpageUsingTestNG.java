package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTestpageUsingTestNG {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	
	}
	@Test
	public void testcase1() throws InterruptedException
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);

			
	}
	@Test
	public void testcase2() throws InterruptedException
	{
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);

		
	}
	@Test
	public void testcase3() throws InterruptedException
	{
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);

	}
	@AfterTest
	public void logout()
	{
		driver.quit();
	}

}
