package seleniumUIprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhanding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();   // window maximize
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		//click the perticular checkbox or not
		
//		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
//		checkbox.click();
//		
		// find out the all checkboxes in the form
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(checkboxes.size());
		
		
		//click all checkboxes on the form
		
//		for(WebElement chbox:checkboxes)
//		{
//			chbox.click();
//		}
		// click two or more checkboxes at time or not
		
		for(WebElement chbox:checkboxes)
		{
			String s=chbox.getAttribute("id");
			if(s.equals("tuesday")||s.equals("saturday"))
			chbox.click();
		}
		}
		
		
		
	}


