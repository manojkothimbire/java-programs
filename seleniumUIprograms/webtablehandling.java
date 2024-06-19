package seleniumUIprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		//window maximize
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	     Thread.sleep(2000);
	     //find out the rows in the table
	  int row= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	  System.out.println("row of table="+row);
	  
	     //find out the columns in the table
	  int column=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
	  System.out.println("columns of table="+column);
	  
	  
	  //fetch a perticular record from the table
	  String value =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]")).getText();
System.out.println(value);
	  
//fetch a all record from the table

for(int i=2;i<=row;i++)
{
	for(int j=1;j<=column;j++)
	{
		  String data =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
		  System.out.println(data);

	}
}

	
	}

}
