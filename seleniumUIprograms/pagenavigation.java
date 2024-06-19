package seleniumUIprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagenavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			
			//back
			
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
	}

}
