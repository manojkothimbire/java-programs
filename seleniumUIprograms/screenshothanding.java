package seleniumUIprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshothanding {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

			 driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			
			screenshot("orangehrmloginpage2");

	}
	public static void screenshot(String name) throws IOException
	{
	File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\admin\\Desktop\\screenshot\\"+name+".png"));
	}

}
