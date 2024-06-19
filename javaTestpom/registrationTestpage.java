package javaTestpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Javapagespom.registration;

public class registrationTestpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();   // window maximize
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		registration rg=new registration(driver);
		rg.firstElement("manoj");
		Thread.sleep(2000);
		rg.LastElement("kumar");
		Thread.sleep(2000);
		rg.phoneElement("12345");
		Thread.sleep(2000);
		rg.email("manoj12345458@gmail.com");

	}

}
