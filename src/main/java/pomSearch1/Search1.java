package pomSearch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search1 {
public WebDriver driver=null;
//done
public String development="//a[@name=\"Development\"]"; 
public String QA="//a[@name=\"QA\"]";
public String DevOPs="//a[@name=\"DevOPs\"]";

	public Search1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getDevOps()
	{
		WebElement ele=driver.findElement(By.xpath(DevOPs));
	return ele;
	}
	
	public void clickDevOps()
	{
		try
		{
			getDevOps().click();
			Thread.sleep(2000);
			System.out.println( "Clicked on DevOps");
			driver.navigate().back();
		
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	public WebElement getDevelopment()
	{
		WebElement ele=driver.findElement(By.xpath(development));
	return ele;
	}
	

	public WebElement getQA()
	{
		WebElement ele=driver.findElement(By.xpath(QA));
	return ele;
	}

	public void clickDevelopment()
	{
		try
		{
			getDevelopment().click();
			Thread.sleep(2000);
			System.out.println( "Clicked on Development");
			driver.navigate().back();
		
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		}

	
	public void clickQA()
	{
		try
		{
			getQA().click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			System.out.println( "Clicked on QA");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		}
}
