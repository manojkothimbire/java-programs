package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementlocatedBytextfunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			    driver.get("https://demo.guru99.com/test/newtours/register.php");
			 Thread.sleep(2000);
			 
			 WebElement textfunction=driver.findElement(By.xpath("//a[text()='Car Rentals']"));
			 textfunction.click();
			 
			
	}

}
