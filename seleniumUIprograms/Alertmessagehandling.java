package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessagehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		//window maximize
		
	
	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(2000);
	
	WebElement okbutton=driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
	okbutton.click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	WebElement cancelbutton=driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
	cancelbutton.click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);

	WebElement promptbox=driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
	promptbox.click();
	Thread.sleep(2000);

	driver.switchTo().alert().sendKeys("manoj");
	Thread.sleep(2000);

	driver.switchTo().alert().accept();

	}

}
