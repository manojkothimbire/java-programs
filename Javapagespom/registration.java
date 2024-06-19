package Javapagespom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration {
	@FindBy(name="firstName")
	private WebElement FirstName;
	
	@FindBy(name="lastName")
	private WebElement LastName;
	
	@FindBy(name="phone")
	private WebElement Phone;
	
	@FindBy(id="userName")
	private WebElement Email;
	
	
	public void firstElement(String name)
	{
		FirstName.sendKeys(name);
	}
	public void LastElement(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	public void phoneElement(String ph)
	{
		Phone.sendKeys(ph);
	}
	public void email(String em)
	{
		Email.sendKeys(em);
	}
	
	
	
	
	public registration(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	

}
