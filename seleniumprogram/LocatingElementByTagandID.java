package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByTagandID {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	 Thread.sleep(2000);
	 
	 WebElement name=driver.findElement(By.cssSelector("input#name"));
	 name.sendKeys("manoj");
	}

}
