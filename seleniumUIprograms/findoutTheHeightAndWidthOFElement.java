package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findoutTheHeightAndWidthOFElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			
			WebElement googlesearchTextbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			Dimension d=googlesearchTextbox.getSize();
			System.out.println(d.getHeight());
			System.out.println(d.getWidth());
			
	}

}
