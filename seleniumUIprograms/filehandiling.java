package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filehandiling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://trytestingthis.netlify.app/");
			Thread.sleep(2000);
			
			
			WebElement fileupload=driver.findElement(By.xpath("//input[@id='myfile']"));
			fileupload.sendKeys("C:\\Users\\admin\\Desktop\\xyz.txt");
			

	}

}
