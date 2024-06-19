package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
	 Thread.sleep(2000);
	
	 WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	 firstname.sendKeys("manoj");
	}

}
