package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	
//		WebElement forgot=driver.findElement(By.linkText("Forgotten account?"));
//		forgot.click();
		
		WebElement forgot=driver.findElement(By.partialLinkText("Forgott"));
		forgot.click();
			
	}

}
