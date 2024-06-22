package pomHome1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//done
public class Home1 {
public WebDriver driver=null;

public String First="fname"; 
public String Last="lname"; 
//PP added
	public Home1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFirtName()
	{
		WebElement ele=driver.findElement(By.id(First));
	return ele;
	}
	

	public WebElement getLastName()
	{
		WebElement ele=driver.findElement(By.id(Last));
	return ele;
	}

	public void sendLastName(String data)
	{
		try
		{
		getLastName().sendKeys(data);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		}

	
	public void sendFirstName(String data)
	{
		try
		{
		getFirtName().sendKeys(data);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		}
}
