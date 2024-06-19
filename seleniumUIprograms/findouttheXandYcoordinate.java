package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findouttheXandYcoordinate {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	WebElement googlesearchTextbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	Point p=googlesearchTextbox.getLocation();
	
	System.out.println(p.getX());
	System.out.println(p.getY());

	}

}
