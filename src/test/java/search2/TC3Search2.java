package search2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome1.Home1;
import pomSearch1.Search1;
//dd
public class TC3Search2 {
	public WebDriver driver = null;
//dd
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Test NG" + getClass());
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
//hello
	}

	@Test
	public void f() {
		// 11:30 to 11:55 - 25 
		try {
			driver.manage().window().maximize();
			Thread.sleep(2000);
		Search1 ss=new Search1(driver);
				ss.clickDevOps();
				} catch (Exception e) {

			System.out.println(e.getMessage());
			e.getStackTrace();
		}

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
