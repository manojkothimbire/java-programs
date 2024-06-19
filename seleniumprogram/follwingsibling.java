package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class follwingsibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	 Thread.sleep(2000);
	 
	 WebElement email=driver.findElement(By.xpath("//input[@id='name']//following-sibling::input[@id='email']"));
	 email.sendKeys("manoj12345@gmail.com");
	 
	 //precedingsibling
	 
	 WebElement name=driver.findElement(By.xpath("//input[@id='email']//preceding-sibling::input"));
	 name.sendKeys("manoj");
	}

}
