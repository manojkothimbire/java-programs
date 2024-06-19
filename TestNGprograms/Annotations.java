package TestNGprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is before class annotations");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("this is after class annotations");

	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is before method annotations");

	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("this is after method annotations");

	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("this is before suite annotations");

	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("this is after suite annotations");

	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is before test annotations");

	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("this is after test annotations");

	}
	@Test
	public void test()
	{
		System.out.println("this is test annotations");

	}
	@BeforeGroups
	public void beforegroup()
	{
		System.out.println("this is before groups annotations");

	}
	@AfterGroups
	public void aftergroup()
	{
		System.out.println("this is after groups annotations");

	}
	

}
