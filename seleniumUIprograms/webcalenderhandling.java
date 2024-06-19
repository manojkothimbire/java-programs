package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webcalenderhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		//window maximize
		driver.get("https://demoqa.com/automation-practice-form");
	     Thread.sleep(2000);
	     
	     
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,500)", " ");
	     
	     WebElement datepicker=driver.findElement(By.id("dateOfBirthInput"));
	     datepicker.click();
	     Thread.sleep(2000);
	     
	     WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
	     Select s=new Select(month);
	     s.selectByVisibleText("May");
	     
	     Thread.sleep(2000);
	     
	     WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
	     Select s1=new Select(year);
	     s1.selectByValue("2020");
	     
	     
	     
	     WebElement day=driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, May 26th, 2020' and text()='26']"));
	     day.click();
	     
	     
	    
	}

}
