package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();   // window maximize
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		WebElement doubleck=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleck).perform(); 
		
		Thread.sleep(2000);
		WebElement rightck=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightck).perform();
	}

}
