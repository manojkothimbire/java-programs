package locatorjune23;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
	
		
	WebElement username=driver.findElement(By.id("Username"));
	username.sendKeys("admin");
	Thread.sleep(2000);

	WebElement password=driver.findElement(By.name("Password"));
	password.sendKeys("admin123");
	Thread.sleep(2000);
	
	WebElement login=driver.findElement(By.name("Submit"));
	login.click();
	Thread.sleep(2000);
	

	
		ArrayList<String>tabvalue=new ArrayList();
		tabvalue.add("menu_admin_viewAdminModule");
		tabvalue.add("menu_pim_viewPimModule");
		tabvalue.add("menu_leave_viewLeaveModule");
		tabvalue.add("menu_time_viewTimeModule");
		tabvalue.add("menu_recruitment_viewRecruitmentModule");
		tabvalue.add("menu_pim_viewMyDetails");
		
		
		for(int i=0;i<=tabvalue.size();i++)
		{
			tablevalue(tabvalue.get(i)).click();
			Thread.sleep(2000);
		}

		driver.quit();
	}
	
	public static WebElement tablevalue(String value)
	{
		return driver.findElement(By.xpath("//a[@id='"+value+"']"));
		
	}
}
