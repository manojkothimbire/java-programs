package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autodropdownlisthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		//window maximize
		
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);

	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	Thread.sleep(2000);

	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("admin123");
	Thread.sleep(2000);

	WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	Thread.sleep(2000);
	
	WebElement Admin=driver.findElement(By.xpath("//span[text()='Admin']"));
	Admin.click();
	Thread.sleep(2000);
	WebElement Employeename=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	Employeename.sendKeys("a");
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	act.moveToElement(Employeename).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	act.moveToElement(Employeename).sendKeys(Keys.ENTER).perform();
	

	}

}
