package seleniumUIprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class seleniumwait {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\microsoftEdgedriver\\abc\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
			
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']"))).click();
	
	}

}
