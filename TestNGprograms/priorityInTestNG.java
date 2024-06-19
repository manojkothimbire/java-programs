package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priorityInTestNG {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
	
	}
	@Test(priority = 1)
	public void firstname() throws InterruptedException
	{
		WebElement first=driver.findElement(By.name("firstName"));
		first.sendKeys("manoj");
		Thread.sleep(2000);

	}
	@Test(priority = 2)
	public void lastname() throws InterruptedException
	{
		WebElement last=driver.findElement(By.name("lastName"));
		last.sendKeys("kumar");
		Thread.sleep(2000);

	}
	@Test(priority = 3)
	public void phonenumber() throws InterruptedException
	{
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("12345");
		Thread.sleep(2000);

		
	}
	@Test(priority = 4)
	public void Email() throws InterruptedException
	{
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		email.sendKeys("manoj@12345");
		Thread.sleep(2000);

	}
	
	@AfterTest
	public void logout()
	{
		driver.quit();
	}


}
