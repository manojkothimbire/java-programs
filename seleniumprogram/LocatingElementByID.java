package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByID {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.id("fname"));
		firstname.sendKeys("manoj");
		Thread.sleep(2000);
		
		WebElement lastname=driver.findElement(By.id("lname"));
		lastname.sendKeys("kumar");
	}

}
