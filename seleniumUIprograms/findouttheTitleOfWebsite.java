package seleniumUIprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findouttheTitleOfWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		
		String expectedtitle="OrangeHRM";
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(expectedtitle.equals(title))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
		driver.quit();
		
		
	}

}
